package com.example.android.dagger.registration

import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

/**
 * Created by hclee on 02/03/2020
 */

@Subcomponent
interface RegistrationComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): RegistrationComponent
    }

    fun inject(activity: RegistrationActivity)

    fun inject(fragment: EnterDetailsFragment)

    fun inject(fragment: TermsAndConditionsFragment)
}