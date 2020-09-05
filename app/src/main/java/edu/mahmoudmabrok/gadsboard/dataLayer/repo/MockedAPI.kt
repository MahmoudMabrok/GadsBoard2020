package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ
import io.reactivex.Single
import kotlin.random.Random

class MockedAPI : LeaderAPI {
    override fun loadTopLearner(): Single<List<TopLearner>> {
        return Single.just(
            listOf(
                createTopPlayer(),
                createTopPlayer(),
                createTopPlayer(),
                createTopPlayer(),
                createTopPlayer()
            )
        )
    }

    override fun loadTopLearnerIQ(): Single<List<TopLearnerIQ>> {
        return Single.just(
            listOf(
                createTopPlayerIQ(),
                createTopPlayerIQ(),
                createTopPlayerIQ(),
                createTopPlayerIQ()
            )
        )
    }

    override fun submit(): Single<Unit> = Single.just(Unit)
}

val randome = Random(4445)

fun createTopPlayer(name: String = "Mahmoud") = TopLearner(name, randome.nextInt(390), "aaaa", "")
fun createTopPlayerIQ() = TopLearnerIQ("Mahmoud", randome.nextInt(300), "aaaa", "")