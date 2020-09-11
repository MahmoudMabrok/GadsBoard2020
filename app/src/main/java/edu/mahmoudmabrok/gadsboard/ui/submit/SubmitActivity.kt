package edu.mahmoudmabrok.gadsboard.ui.submit

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.ui.dialogs.Dialogs
import kotlinx.android.synthetic.main.activity_sbmit.*


class SubmitActivity : AppCompatActivity() {
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
                Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show()
            }
        }

    }
}