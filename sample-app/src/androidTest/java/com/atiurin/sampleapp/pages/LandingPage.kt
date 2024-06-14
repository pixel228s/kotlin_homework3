package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

object LandingPage {
    val friendsChatContainer: Matcher<View> by lazy { withId(R.id.recycler_friends) }
    val mainManuBtn: Matcher<View> by lazy { withContentDescription("Open navigation drawer") }
    fun findFriend(name: String): Matcher<View> {
        val friend: Matcher<View> by lazy { allOf(withId(R.id.tv_name), withText(name)) }
        return friend
    }
}
