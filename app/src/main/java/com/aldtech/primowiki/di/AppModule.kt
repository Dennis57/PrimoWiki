package com.aldtech.primowiki.di

import com.aldtech.primowiki.data.remote.PrimoWikiApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePrimoWikiApi(): PrimoWikiApi {
        return Retrofit.Builder()
            .baseUrl("https://genshin.jmp.blue/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }
}