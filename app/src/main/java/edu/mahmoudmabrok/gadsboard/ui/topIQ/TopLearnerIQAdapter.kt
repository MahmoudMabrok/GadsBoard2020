package edu.mahmoudmabrok.gadsboard.ui.topIQ

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.bases.BaseAdapter
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ

class TopLearnerIQAdapter : BaseAdapter<TopLearnerIQ>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopLearneerIQVH {
        return TopLearneerIQVH(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_learner, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TopLearneerIQVH).bind(dataSet[position])
    }

}