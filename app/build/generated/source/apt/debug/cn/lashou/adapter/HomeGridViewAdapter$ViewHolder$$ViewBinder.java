// Generated code from Butter Knife. Do not modify!
package cn.lashou.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class HomeGridViewAdapter$ViewHolder$$ViewBinder<T extends HomeGridViewAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends HomeGridViewAdapter.ViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mItemHomeImage = finder.findRequiredViewAsType(source, 2131558625, "field 'mItemHomeImage'", ImageView.class);
      target.mItemHomeText = finder.findRequiredViewAsType(source, 2131558626, "field 'mItemHomeText'", TextView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mItemHomeImage = null;
      target.mItemHomeText = null;

      this.target = null;
    }
  }
}
