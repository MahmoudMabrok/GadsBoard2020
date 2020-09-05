package edu.mahmoudmabrok.gadsboard.bases

import android.os.Bundle

abstract class DataLoadBase<T> : BaseFragment<T>() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadData()
    }

    abstract fun loadData()
}