package com.getir.patika.finalcase.domain.model

data class SuggestedProductsItem(
    val id: String,
    val name: String,
    val products: List<ProductX>
)