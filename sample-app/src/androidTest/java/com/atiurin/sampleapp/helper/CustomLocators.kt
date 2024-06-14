package com.atiurin.sampleapp.helper

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

fun getSentMessageWithText(message: String): Matcher<View> {
    val message: Matcher<View> by lazy {
        Matchers.allOf(
            ViewMatchers.withId(R.id.card_view),
            ViewMatchers.hasDescendant(
                Matchers.allOf(
                    ViewMatchers.withId(R.id.message_text),
                    ViewMatchers.withText(message)
                )
            )
        )
    }
    return message
}
