package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.LearningResponses
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.SkillIQResponses
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.Submit
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Url

interface LeaderAPI {

    @GET("api/hours")
    fun loadTopLearner(): Single<LearningResponses>

    @GET("api/skilliq")
    fun loadTopLearnerIQ(): Single<SkillIQResponses>

    @POST("")
    fun submit(
        @Url newBase: String = "https://docs.google.com/forms/d/e/1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse",
        @Body body: Submit
    ): Single<Unit>
}