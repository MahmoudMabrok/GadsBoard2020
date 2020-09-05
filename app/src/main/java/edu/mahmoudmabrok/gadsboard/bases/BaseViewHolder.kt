package edu.mahmoudmabrok.gadsboard.bases

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var data: T? = null

    open fun bind(item: T) {
        data = item
    }
}