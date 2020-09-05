package edu.mahmoudmabrok.gadsboard.ui.topIQ

import android.view.View
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.bases.BaseViewHolder
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ
import kotlinx.android.synthetic.main.item_learner.view.*

class TopLearneerIQVH(itemView: View) : BaseViewHolder<TopLearnerIQ>(itemView) {

    override fun bind(item: TopLearnerIQ) {
        super.bind(item)
        itemView.tvLearnerName.text = item.name
        itemView.tvLearnerInfo.text =
            itemView.context.getString(R.string.learningIQ, item.score, item.country)
    }
}