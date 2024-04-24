package com.getir.patika.finalcase.data.remote

import com.getir.patika.finalcase.domain.model.Product
import com.getir.patika.finalcase.domain.model.ProductsVertical
import com.getir.patika.finalcase.domain.model.SuggestedProductsItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("BeveragePacks")
    fun getAllBeverages():Call<ArrayList<ProductsVertical>>

    @GET("SuggestedProducts")
    fun getSuggestedProducts():Call<List<SuggestedProductsItem>>


}