package edu.mahmoudmabrok.gadsboard.ui.submit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.mahmoudmabrok.gadsboard.R
import kotlinx.android.synthetic.main.activity_sbmit.*

class SbmitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sbmit)

        back?.setOnClickListener {
            onBackPressed()
        }
    }
}