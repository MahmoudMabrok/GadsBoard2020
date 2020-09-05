package edu.mahmoudmabrok.gadsboard.bases

import android.os.Bundle
import io.reactivex.SingleObserver
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import retrofit2.HttpException
import java.net.SocketException

abstract class DataLoadBase<T> : BaseFragment<T>() {

    val bag = CompositeDisposable()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadData()
    }

    abstract fun loadData()

    fun getObserver(): SingleObserver<T> {
        return object : SingleObserver<T> {
            override fun onSubscribe(d: Disposable) {
                bag.add(d)
                showLoading()
            }

            override fun onSuccess(t: T) {
                hideLoading()
                onSuccess(t)
            }

            override fun onError(e: Throwable) {
                hideLoading()
                val msg = when (e) {
                    is HttpException -> {
                        when (e.code()) {
                            0 -> "No Internet"
                            else -> "Invalid Operation"
                        }
                    }
                    is SocketException -> {
                        ""
                    }
                    else -> "Error"
                }
                onError(msg)
            }
        }
    }

    abstract fun onSuccess(data: T)
    abstract fun onError(error: String)
    abstract fun showLoading()
    abstract fun hideLoading()

    override fun onDestroy() {
        super.onDestroy()
        bag.clear()
    }
}