package com.getir.patika.finalcase.domain.model

data class ProductsVerticalItem(
    val email: String,
    val id: String,
    val name: String,
    val password: String,
    val productCount: Int,
    val products: List<Product>
)