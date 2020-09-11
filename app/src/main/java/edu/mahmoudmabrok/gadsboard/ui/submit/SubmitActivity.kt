package edu.mahmoudmabrok.gadsboard.ui.submit

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import edu.mahmoudmabrok.gadsboard.R
import kotlinx.android.synthetic.main.activity_sbmit.*


class SubmitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sbmit)
        back?.setOnClickListener {
            onBackPressed()
        }

        // make it full screen
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        // make status ba transparent so it display  background
        window.statusBarColor = Color.TRANSPARENT
    }
}