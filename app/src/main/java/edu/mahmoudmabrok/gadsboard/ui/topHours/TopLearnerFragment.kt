package edu.mahmoudmabrok.gadsboard.ui.topHours

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import edu.mahmoudmabrok.gadsboard.R
import edu.mahmoudmabrok.gadsboard.bases.DataLoadBase
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.repo.LeaderBoardRepo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_top_learner.*
import org.koin.android.ext.android.inject


class TopLearnerFragment : DataLoadBase<List<TopLearner>>() {
    val repo: LeaderBoardRepo by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_learner, container, false)
    }

    override fun loadData() {
        repo.loadTopLearner()
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
    override fun onSuccessDo(data: List<TopLearner>) {
        val adapter = TopLearnerAdapter()
        rvLearners?.adapter = adapter

        adapter.updateDataSet(data)
    }

}