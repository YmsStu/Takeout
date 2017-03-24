// Generated code from Butter Knife. Do not modify!
package com.itheima.hichat.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.itheima.hichat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddFriendRVAdapter$ViewHolder_ViewBinding<T extends AddFriendRVAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public AddFriendRVAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.ivAvatar = Utils.findRequiredViewAsType(source, R.id.iv_avatar, "field 'ivAvatar'", ImageView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tv_username, "field 'tvUsername'", TextView.class);
    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tv_time, "field 'tvTime'", TextView.class);
    target.btnAdd = Utils.findRequiredViewAsType(source, R.id.btn_add, "field 'btnAdd'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ivAvatar = null;
    target.tvUsername = null;
    target.tvTime = null;
    target.btnAdd = null;

    this.target = null;
  }
}
