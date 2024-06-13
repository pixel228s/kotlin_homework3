package com.atiurin.sampleapp.Steps

import com.atiurin.sampleapp.Pagess.CustomClicksPage
import com.atiurin.sampleapp.helper.assertIsViewDisplayed
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.tap

import org.junit.Assert

object CustomClicksSteps {

    fun checkThatCustomClicksPageIsLoaded(){
        CustomClicksPage.cornersCube.assertIsViewDisplayed()
    }

    fun markingCornerCircles(){
        for(button in CustomClicksPage.buttonsInCorners){
            button.tap(5)
        }
    }

    fun validateAllCornerCirclesAreChecked(){
        for (btn in CustomClicksPage.buttonsInCorners) {
            Assert.assertTrue(btn.isChecked(5))
        }
    }
}