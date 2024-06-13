package com.atiurin.sampleapp.Steps

import com.atiurin.sampleapp.Pagess.LandingPage
import com.atiurin.sampleapp.helper.assertIsViewDisplayed
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.tap

object LandingPageSteps {

    fun checkThatDashboardIsLoaded(){
        LandingPage.friendsChatContainer.assertIsViewDisplayed()
    }

    fun openChatWithMyFriend(friendsName : String){
        LandingPage.findFriend(friendsName).click()
    }

    fun clickOnMainMenu(){
        LandingPage.mainManuBtn.tap()
    }

}