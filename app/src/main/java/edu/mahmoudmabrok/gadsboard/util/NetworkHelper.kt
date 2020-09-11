package edu.mahmoudmabrok.gadsboard.util

import android.content.Context
import android.net.ConnectivityManager


object NetworkHelper {
    fun isConnected(context: Context): Boolean {
        val manager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = manager.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnected
    }

}