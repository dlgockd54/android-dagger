package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

/**
 * Created by hclee on 2020-03-02.
 */

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}