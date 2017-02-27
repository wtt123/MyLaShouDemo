// Generated code from Butter Knife. Do not modify!
package cn.lashou.adapter;

import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CheckListAdapter$ViewHolder$$ViewBinder<T extends CheckListAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends CheckListAdapter.ViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mTvSingleCheck = finder.findRequiredViewAsType(source, 2131558610, "field 'mTvSingleCheck'", TextView.class);
      target.mCheckBox = finder.findRequiredViewAsType(source, 2131558611, "field 'mCheckBox'", CheckBox.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mTvSingleCheck = null;
      target.mCheckBox = null;

      this.target = null;
    }
  }
}
