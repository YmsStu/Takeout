// Generated code from Butter Knife. Do not modify!
package com.itheima.hichat.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.itheima.hichat.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatAdapter$ReceiveViewHolder_ViewBinding<T extends ChatAdapter.ReceiveViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public ChatAdapter$ReceiveViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tv_time, "field 'tvTime'", TextView.class);
    target.ivHeader = Utils.findRequiredViewAsType(source, R.id.iv_header, "field 'ivHeader'", ImageView.class);
    target.tvTextMsg = Utils.findRequiredViewAsType(source, R.id.tv_text_msg, "field 'tvTextMsg'", TextView.class);
    target.ivImageMsg = Utils.findRequiredViewAsType(source, R.id.iv_image_msg, "field 'ivImageMsg'", ImageView.class);
    target.ivVoiceMsg = Utils.findRequiredViewAsType(source, R.id.iv_voice_msg, "field 'ivVoiceMsg'", ImageView.class);
    target.tvVideoMsg = Utils.findRequiredViewAsType(source, R.id.tv_video_msg, "field 'tvVideoMsg'", TextureView.class);
    target.rlMsgContent = Utils.findRequiredViewAsType(source, R.id.rl_msg_content, "field 'rlMsgContent'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tvTime = null;
    target.ivHeader = null;
    target.tvTextMsg = null;
    target.ivImageMsg = null;
    target.ivVoiceMsg = null;
    target.tvVideoMsg = null;
    target.rlMsgContent = null;

    this.target = null;
  }
}
