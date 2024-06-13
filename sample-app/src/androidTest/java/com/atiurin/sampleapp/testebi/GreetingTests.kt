package com.atiurin.sampleapp.testebi

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.Steps.CustomClicksSteps
import com.atiurin.sampleapp.Steps.FriendsChatSteps
import com.atiurin.sampleapp.Steps.LandingPageSteps
import com.atiurin.sampleapp.Steps.MainMenuSteps
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.ConstantData
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class GreetingTests : BaseTest() {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testingTextingFunctional(){
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
    fun testingClicksFunctional(){
        with(LandingPageSteps) {
            checkThatDashboardIsLoaded()
            clickOnMainMenu()
        }
        with(MainMenuSteps){
            chooseMenuItem(ConstantData.customClicksItem)
        }
        with(CustomClicksSteps){
            checkThatCustomClicksPageIsLoaded()
            markingCornerCircles()
            validateAllCornerCirclesAreChecked()
        }
    }
}