package com.itheima.hichat.view.fragment.maintab;

import com.hyphenate.chat.EMConversation;

import java.util.List;

/**
 * Created by Apple on 2016/12/10.
 */

public interface
ConversationFragmentView {
    void afterLoadAllConversations(List<EMConversation> emConversationList);
}
