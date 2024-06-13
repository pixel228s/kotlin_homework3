package com.atiurin.sampleapp.Steps

import com.atiurin.sampleapp.Pagess.FriendsChatPage
import com.atiurin.sampleapp.helper.assertIsViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.ultron.custom.espresso.action.getText
import org.junit.Assert

object FriendsChatSteps {

    fun checkThatChatIsOpen(name : String){
        Assert.assertEquals(FriendsChatPage.toolbarTitle.getText(), name)
    }

    fun enterMessage(message : String){
        FriendsChatPage.messageTextField.typeText(message)
    }

    fun sendAMessage(){
        FriendsChatPage.sendMessageBtn.tap()
    }

    fun validateSentMessage(message :String){
        FriendsChatPage.getSentMessage(message).assertIsViewDisplayed()
    }
}