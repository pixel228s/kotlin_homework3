package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.ConstantData
import com.atiurin.sampleapp.steps.LandingPageSteps
import com.atiurin.sampleapp.steps.MainMenuSteps
import com.atiurin.sampleapp.steps.UiElementsPageSteps
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class UIElementsTests : BaseTest() {
    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        with(LandingPageSteps) {
            checkThatDashboardIsLoaded()
            clickOnMainMenu()
        }
        with(MainMenuSteps) {
            chooseMenuItem(ConstantData.UI_ELEMENTS_ITEM)
        }
    }

    @Test
    fun uiElementsPage_Test1() {
        with(UiElementsPageSteps) {
            validatingUiElementsPageIsDisplayed()
            uncheckingEnableButton()
            uncheckingClickableButton()
            validatingThatButtonIsNotClickable()
            validatingThatButtonIsNotEnabled()
            tapInvisibleRadioButton()
            validateButtonVisibility()
        }
    }

    @Test
    fun uiElementsPage_Test2() {
        with(UiElementsPageSteps) {
            validatingUiElementsPageIsDisplayed()
            clickingOnSimpleButtonNumberOfTimes(ConstantData.NUMBER_OF_CLICKS)
            checkingNumberOfClicks(ConstantData.NUMBER_OF_CLICKS)
            tapInvisibleRadioButton()
            validateButtonVisibility()
        }
    }
}
