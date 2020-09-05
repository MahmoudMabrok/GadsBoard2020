package edu.mahmoudmabrok.gadsboard.dataLayer.repo

import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearner
import edu.mahmoudmabrok.gadsboard.dataLayer.mdoel.TopLearnerIQ

interface LeaderAPI {

    fun loadTopLearner():List<TopLearner>
    fun loadTopLearnerIQ():List<TopLearnerIQ>

    fun submit():Boolean
}