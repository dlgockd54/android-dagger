package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Created by hclee on 02/03/2020
 */

@Singleton
@Component(modules = [StorageModule::class, AppSubComponents::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance // With @BindsInstance, the Context passed in will be available in the graph
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    // Classes that can be injected by this component
    fun inject(activity: MainActivity)

    // Expose RegistrationComponent builder from the graph
    fun registrationComponent(): RegistrationComponent.Builder

    fun loginComponent(): LoginComponent.Builder
}