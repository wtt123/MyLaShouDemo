// Generated code from Butter Knife. Do not modify!
package cn.lashou.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import cn.lashou.widget.MyPhotoView;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class GoodDetailsActivity$$ViewBinder<T extends GoodDetailsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends GoodDetailsActivity> implements Unbinder {
    protected T target;

    private View view2131558515;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.mDetails = finder.findRequiredViewAsType(source, 2131558514, "field 'mDetails'", TextView.class);
      view = finder.findRequiredView(source, 2131558515, "field 'mShare' and method 'onClick'");
      target.mShare = finder.castView(view, 2131558515, "field 'mShare'");
      view2131558515 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick();
        }
      });
      target.mMyphotoview = finder.findRequiredViewAsType(source, 2131558516, "field 'mMyphotoview'", MyPhotoView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mDetails = null;
      target.mShare = null;
      target.mMyphotoview = null;

      view2131558515.setOnClickListener(null);
      view2131558515 = null;

      this.target = null;
    }
  }
}
