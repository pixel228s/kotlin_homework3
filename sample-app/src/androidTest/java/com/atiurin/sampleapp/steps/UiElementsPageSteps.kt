package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.waitForViewVisible
import com.atiurin.sampleapp.pages.UiElementsPage
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.isNotClickable
import com.atiurin.ultron.extensions.isNotDisplayed
import com.atiurin.ultron.extensions.isNotEnabled
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object UiElementsPageSteps {

    fun validatingUiElementsPageIsDisplayed() {
        with(UiElementsPage) {
            clickableCheckbox.isDisplayed()
            enableCheckbox.isDisplayed()
        }
    }

    fun uncheckingEnableButton() {
        UiElementsPage.enableCheckbox.tap()
    }

    fun uncheckingClickableButton() {
        UiElementsPage.clickableCheckbox.tap()
    }

    fun validatingThatButtonIsNotClickable() {
        UiElementsPage.simpleButton.isNotClickable()
    }

    fun validatingThatButtonIsNotEnabled() {
        UiElementsPage.simpleButton.isNotEnabled()
    }

    fun tapInvisibleRadioButton() {
        UiElementsPage.invisibleRadio.tap()
    }

    fun validateButtonVisibility() {
        UiElementsPage.simpleButton.isNotDisplayed()
    }

    fun clickingOnSimpleButtonNumberOfTimes(number: Int) {
        with(UiElementsPage) {
            simpleButton.waitForViewVisible(7)
            repeat(number) {
                simpleButton.tap()
            }
        }
    }

    fun checkingNumberOfClicks(number: Int) {
        val info = UiElementsPage.clickNumber.getText().substringAfterLast(' ').toInt()
        Assert.assertEquals(info, number)
    }
}
