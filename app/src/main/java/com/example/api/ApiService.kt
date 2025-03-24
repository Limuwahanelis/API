package com.example.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// responsible for preparing endpoint and adding json converter
private  val retrofit = Retrofit.Builder().baseUrl("www.themealdb.com/api/json/v1/1/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

// create method adds access to service methods e.g getCategories
private val recipeService= retrofit.create(ApiService::class.java);
interface ApiService {
    @GET("categories.php") // allows http request, in "" is end point
    suspend fun  getCategories():CategoriesResponse // suspend is like async


}