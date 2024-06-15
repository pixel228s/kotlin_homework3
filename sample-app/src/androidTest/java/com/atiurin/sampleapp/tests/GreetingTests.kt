package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.data.ConstantData
import com.atiurin.sampleapp.steps.CustomClicksSteps
import com.atiurin.sampleapp.steps.FriendsChatSteps
import com.atiurin.sampleapp.steps.LandingPageSteps
import com.atiurin.sampleapp.steps.MainMenuSteps
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class GreetingTests : BaseTest() {
    @Test
    fun testingTextingFunctional() {
        with(LandingPageSteps) {
            checkThatDashboardIsLoaded()
            openChatWithMyFriend(ConstantData.friendsName)
        }

        with(FriendsChatSteps) {
            checkThatChatIsOpen(ConstantData.friendsName)
            enterMessage(ConstantData.messageText)
            sendAMessage()
            validateSentMessage(ConstantData.messageText)
        }
    }

    @Test
    fun testingClicksFunctional() {
        with(LandingPageSteps) {
            checkThatDashboardIsLoaded()
            clickOnMainMenu()
        }
        with(MainMenuSteps) {
            chooseMenuItem(ConstantData.customClicksItem)
        }
        with(CustomClicksSteps) {
            checkThatCustomClicksPageIsLoaded()
            markingCornerCircles()
            validateAllCornerCirclesAreChecked()
        }
    }
}
