package com.atiurin.sampleapp.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.data.ConstantData
import com.atiurin.sampleapp.steps.FriendsChatSteps
import com.atiurin.sampleapp.steps.LandingPageSteps
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class WeekendVibeTests : MyBaseTest() {

    @Test
    fun textAFriend_1() {
        with(LandingPageSteps) {
            scrollingToFriendsChat(ConstantData.FRIENDS_NAME_1)
            openChatWithMyFriend(ConstantData.FRIENDS_NAME_1)
        }
        with(FriendsChatSteps) {
            checkThatChatIsOpen(ConstantData.FRIENDS_NAME_1)
            enterMessage(ConstantData.MESSAGE_TO_EMMET)
            sendAMessage()
            validateSentMessage(ConstantData.MESSAGE_TO_EMMET)
        }
    }

    @Test
    fun textAFriend_2() {
        with(LandingPageSteps) {
            scrollingToFriendsChat(ConstantData.FRIENDS_NAME_2)
            openChatWithMyFriend(ConstantData.FRIENDS_NAME_2)
        }
        with(FriendsChatSteps) {
            checkThatChatIsOpen(ConstantData.FRIENDS_NAME_2)
            enterMessage(ConstantData.MESSAGE_TO_FRIEND17)
            sendAMessage()
            validateSentMessage(ConstantData.MESSAGE_TO_FRIEND17)
        }
    }

    @Test
    fun textAFriend_3() {
        with(LandingPageSteps) {
            scrollingToFriendsChat(ConstantData.FRIENDS_NAME_3)
            openChatWithMyFriend(ConstantData.FRIENDS_NAME_3)
        }
        with(FriendsChatSteps) {
            checkThatChatIsOpen(ConstantData.FRIENDS_NAME_3)
            enterMessage(ConstantData.MESSAGE_TO_FRIEND25)
            sendAMessage()
            validateSentMessage(ConstantData.MESSAGE_TO_FRIEND25)
        }
    }
}
