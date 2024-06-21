package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.data.ConstantData
import com.atiurin.sampleapp.helper.FriendsNameNotFoundInContactsException
import com.atiurin.sampleapp.helper.isViewCompletelyDisplayed
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.swipeDown
import com.atiurin.sampleapp.pages.LandingPage
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object LandingPageSteps {

    fun checkThatDashboardIsLoaded() {
        Assert.assertTrue(LandingPage.friendsChatContainer.isViewDisplayed())
    }

    fun scrollingToFriendsChat(friendsName: String) {
        var i = 0
        val maxScrolls = 13
        while (!LandingPage.findFriend(friendsName).isViewCompletelyDisplayed() && i <= maxScrolls) {
            swipeDown()
            i++
        }
        if (i > maxScrolls) {
            throw FriendsNameNotFoundInContactsException(ConstantData.FRIEND_NOT_FOUND_MESSAGE)
        }
    }

    fun openChatWithMyFriend(friendsName: String) {
        LandingPage.findFriend(friendsName).tap()
    }

    fun clickOnMainMenu() {
        LandingPage.mainManuBtn.tap()
    }
}
