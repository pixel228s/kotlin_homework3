package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.MainMenuPage
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object MainMenuSteps {
    fun chooseMenuItem(itemName: String) {
        with(MainMenuPage) {
            Assert.assertTrue(customClicksOption(itemName).isViewDisplayed())
            customClicksOption(itemName).tap()
        }
    }
}