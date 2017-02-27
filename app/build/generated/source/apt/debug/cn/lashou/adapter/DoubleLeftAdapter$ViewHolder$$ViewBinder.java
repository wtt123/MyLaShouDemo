// Generated code from Butter Knife. Do not modify!
package cn.lashou.adapter;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class DoubleLeftAdapter$ViewHolder$$ViewBinder<T extends DoubleLeftAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends DoubleLeftAdapter.ViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mImgLfet = finder.findRequiredViewAsType(source, 2131558631, "field 'mImgLfet'", ImageView.class);
      target.mTitleLeft = finder.findRequiredViewAsType(source, 2131558632, "field 'mTitleLeft'", TextView.class);
      target.mNumLeft = finder.findRequiredViewAsType(source, 2131558633, "field 'mNumLeft'", TextView.class);
      target.rl = finder.findRequiredViewAsType(source, 2131558630, "field 'rl'", RelativeLayout.class);
      target.mLeftArrow = finder.findRequiredViewAsType(source, 2131558634, "field 'mLeftArrow'", ImageView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mImgLfet = null;
      target.mTitleLeft = null;
      target.mNumLeft = null;
      target.rl = null;
      target.mLeftArrow = null;

      this.target = null;
    }
  }
}
