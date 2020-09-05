package edu.mahmoudmabrok.gadsboard.di

import com.google.gson.Gson
import edu.mahmoudmabrok.gadsboard.dataLayer.repo.LeaderAPI
import edu.mahmoudmabrok.gadsboard.dataLayer.repo.LeaderBoardRepo
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val module = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://gadsapi.herokuapp.com/") // Sheet's public URL
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    single {
        get<Retrofit>().create(LeaderAPI::class.java)
    }

    single {
        LeaderBoardRepo(get())
    }
}