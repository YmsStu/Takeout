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

public class FriendAdapter$ViewHolder_ViewBinding<T extends FriendAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public FriendAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.ivAvatar = Utils.findRequiredViewAsType(source, R.id.iv_avatar, "field 'ivAvatar'", ImageView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tv_username, "field 'tvUsername'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ivAvatar = null;
    target.tvUsername = null;

    this.target = null;
  }
}
