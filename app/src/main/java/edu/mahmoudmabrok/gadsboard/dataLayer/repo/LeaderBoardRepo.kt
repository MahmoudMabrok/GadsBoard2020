package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ
import io.reactivex.Single
import org.koin.core.KoinComponent

class LeaderBoardRepo(private val api: LeaderAPI) : KoinComponent {

    fun loadTopLearner(): Single<List<TopLearner>> {
        return api.loadTopLearner().map {
            mutableListOf<TopLearner>().apply {
                addAll(it.map { it })
            }.toList()
        }
    }

    fun loadTopLearnerIQ(): Single<List<TopLearnerIQ>> {
        return api.loadTopLearnerIQ().map {
            mutableListOf<TopLearnerIQ>().apply {
                addAll(it.map { it })
            }.toList()
        }
    }

    fun submit(): Single<Unit> {
        return api.submit()
    }
}