package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.LoginPage
import com.atiurin.sampleapp.steps.LoginPageSteps
import org.junit.Before
import org.junit.Rule

abstract class MyBaseTest {
    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUpLogin() {
        if (LoginPage.userNameField.isViewDisplayed()) {
            with(LoginPageSteps) {
                typeInUsername()
                typeInPassword()
                clickLoginButton()
            }
        }
    }
}
