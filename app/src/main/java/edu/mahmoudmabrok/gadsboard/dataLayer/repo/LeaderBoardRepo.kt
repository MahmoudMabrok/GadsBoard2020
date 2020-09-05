package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ
import io.reactivex.Single

class LeaderBoardRepo : LeaderAPI {
    private val api: LeaderAPI = MockedAPI()
    override fun loadTopLearner(): Single<List<TopLearner>> {
        return api.loadTopLearner()
    }

    override fun loadTopLearnerIQ(): Single<List<TopLearnerIQ>> {
        return api.loadTopLearnerIQ()
    }

    override fun submit(): Single<Unit> {
        return api.submit()
    }
}