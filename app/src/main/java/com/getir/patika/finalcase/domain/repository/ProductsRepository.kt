package com.getir.patika.finalcase.domain.repository

import com.getir.patika.finalcase.data.remote.ApiService
import com.getir.patika.finalcase.data.remote.CallBack
import com.getir.patika.finalcase.di.IoDispatcher
import com.getir.patika.finalcase.domain.model.BaseResponse
import com.getir.patika.finalcase.domain.model.ProductsVertical
import com.getir.patika.finalcase.domain.model.SuggestedProductsItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import java.util.concurrent.Flow
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class ProductsRepository @Inject constructor(
    private val apiService: ApiService,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
){
    fun getAllBeverages(): kotlinx.coroutines.flow.Flow<BaseResponse<ArrayList<ProductsVertical>>> = callbackFlow {
        apiService.getAllBeverages().enqueue(CallBack(this.channel))
    }.flowOn(ioDispatcher)

    fun getSuggestedProducts(): kotlinx.coroutines.flow.Flow<BaseResponse<List<SuggestedProductsItem>>> = callbackFlow {
        apiService.getSuggestedProducts().enqueue(CallBack(this.channel))
    }.flowOn(ioDispatcher)

}