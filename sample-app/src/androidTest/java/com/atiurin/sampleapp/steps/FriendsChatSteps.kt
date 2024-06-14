package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.FriendsChatPage
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.ultron.extensions.tap
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.ultron.custom.espresso.action.getText
import org.junit.Assert

object FriendsChatSteps {

    fun checkThatChatIsOpen(name: String) {
        with(FriendsChatPage) {
            Assert.assertTrue(toolbarTitle.isViewDisplayed())
            Assert.assertEquals(toolbarTitle.getText(), name)
        }
    }

    fun enterMessage(message: String) {
        FriendsChatPage.messageTextField.typeText(message)
    }

    fun sendAMessage() {
        FriendsChatPage.sendMessageBtn.tap()
    }

    fun validateSentMessage(message: String) {
        Assert.assertTrue(FriendsChatPage.getSentMessage(message).isViewDisplayed())
    }
}