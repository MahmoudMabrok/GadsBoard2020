package edu.mahmoudmabrok.gadsboard.bases

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter <T> : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    protected val dataSet = mutableListOf<T>()

    fun clear(){
        dataSet.clear()
        notifyDataSetChanged()
    }

    fun updateDataSet(newData:List<T> ,setAll:Boolean = false){
        if (setAll)
            dataSet.clear()
        dataSet.addAll(newData)
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int = dataSet.size

}