package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/**
 * Created by hclee on 02/03/2020
 */

@Module
abstract class StorageModule {
    @Binds // Makes Dagger provide SharedPreferencesStorage when a Storage type is requested
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}