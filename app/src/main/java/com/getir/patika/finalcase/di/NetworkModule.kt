package com.getir.patika.finalcase.di

import com.getir.patika.finalcase.BuildConfig
import com.getir.patika.finalcase.data.remote.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Provides
    @Singleton
    fun provideLogginInterceptor():HttpLoggingInterceptor{
        val logging= HttpLoggingInterceptor()
        logging.level = if(BuildConfig.DEBUG)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return logging
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor):OkHttpClient{
        OkHttpClient.Builder().apply {
            callTimeout(40,TimeUnit.SECONDS)
            connectTimeout(40,TimeUnit.SECONDS)
            readTimeout(40,TimeUnit.SECONDS)
            addInterceptor(httpLoggingInterceptor)
            return build()
        }
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit{
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("")
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit):ApiService{
        return retrofit.create(ApiService::class.java)
    }
}