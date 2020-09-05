package edu.mahmoudmabrok.gadsboard.ui.topHours

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.bases.BaseAdapter
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner

class TopLearnerAdapter : BaseAdapter<TopLearner>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopLearneerVH {
        return TopLearneerVH(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_learner, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TopLearneerVH).bind(dataSet[position])
    }

}