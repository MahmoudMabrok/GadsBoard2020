package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ

class LeaderBoardRepo : LeaderAPI {
    private val api: LeaderAPI = MockedAPI()
    override fun loadTopLearner(): List<TopLearner> {
        return api.loadTopLearner()
    }

    override fun loadTopLearnerIQ(): List<TopLearnerIQ> {
        return api.loadTopLearnerIQ()
    }

    override fun submit(): Boolean {
        return api.submit()
    }
}