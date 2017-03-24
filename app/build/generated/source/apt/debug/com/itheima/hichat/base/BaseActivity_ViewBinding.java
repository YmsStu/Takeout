// Generated code from Butter Knife. Do not modify!
package com.itheima.hichat.base;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.itheima.hichat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseActivity_ViewBinding<T extends BaseActivity> implements Unbinder {
  protected T target;

  private View view2131624128;

  @UiThread
  public BaseActivity_ViewBinding(final T target, View source) {
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
    target.content = Utils.findRequiredViewAsType(source, R.id.content, "field 'content'", FrameLayout.class);
    target.rlRoot = Utils.findRequiredViewAsType(source, R.id.rl_root, "field 'rlRoot'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ibBack = null;
    target.tvTitle = null;
    target.content = null;
    target.rlRoot = null;

    view2131624128.setOnClickListener(null);
    view2131624128 = null;

    this.target = null;
  }
}
