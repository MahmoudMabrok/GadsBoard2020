package edu.mahmoudmabrok.gadsboard.ui.dialogs

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import edu.mahmoudmabrok.gadsboard.R
import kotlinx.android.synthetic.main.check_submit.view.*

object Dialogs {


    @SuppressLint("InflateParams")
    fun yesDialog(ctx: Context, yesAction: (Unit) -> Unit) {
        val view = LayoutInflater.from(ctx).inflate(R.layout.check_submit, null)

        val builder = AlertDialog.Builder(ctx)
            .setView(view)
            .setCancelable(false)
            .create()

        view.imClose?.setOnClickListener {
            builder.dismiss()
        }
        view.btnYes?.setOnClickListener {
            yesAction.invoke(Unit)
            builder.dismiss()
        }
        builder.show()
    }

    @SuppressLint("InflateParams")
    fun stateDialog(ctx: Context, isSuccess: Boolean = true) {
        val resid = when (isSuccess) {
            true -> R.layout.success_submit
            else -> R.layout.fail_submit
        }

        val view = LayoutInflater.from(ctx).inflate(resid, null)

        val builder = AlertDialog.Builder(ctx)
            .setView(view)
            .create()
        builder.show()
    }
}