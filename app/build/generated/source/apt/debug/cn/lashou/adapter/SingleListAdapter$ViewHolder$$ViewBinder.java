// Generated code from Butter Knife. Do not modify!
package cn.lashou.adapter;

import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SingleListAdapter$ViewHolder$$ViewBinder<T extends SingleListAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends SingleListAdapter.ViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mTvSingle = finder.findRequiredViewAsType(source, 2131558637, "field 'mTvSingle'", TextView.class);
      target.mHindTv = finder.findRequiredViewAsType(source, 2131558638, "field 'mHindTv'", TextView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mTvSingle = null;
      target.mHindTv = null;

      this.target = null;
    }
  }
}
