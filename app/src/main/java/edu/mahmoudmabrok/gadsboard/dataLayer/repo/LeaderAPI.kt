package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.LearningResponses
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.SkillIQResponses
import io.reactivex.Single
import retrofit2.http.*

interface LeaderAPI {

    @GET("api/hours")
    fun loadTopLearner(): Single<LearningResponses>

    @GET("api/skilliq")
    fun loadTopLearnerIQ(): Single<SkillIQResponses>

    @POST
    @FormUrlEncoded
    fun submit(
        @Url newBase: String = "https://docs.google.com/forms/d/e/1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse",
        @Field("entry.1877115667")
        firstName: String,
        @Field("entry.2006916086")
        lastName: String,
        @Field("entry.1824927963")
        emailtName: String,
        @Field("entry.284483984")
        link: String
    ): Single<Unit>
}


