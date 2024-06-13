package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.LandingPage
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object LandingPageSteps {

    fun checkThatDashboardIsLoaded() {
        Assert.assertTrue(LandingPage.friendsChatContainer.isViewDisplayed())
    }

    fun openChatWithMyFriend(friendsName: String) {
        LandingPage.findFriend(friendsName).tap()
    }

    fun clickOnMainMenu() {
        LandingPage.mainManuBtn.tap()
    }

}