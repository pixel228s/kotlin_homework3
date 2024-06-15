package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.data.ConstantData
import com.atiurin.sampleapp.steps.LandingPageSteps
import com.atiurin.sampleapp.steps.MainMenuSteps
import com.atiurin.sampleapp.steps.UiElementsPageSteps
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class UIElementsTests : BaseTest() {
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

    @After
    fun commonValidation() {
        with(UiElementsPageSteps) {
            tapInvisibleRadioButton()
            validateButtonVisibility()
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
        }
    }

    @Test
    fun uiElementsPage_Test2() {
        with(UiElementsPageSteps) {
            validatingUiElementsPageIsDisplayed()
            clickingOnSimpleButtonNumberOfTimes(ConstantData.NUMBER_OF_CLICKS)
            checkingNumberOfClicks(ConstantData.NUMBER_OF_CLICKS)
        }
    }
}
