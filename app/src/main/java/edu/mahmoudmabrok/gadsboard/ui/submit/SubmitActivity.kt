package edu.mahmoudmabrok.gadsboard.ui.submit

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.Submit
import edu.mahmoudmabrok.gadsboard.dataLayer.repo.LeaderBoardRepo
import edu.mahmoudmabrok.gadsboard.ui.dialogs.Dialogs
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_sbmit.*
import kotlinx.android.synthetic.main.activity_sbmit.view.*
import org.koin.android.ext.android.inject


class SubmitActivity : AppCompatActivity() {

    val repo: LeaderBoardRepo by inject()

    val bag = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sbmit)

        // make it full screen
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        // make status ba transparent so it display  background
        window.statusBarColor = Color.TRANSPARENT


        back?.setOnClickListener {
            onBackPressed()
        }

        btnSubmit?.setOnClickListener {
            Dialogs.yesDialog(this) {
                doOnValidate {
                    upload()
                }
            }
        }

    }

    private fun doOnValidate(upload: (Unit) -> Unit) {
        val inputs = listOf(
            editTextTextPersonName, editTextTextPersonName2,
            edEmail.edGithubLink
        )

        val nonValid = inputs.filter { it.text.toString().isNullOrEmpty() }

        if (nonValid.isEmpty())
            upload.invoke(Unit)
        else
            nonValid.forEach {
                it.error = "Field can not be empty"
            }
    }

    private fun upload() {
        repo.submit(Submit("", "", "", ""))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Dialogs.stateDialog(this)
            }, {
                Dialogs.stateDialog(this, false)
            }).apply {
                bag.add(this)
            }
    }

    override fun onDestroy() {
        super.onDestroy()
        bag.clear()
    }
}