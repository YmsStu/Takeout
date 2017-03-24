// Generated code from Butter Knife. Do not modify!
package com.itheima.hichat.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.itheima.hichat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ConversationRVAdapter$ViewHolder_ViewBinding<T extends ConversationRVAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public ConversationRVAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.ivAvatar = Utils.findRequiredViewAsType(source, R.id.iv_avatar, "field 'ivAvatar'", ImageView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tv_username, "field 'tvUsername'", TextView.class);
    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tv_time, "field 'tvTime'", TextView.class);
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.tv_content, "field 'tvContent'", TextView.class);
    target.tvMsgCount = Utils.findRequiredViewAsType(source, R.id.tv_msg_count, "field 'tvMsgCount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ivAvatar = null;
    target.tvUsername = null;
    target.tvTime = null;
    target.tvContent = null;
    target.tvMsgCount = null;

    this.target = null;
  }
}
