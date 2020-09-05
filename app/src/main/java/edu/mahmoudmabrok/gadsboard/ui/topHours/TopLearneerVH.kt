package edu.mahmoudmabrok.gadsboard.ui.topHours

import android.view.View
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.bases.BaseViewHolder
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import kotlinx.android.synthetic.main.item_learner.view.*

class TopLearneerVH(itemView: View) : BaseViewHolder<TopLearner>(itemView) {

    override fun bind(item: TopLearner) {
        super.bind(item)
        itemView.tvLearnerName.text = item.name
        itemView.tvLearnerInfo.text =
            itemView.context.getString(R.string.learningHours, item.hours, item.country)
    }
}