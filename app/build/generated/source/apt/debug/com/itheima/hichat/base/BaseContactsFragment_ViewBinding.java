// Generated code from Butter Knife. Do not modify!
package com.itheima.hichat.base;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.itheima.hichat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseContactsFragment_ViewBinding<T extends BaseContactsFragment> implements Unbinder {
  protected T target;

  @UiThread
  public BaseContactsFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.rv = Utils.findRequiredViewAsType(source, R.id.rv, "field 'rv'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.rv = null;

    this.target = null;
  }
}
