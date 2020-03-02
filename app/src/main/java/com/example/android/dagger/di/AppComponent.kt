package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

/**
 * Created by hclee on 02/03/2020
 */

@Component(modules = [StorageModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance // With @BindsInstance, the Context passed in will be available in the graph
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    // Classes that can be injected by this component
    fun inject(activity: RegistrationActivity)
}