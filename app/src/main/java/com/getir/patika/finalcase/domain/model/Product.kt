package com.getir.patika.finalcase.domain.model

data class Product(
    val attribute: String,
    val id: String,
    val imageURL: String,
    val name: String,
    val price: Double,
    val priceText: String,
    val shortDescription: String,
    val thumbnailURL: String
)