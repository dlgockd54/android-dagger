package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import dagger.Module

/**
 * Created by hclee on 02/03/2020
 */

@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class])
class AppSubComponents