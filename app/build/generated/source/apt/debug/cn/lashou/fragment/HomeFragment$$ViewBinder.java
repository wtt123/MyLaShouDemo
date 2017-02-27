// Generated code from Butter Knife. Do not modify!
package cn.lashou.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import cn.lashou.widget.listview.XListView;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class HomeFragment$$ViewBinder<T extends HomeFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends HomeFragment> implements Unbinder {
    protected T target;

    private View view2131558556;

    private View view2131558558;

    private View view2131558561;

    private View view2131558562;

    private View view2131558565;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.mXListView = finder.findRequiredViewAsType(source, 2131558555, "field 'mXListView'", XListView.class);
      view = finder.findRequiredView(source, 2131558556, "field 'mTopBtn' and method 'onClick'");
      target.mTopBtn = finder.castView(view, 2131558556, "field 'mTopBtn'");
      view2131558556 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mCityName = finder.findRequiredViewAsType(source, 2131558559, "field 'mCityName'", TextView.class);
      view = finder.findRequiredView(source, 2131558558, "field 'mLocationLay' and method 'onClick'");
      target.mLocationLay = finder.castView(view, 2131558558, "field 'mLocationLay'");
      view2131558558 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558561, "field 'mScanImg' and method 'onClick'");
      target.mScanImg = finder.castView(view, 2131558561, "field 'mScanImg'");
      view2131558561 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mMsgIv = finder.findRequiredViewAsType(source, 2131558563, "field 'mMsgIv'", ImageView.class);
      target.mNewsNum = finder.findRequiredViewAsType(source, 2131558564, "field 'mNewsNum'", TextView.class);
      view = finder.findRequiredView(source, 2131558562, "field 'mRlMsgNum' and method 'onClick'");
      target.mRlMsgNum = finder.castView(view, 2131558562, "field 'mRlMsgNum'");
      view2131558562 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mLlRightLayout = finder.findRequiredViewAsType(source, 2131558560, "field 'mLlRightLayout'", LinearLayout.class);
      view = finder.findRequiredView(source, 2131558565, "field 'mInputLL' and method 'onClick'");
      target.mInputLL = finder.castView(view, 2131558565, "field 'mInputLL'");
      view2131558565 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mTitleBar = finder.findRequiredViewAsType(source, 2131558557, "field 'mTitleBar'", RelativeLayout.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mXListView = null;
      target.mTopBtn = null;
      target.mCityName = null;
      target.mLocationLay = null;
      target.mScanImg = null;
      target.mMsgIv = null;
      target.mNewsNum = null;
      target.mRlMsgNum = null;
      target.mLlRightLayout = null;
      target.mInputLL = null;
      target.mTitleBar = null;

      view2131558556.setOnClickListener(null);
      view2131558556 = null;
      view2131558558.setOnClickListener(null);
      view2131558558 = null;
      view2131558561.setOnClickListener(null);
      view2131558561 = null;
      view2131558562.setOnClickListener(null);
      view2131558562 = null;
      view2131558565.setOnClickListener(null);
      view2131558565 = null;

      this.target = null;
    }
  }
}
