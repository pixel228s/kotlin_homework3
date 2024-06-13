package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MainMenuPage {
    fun customClicksOption(option: String): Matcher<View> {
        val option: Matcher<View> by lazy {
            Matchers.allOf(withId(R.id.design_menu_item_text), withText(option))
        }
        return option
    }
}
