package com.example.pixabay

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaApi {
    @GET("api/")
    fun searchImage(
        @Query("q") keyWord: String,
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 3,
        @Query("key") key: String = "36832410-5c67378b1966d72c92ca89568",

        ): Call<PixabayModel>
}