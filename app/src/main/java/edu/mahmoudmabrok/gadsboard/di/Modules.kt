package edu.mahmoudmabrok.gadsboard.di

import com.google.gson.Gson
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val module = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://gadsapi.herokuapp.com/") // Sheet's public URL
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()
    }
}