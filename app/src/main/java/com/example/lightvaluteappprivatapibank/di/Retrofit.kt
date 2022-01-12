package com.example.lightvaluteappprivatapibank.di

import com.example.lightvaluteappprivatapibank.api.model.ApiService
import com.example.lightvaluteappprivatapibank.ui.start.util.URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}