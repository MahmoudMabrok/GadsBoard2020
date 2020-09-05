package edu.mahmoudmabrok.gadsboard.ui.topHours

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.dataLayer.repo.LeaderBoardRepo


class TopLearnerFragment : Fragment() {
    val repo by lazy { LeaderBoardRepo() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_learner, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}