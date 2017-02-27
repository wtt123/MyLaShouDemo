// Generated code from Butter Knife. Do not modify!
package cn.lashou.adapter;

import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class DoubleRightAdapter$ViewHolder$$ViewBinder<T extends DoubleRightAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends DoubleRightAdapter.ViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mTitleRight = finder.findRequiredViewAsType(source, 2131558635, "field 'mTitleRight'", TextView.class);
      target.mNumRight = finder.findRequiredViewAsType(source, 2131558636, "field 'mNumRight'", TextView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mTitleRight = null;
      target.mNumRight = null;

      this.target = null;
    }
  }
}
