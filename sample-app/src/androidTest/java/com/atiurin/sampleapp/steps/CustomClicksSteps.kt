package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.assertIsViewDisplayed
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object CustomClicksSteps {

    fun checkThatCustomClicksPageIsLoaded() {
        CustomClicksPage.cornersCube.assertIsViewDisplayed()
    }

    fun markingCornerCircles() {
        for (button in CustomClicksPage.buttonsInCorners) {
            button.tap()
        }
    }

    fun validateAllCornerCirclesAreChecked() {
        for (btn in CustomClicksPage.buttonsInCorners) {
            Assert.assertTrue(btn.isChecked(5))
        }
    }
}
