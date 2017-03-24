// Generated code from Butter Knife. Do not modify!
package com.itheima.hichat.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.itheima.hichat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatActivity_ViewBinding<T extends ChatActivity> implements Unbinder {
  protected T target;

  private View view2131624128;

  private View view2131624072;

  @UiThread
  public ChatActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.ib_back, "field 'ibBack' and method 'onClick'");
    target.ibBack = Utils.castView(view, R.id.ib_back, "field 'ibBack'", ImageButton.class);
    view2131624128 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.headerLeft = Utils.findRequiredViewAsType(source, R.id.header_left, "field 'headerLeft'", LinearLayout.class);
    target.headerRight = Utils.findRequiredViewAsType(source, R.id.header_right, "field 'headerRight'", LinearLayout.class);
    target.conversationRv = Utils.findRequiredViewAsType(source, R.id.conversation_rv, "field 'conversationRv'", RecyclerView.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.ibVoice = Utils.findRequiredViewAsType(source, R.id.ib_voice, "field 'ibVoice'", ImageButton.class);
    target.etMsg = Utils.findRequiredViewAsType(source, R.id.et_msg, "field 'etMsg'", EditText.class);
    target.ibKeyboard = Utils.findRequiredViewAsType(source, R.id.ib_keyboard, "field 'ibKeyboard'", ImageButton.class);
    target.btVoice = Utils.findRequiredViewAsType(source, R.id.bt_voice, "field 'btVoice'", Button.class);
    target.ibFace = Utils.findRequiredViewAsType(source, R.id.ib_face, "field 'ibFace'", ImageButton.class);
    target.ibAdd = Utils.findRequiredViewAsType(source, R.id.ib_add, "field 'ibAdd'", ImageButton.class);
    view = Utils.findRequiredView(source, R.id.bt_send, "field 'btSend' and method 'onClick'");
    target.btSend = Utils.castView(view, R.id.bt_send, "field 'btSend'", Button.class);
    view2131624072 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.vp = Utils.findRequiredViewAsType(source, R.id.vp, "field 'vp'", ViewPager.class);
    target.ibAddFace = Utils.findRequiredViewAsType(source, R.id.ib_add_face, "field 'ibAddFace'", ImageButton.class);
    target.ibAllFace = Utils.findRequiredViewAsType(source, R.id.ib_all_face, "field 'ibAllFace'", ImageButton.class);
    target.ibCustom = Utils.findRequiredViewAsType(source, R.id.ib_custom, "field 'ibCustom'", ImageButton.class);
    target.ibTuzi = Utils.findRequiredViewAsType(source, R.id.ib_tuzi, "field 'ibTuzi'", ImageButton.class);
    target.ibTusiji = Utils.findRequiredViewAsType(source, R.id.ib_tusiji, "field 'ibTusiji'", ImageButton.class);
    target.ibSetting = Utils.findRequiredViewAsType(source, R.id.ib_setting, "field 'ibSetting'", ImageButton.class);
    target.llFace = Utils.findRequiredViewAsType(source, R.id.ll_face, "field 'llFace'", LinearLayout.class);
    target.activityConversation = Utils.findRequiredViewAsType(source, R.id.activity_conversation, "field 'activityConversation'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ibBack = null;
    target.tvTitle = null;
    target.headerLeft = null;
    target.headerRight = null;
    target.conversationRv = null;
    target.swipeRefreshLayout = null;
    target.ibVoice = null;
    target.etMsg = null;
    target.ibKeyboard = null;
    target.btVoice = null;
    target.ibFace = null;
    target.ibAdd = null;
    target.btSend = null;
    target.vp = null;
    target.ibAddFace = null;
    target.ibAllFace = null;
    target.ibCustom = null;
    target.ibTuzi = null;
    target.ibTusiji = null;
    target.ibSetting = null;
    target.llFace = null;
    target.activityConversation = null;

    view2131624128.setOnClickListener(null);
    view2131624128 = null;
    view2131624072.setOnClickListener(null);
    view2131624072 = null;

    this.target = null;
  }
}
