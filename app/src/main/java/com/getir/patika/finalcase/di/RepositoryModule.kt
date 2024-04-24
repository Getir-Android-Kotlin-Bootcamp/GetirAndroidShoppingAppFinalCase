package com.getir.patika.finalcase.di

import com.getir.patika.finalcase.data.remote.ApiService
import com.getir.patika.finalcase.domain.repository.ProductsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    fun providesProductRepository(
        apiService: ApiService,
        @IoDispatcher ioDispatcher: CoroutineDispatcher)=ProductsRepository(apiService,ioDispatcher)
}