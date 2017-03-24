// Generated code from Butter Knife. Do not modify!
package com.itheima.hichat.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.itheima.hichat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.contaier = Utils.findRequiredViewAsType(source, R.id.contaier, "field 'contaier'", FrameLayout.class);
    target.bottomNavigationBar = Utils.findRequiredViewAsType(source, R.id.bottomNavigationBar, "field 'bottomNavigationBar'", BottomNavigationBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.contaier = null;
    target.bottomNavigationBar = null;

    this.target = null;
  }
}
