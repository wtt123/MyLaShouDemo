// Generated code from Butter Knife. Do not modify!
package cn.lashou.activity;

import android.view.View;
import android.widget.ImageView;
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

public class MovieCategoryActivity$$ViewBinder<T extends MovieCategoryActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends MovieCategoryActivity> implements Unbinder {
    protected T target;

    private View view2131558542;

    private View view2131558517;

    private View view2131558707;

    private View view2131558710;

    private View view2131558713;

    private View view2131558544;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.mMovieTitle = finder.findRequiredViewAsType(source, 2131558541, "field 'mMovieTitle'", TextView.class);
      view = finder.findRequiredView(source, 2131558542, "field 'mMap' and method 'onClick'");
      target.mMap = finder.castView(view, 2131558542, "field 'mMap'");
      view2131558542 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558517, "field 'mIcBack' and method 'onClick'");
      target.mIcBack = finder.castView(view, 2131558517, "field 'mIcBack'");
      view2131558517 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mMoviewList = finder.findRequiredViewAsType(source, 2131558543, "field 'mMoviewList'", XListView.class);
      target.mTvAllFenlei = finder.findRequiredViewAsType(source, 2131558708, "field 'mTvAllFenlei'", TextView.class);
      target.mImgFenlei = finder.findRequiredViewAsType(source, 2131558709, "field 'mImgFenlei'", ImageView.class);
      view = finder.findRequiredView(source, 2131558707, "field 'mAllFenlei' and method 'onClick'");
      target.mAllFenlei = finder.castView(view, 2131558707, "field 'mAllFenlei'");
      view2131558707 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mTvPaixu = finder.findRequiredViewAsType(source, 2131558711, "field 'mTvPaixu'", TextView.class);
      target.mImgPaixu = finder.findRequiredViewAsType(source, 2131558712, "field 'mImgPaixu'", ImageView.class);
      view = finder.findRequiredView(source, 2131558710, "field 'mPaixu' and method 'onClick'");
      target.mPaixu = finder.castView(view, 2131558710, "field 'mPaixu'");
      view2131558710 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mTvSelect = finder.findRequiredViewAsType(source, 2131558714, "field 'mTvSelect'", TextView.class);
      target.mImgSelect = finder.findRequiredViewAsType(source, 2131558715, "field 'mImgSelect'", ImageView.class);
      view = finder.findRequiredView(source, 2131558713, "field 'mSelect' and method 'onClick'");
      target.mSelect = finder.castView(view, 2131558713, "field 'mSelect'");
      view2131558713 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mViewLine = finder.findRequiredView(source, 2131558545, "field 'mViewLine'");
      view = finder.findRequiredView(source, 2131558544, "field 'mIsHindCategory' and method 'onClick'");
      target.mIsHindCategory = finder.castView(view, 2131558544, "field 'mIsHindCategory'");
      view2131558544 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mTitle = finder.findRequiredViewAsType(source, 2131558540, "field 'mTitle'", RelativeLayout.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mMovieTitle = null;
      target.mMap = null;
      target.mIcBack = null;
      target.mMoviewList = null;
      target.mTvAllFenlei = null;
      target.mImgFenlei = null;
      target.mAllFenlei = null;
      target.mTvPaixu = null;
      target.mImgPaixu = null;
      target.mPaixu = null;
      target.mTvSelect = null;
      target.mImgSelect = null;
      target.mSelect = null;
      target.mViewLine = null;
      target.mIsHindCategory = null;
      target.mTitle = null;

      view2131558542.setOnClickListener(null);
      view2131558542 = null;
      view2131558517.setOnClickListener(null);
      view2131558517 = null;
      view2131558707.setOnClickListener(null);
      view2131558707 = null;
      view2131558710.setOnClickListener(null);
      view2131558710 = null;
      view2131558713.setOnClickListener(null);
      view2131558713 = null;
      view2131558544.setOnClickListener(null);
      view2131558544 = null;

      this.target = null;
    }
  }
}
