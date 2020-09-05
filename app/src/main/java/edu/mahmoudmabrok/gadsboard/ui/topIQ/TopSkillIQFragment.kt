package edu.mahmoudmabrok.gadsboard.ui.topIQ

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.bases.DataLoadBase
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ
import edu.mahmoudmabrok.gadsboard.dataLayer.repo.LeaderBoardRepo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_top_skill_i_q.*
import org.koin.android.ext.android.inject

class TopSkillIQFragment : DataLoadBase<List<TopLearnerIQ>>() {
    val repo: LeaderBoardRepo by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_skill_i_q, container, false)
    }

    override fun loadData() {
        repo.loadTopLearnerIQ()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(getObserver())
    }


    override fun onError(error: String) {
        Toast.makeText(requireContext(), getString(R.string.internet_error), Toast.LENGTH_SHORT)
            .show()
    }

    override fun showLoading() {}

    override fun hideLoading() {}
    override fun onSuccessDo(data: List<TopLearnerIQ>) {
        Log.d("APP", "size ${data.size}")
        val adapter = TopLearnerIQAdapter()
        rvLearnersIQ?.adapter = adapter

        adapter.updateDataSet(data)
    }

}