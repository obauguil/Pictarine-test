package com.pictarine.picflix.api

import com.pictarine.picflix.service.MovieService
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieDbApi {
    private const val BASE_URL = "https://api.themoviedb.org/3/"
    private const val ACCESS_TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjMWU0YjMyYWIzN2U1MDg2ZmU1YzA5NTIxYzBlNjdhNyIsInN1YiI6IjU2NTYzOTFlOTI1MTQxMDllODAwMDMyZSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.CnjFlQK6eKafVglC_aN3jx98dn9TD_SulgMz86RGohw"

    val api: MovieService by lazy {
        val httpClient = OkHttpClient.Builder()

        httpClient.addInterceptor { chain ->
            val request: Request = chain.request().newBuilder().addHeader("Authorization",
                "Bearer $ACCESS_TOKEN"
            ).build()
            chain.proceed(request)
        }

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
        retrofit.create(MovieService::class.java)
    }
}