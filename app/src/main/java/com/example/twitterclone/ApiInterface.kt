package com.example.twitterclone

import com.example.twitterclone.ui.home.MyData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiInterface {

    @Headers(
        "X-RapidAPI-Key:a47e407b09msh83ff656c8f203c5p138204jsn7e8535674dab",
        "X-RapidAPI-Host:twitter154.p.rapidapi.com"
    )

    @GET("tweets?list_id=1591033111726391297&limit=40")
    fun getData(): Call<MyData>
}