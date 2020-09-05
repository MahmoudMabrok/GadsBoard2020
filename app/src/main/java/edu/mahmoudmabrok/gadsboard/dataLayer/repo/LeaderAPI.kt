package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.LearningResponses
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.SkillIQResponses
import io.reactivex.Single
import retrofit2.http.GET

interface LeaderAPI {

    @GET("api/hours")
    fun loadTopLearner(): Single<LearningResponses>

    @GET("api/skilliq")
    fun loadTopLearnerIQ(): Single<SkillIQResponses>

    fun submit(): Single<Unit>
}