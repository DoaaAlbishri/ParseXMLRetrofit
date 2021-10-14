package com.example.parsexmlretrofit

import retrofit2.http.GET
import retrofit2.Call

interface FeedAPI {
    @get:GET("feeds")
    val feed: Call<Feed?>?

    companion object {
        const val BASE_URL = "https://stackoverflow.com/"
    }
}
