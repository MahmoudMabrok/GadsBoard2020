package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ
import kotlin.random.Random

class MockedAPI: LeaderAPI {
    override fun loadTopLearner(): List<TopLearner> {
       return listOf(
           createTopPlayer(),
           createTopPlayer(),
           createTopPlayer(),
           createTopPlayer(),
           createTopPlayer()
       )
    }

    override fun loadTopLearnerIQ(): List<TopLearnerIQ> {
        return listOf(
            createTopPlayerIQ(),
            createTopPlayerIQ(),
            createTopPlayerIQ(),
            createTopPlayerIQ()
        )
    }

    override fun submit() = true
}
val randome = Random(4445)

fun createTopPlayer(name: String = "Mahmoud") = TopLearner(name, "${randome.nextInt(390)} Hour")
fun createTopPlayerIQ() = TopLearnerIQ( "Mahmoud", "${randome.nextInt(301)} IQ")