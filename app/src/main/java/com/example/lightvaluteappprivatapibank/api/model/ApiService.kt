package com.example.lightvaluteappprivatapibank.api.model

import com.example.lightvaluteappprivatapibank.api.model.beznal.BeznalItem
import com.example.lightvaluteappprivatapibank.api.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoney(): Response<NalichkaItem>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoney(): Response<BeznalItem>
}