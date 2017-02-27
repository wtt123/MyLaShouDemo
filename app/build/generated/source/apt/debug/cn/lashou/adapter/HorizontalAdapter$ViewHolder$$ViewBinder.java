// Generated code from Butter Knife. Do not modify!
package cn.lashou.adapter;

import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class HorizontalAdapter$ViewHolder$$ViewBinder<T extends HorizontalAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends HorizontalAdapter.ViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mRcyImage = finder.findRequiredViewAsType(source, 2131558627, "field 'mRcyImage'", SimpleDraweeView.class);
      target.mRcyTitle = finder.findRequiredViewAsType(source, 2131558628, "field 'mRcyTitle'", TextView.class);
      target.mRcyTv = finder.findRequiredViewAsType(source, 2131558629, "field 'mRcyTv'", TextView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mRcyImage = null;
      target.mRcyTitle = null;
      target.mRcyTv = null;

      this.target = null;
    }
  }
}
