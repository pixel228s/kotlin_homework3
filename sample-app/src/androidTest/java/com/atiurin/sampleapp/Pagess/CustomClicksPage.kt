package com.atiurin.sampleapp.Pagess

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.hasDescendant
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

object CustomClicksPage {
    val cornersCube: Matcher<View> by lazy {withId(R.id.imageView)}
    val buttonsInCorners: List<Matcher<View>> by lazy {
        listOf(
            withId(R.id.rB_top_left),
            withId(R.id.rB_top_right),
            withId(R.id.rB_bottom_left),
            withId(R.id.rB_bottom_right)
        )
    }
}