package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.data.Credentials
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.LoginPage
import com.atiurin.ultron.extensions.tap

object LoginPageSteps {
    private val Credentials = Credentials()
    fun typeInUsername() {
        LoginPage.userNameField.typeText(Credentials.getUsername())
    }

    fun typeInPassword() {
        LoginPage.passwordField.typeText(Credentials.getPassword())
    }

    fun clickLoginButton() {
        LoginPage.loginButton.tap()
    }
}
