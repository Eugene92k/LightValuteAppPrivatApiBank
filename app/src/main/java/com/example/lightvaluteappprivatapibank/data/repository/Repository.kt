package com.example.lightvaluteappprivatapibank.data.repository

import com.example.lightvaluteappprivatapibank.api.model.beznal.Beznal
import com.example.lightvaluteappprivatapibank.api.model.nal.Nalichka
import com.example.lightvaluteappprivatapibank.di.Retrofit
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka> {
        return Retrofit.api.getNalMoney()
    }

    suspend fun getBeznal(): Response<Beznal> {
        return Retrofit.api.getBeznalMoney()
    }
}