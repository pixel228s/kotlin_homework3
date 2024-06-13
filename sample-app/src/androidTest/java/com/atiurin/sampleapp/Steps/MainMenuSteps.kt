package com.atiurin.sampleapp.Steps

import com.atiurin.sampleapp.Pagess.MainMenuPage
import com.atiurin.sampleapp.helper.assertIsViewDisplayed
import com.atiurin.ultron.extensions.tap

object MainMenuSteps {

    fun chooseMenuItem(itemName :String){
        with(MainMenuPage){
            customClicksOption(itemName).assertIsViewDisplayed()
            customClicksOption(itemName).tap()
        }
    }
}