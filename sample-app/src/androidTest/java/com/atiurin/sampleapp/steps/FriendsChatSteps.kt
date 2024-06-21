package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.FriendsChatPage
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object FriendsChatSteps {

    fun checkThatChatIsOpen(name: String) {
        with(FriendsChatPage) {
            Assert.assertTrue(toolbarTitle.isViewDisplayed())
            Assert.assertEquals(toolbarTitle.getText(), name)
        }
    }

    fun enterMessage(message: String) {
        with(FriendsChatPage) {
            messageTextField.tap()
            messageTextField.typeText(message)
        }
    }

    fun sendAMessage() {
        FriendsChatPage.sendMessageBtn.tap()
    }

    fun validateSentMessage(message: String) {
        Assert.assertTrue(FriendsChatPage.getSentMessage(message).isViewDisplayed())
    }
}
