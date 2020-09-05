package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ
import io.reactivex.Single

interface LeaderAPI {

    fun loadTopLearner(): Single<List<TopLearner>>
    fun loadTopLearnerIQ(): Single<List<TopLearnerIQ>>

    fun submit(): Single<Unit>
}