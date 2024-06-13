package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.helper.getSentMessageWithText
import org.hamcrest.Matcher

object FriendsChatPage {

    val toolbarTitle: Matcher<View> by lazy { withId(R.id.toolbar_title) }
    val messageTextField: Matcher<View> by lazy { withId(R.id.message_input_text) }
    val sendMessageBtn: Matcher<View> by lazy { withId(R.id.send_button) }
    fun getSentMessage(message: String): Matcher<View> {
        return getSentMessageWithText(message)
    }
}
