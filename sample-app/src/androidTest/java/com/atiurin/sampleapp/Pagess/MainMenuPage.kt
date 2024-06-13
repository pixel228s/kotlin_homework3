package com.atiurin.sampleapp.Pagess

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MainMenuPage {

    fun customClicksOption(option: String): Matcher<View> {
        return Matchers.allOf(withId(R.id.design_menu_item_text), withText(option))
    }

}