package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object UiElementsPage {
    val enableCheckbox: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_enable) }
    val clickableCheckbox: Matcher<View> by lazy { ViewMatchers.withId(R.id.checkbox_clickable) }
    val simpleButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.button1) }
    val invisibleRadio: Matcher<View> by lazy { ViewMatchers.withId(R.id.radio_invisible) }
    val clickNumber: Matcher<View> by lazy { ViewMatchers.withId(R.id.last_event_status) }
}
