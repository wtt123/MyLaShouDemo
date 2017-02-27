// Generated code from Butter Knife. Do not modify!
package cn.lashou.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class HomeAdapter$ViewHolder$$ViewBinder<T extends HomeAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends HomeAdapter.ViewHolder> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mListImage = finder.findRequiredViewAsType(source, 2131558619, "field 'mListImage'", SimpleDraweeView.class);
      target.mTitle = finder.findRequiredViewAsType(source, 2131558476, "field 'mTitle'", TextView.class);
      target.mDesc = finder.findRequiredViewAsType(source, 2131558620, "field 'mDesc'", TextView.class);
      target.mListMoney = finder.findRequiredViewAsType(source, 2131558621, "field 'mListMoney'", TextView.class);
      target.mListYishou = finder.findRequiredViewAsType(source, 2131558623, "field 'mListYishou'", TextView.class);
      target.mImageView = finder.findRequiredViewAsType(source, 2131558624, "field 'mImageView'", ImageView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mListImage = null;
      target.mTitle = null;
      target.mDesc = null;
      target.mListMoney = null;
      target.mListYishou = null;
      target.mImageView = null;

      this.target = null;
    }
  }
}
