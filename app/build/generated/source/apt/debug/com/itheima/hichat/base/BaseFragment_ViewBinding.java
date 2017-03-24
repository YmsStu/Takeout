// Generated code from Butter Knife. Do not modify!
package com.itheima.hichat.base;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.itheima.hichat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseFragment_ViewBinding<T extends BaseFragment> implements Unbinder {
  protected T target;

  private View view2131624128;

  private View view2131624100;

  private View view2131624086;

  @UiThread
  public BaseFragment_ViewBinding(final T target, View source) {
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
    target.ivEmpty = Utils.findRequiredViewAsType(source, R.id.iv_empty, "field 'ivEmpty'", ImageView.class);
    target.tvInfo = Utils.findRequiredViewAsType(source, R.id.tv_info, "field 'tvInfo'", TextView.class);
    view = Utils.findRequiredView(source, R.id.bt_register, "field 'btRegister' and method 'onClick'");
    target.btRegister = Utils.castView(view, R.id.bt_register, "field 'btRegister'", Button.class);
    view2131624100 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_login, "field 'btLogin' and method 'onClick'");
    target.btLogin = Utils.castView(view, R.id.bt_login, "field 'btLogin'", Button.class);
    view2131624086 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.emptyLl = Utils.findRequiredViewAsType(source, R.id.empty_ll, "field 'emptyLl'", LinearLayout.class);
    target.content = Utils.findRequiredViewAsType(source, R.id.content, "field 'content'", FrameLayout.class);
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
    target.ivEmpty = null;
    target.tvInfo = null;
    target.btRegister = null;
    target.btLogin = null;
    target.emptyLl = null;
    target.content = null;

    view2131624128.setOnClickListener(null);
    view2131624128 = null;
    view2131624100.setOnClickListener(null);
    view2131624100 = null;
    view2131624086.setOnClickListener(null);
    view2131624086 = null;

    this.target = null;
  }
}
