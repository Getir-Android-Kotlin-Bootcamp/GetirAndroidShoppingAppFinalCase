package com.getir.patika.finalcase.domain.usecase

import com.getir.patika.finalcase.domain.model.BaseResponse
import com.getir.patika.finalcase.common.domain.NoParaMeterUseCase
import com.getir.patika.finalcase.domain.model.ProductsVertical
import com.getir.patika.finalcase.domain.repository.ProductsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class VerticalProductsUseCase @Inject constructor(
    private val productsRepository: ProductsRepository
):NoParaMeterUseCase<kotlinx.coroutines.flow.Flow<BaseResponse<ArrayList<ProductsVertical>>>> {
    override fun execute(): Flow<BaseResponse<ArrayList<ProductsVertical>>> = productsRepository.getAllBeverages()
}