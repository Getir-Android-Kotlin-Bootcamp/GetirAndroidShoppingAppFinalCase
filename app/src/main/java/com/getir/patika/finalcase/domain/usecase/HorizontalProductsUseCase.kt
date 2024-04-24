package com.getir.patika.finalcase.domain.usecase

import com.getir.patika.finalcase.domain.model.BaseResponse
import com.getir.patika.finalcase.common.domain.NoParaMeterUseCase
import com.getir.patika.finalcase.domain.model.ProductsVertical
import com.getir.patika.finalcase.domain.model.SuggestedProductsItem
import com.getir.patika.finalcase.domain.repository.ProductsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HorizontalProductsUseCase @Inject constructor(
    private val productsRepository: ProductsRepository
):NoParaMeterUseCase<kotlinx.coroutines.flow.Flow<BaseResponse<List<SuggestedProductsItem>>>> {
    override fun execute(): Flow<BaseResponse<List<SuggestedProductsItem>>> = productsRepository.getSuggestedProducts()
}