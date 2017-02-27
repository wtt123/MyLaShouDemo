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
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MeFrgment$$ViewBinder<T extends MeFrgment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends MeFrgment> implements Unbinder {
    protected T target;

    private View view2131558567;

    private View view2131558571;

    private View view2131558572;

    private View view2131558573;

    private View view2131558574;

    private View view2131558575;

    private View view2131558576;

    private View view2131558578;

    private View view2131558582;

    private View view2131558586;

    private View view2131558590;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      view = finder.findRequiredView(source, 2131558567, "field 'mLogin' and method 'onClick'");
      target.mLogin = finder.castView(view, 2131558567, "field 'mLogin'");
      view2131558567 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mUnlogin = finder.findRequiredViewAsType(source, 2131558566, "field 'mUnlogin'", LinearLayout.class);
      target.mUserIcon = finder.findRequiredViewAsType(source, 2131558569, "field 'mUserIcon'", SimpleDraweeView.class);
      target.mUserName = finder.findRequiredViewAsType(source, 2131558570, "field 'mUserName'", TextView.class);
      target.mLoginIn = finder.findRequiredViewAsType(source, 2131558568, "field 'mLoginIn'", RelativeLayout.class);
      view = finder.findRequiredView(source, 2131558571, "field 'mLashouquan' and method 'onClick'");
      target.mLashouquan = finder.castView(view, 2131558571, "field 'mLashouquan'");
      view2131558571 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558572, "field 'mCollection' and method 'onClick'");
      target.mCollection = finder.castView(view, 2131558572, "field 'mCollection'");
      view2131558572 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558573, "field 'mLiulan' and method 'onClick'");
      target.mLiulan = finder.castView(view, 2131558573, "field 'mLiulan'");
      view2131558573 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558574, "field 'mWaitPay' and method 'onClick'");
      target.mWaitPay = finder.castView(view, 2131558574, "field 'mWaitPay'");
      view2131558574 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558575, "field 'mPay' and method 'onClick'");
      target.mPay = finder.castView(view, 2131558575, "field 'mPay'");
      view2131558575 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mTextView = finder.findRequiredViewAsType(source, 2131558577, "field 'mTextView'", TextView.class);
      view = finder.findRequiredView(source, 2131558576, "field 'mWaitPinjia' and method 'onClick'");
      target.mWaitPinjia = finder.castView(view, 2131558576, "field 'mWaitPinjia'");
      view2131558576 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mImageView2 = finder.findRequiredViewAsType(source, 2131558579, "field 'mImageView2'", ImageView.class);
      target.mImageView3 = finder.findRequiredViewAsType(source, 2131558580, "field 'mImageView3'", ImageView.class);
      target.mTextView2 = finder.findRequiredViewAsType(source, 2131558581, "field 'mTextView2'", TextView.class);
      view = finder.findRequiredView(source, 2131558578, "field 'mTuijian' and method 'onClick'");
      target.mTuijian = finder.castView(view, 2131558578, "field 'mTuijian'");
      view2131558578 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mImageView5 = finder.findRequiredViewAsType(source, 2131558583, "field 'mImageView5'", ImageView.class);
      target.mImageView4 = finder.findRequiredViewAsType(source, 2131558584, "field 'mImageView4'", ImageView.class);
      target.mTextView3 = finder.findRequiredViewAsType(source, 2131558585, "field 'mTextView3'", TextView.class);
      view = finder.findRequiredView(source, 2131558582, "field 'mPingjia' and method 'onClick'");
      target.mPingjia = finder.castView(view, 2131558582, "field 'mPingjia'");
      view2131558582 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mImageView6 = finder.findRequiredViewAsType(source, 2131558587, "field 'mImageView6'", ImageView.class);
      target.mImageView7 = finder.findRequiredViewAsType(source, 2131558588, "field 'mImageView7'", ImageView.class);
      target.mTextView4 = finder.findRequiredViewAsType(source, 2131558589, "field 'mTextView4'", TextView.class);
      view = finder.findRequiredView(source, 2131558586, "field 'mChoujiang' and method 'onClick'");
      target.mChoujiang = finder.castView(view, 2131558586, "field 'mChoujiang'");
      view2131558586 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mImageView77 = finder.findRequiredViewAsType(source, 2131558591, "field 'mImageView77'", ImageView.class);
      target.mImageView8 = finder.findRequiredViewAsType(source, 2131558592, "field 'mImageView8'", ImageView.class);
      target.mTextView5 = finder.findRequiredViewAsType(source, 2131558593, "field 'mTextView5'", TextView.class);
      target.mTextView7 = finder.findRequiredViewAsType(source, 2131558594, "field 'mTextView7'", TextView.class);
      view = finder.findRequiredView(source, 2131558590, "field 'mEnterHome' and method 'onClick'");
      target.mEnterHome = finder.castView(view, 2131558590, "field 'mEnterHome'");
      view2131558590 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mLogin = null;
      target.mUnlogin = null;
      target.mUserIcon = null;
      target.mUserName = null;
      target.mLoginIn = null;
      target.mLashouquan = null;
      target.mCollection = null;
      target.mLiulan = null;
      target.mWaitPay = null;
      target.mPay = null;
      target.mTextView = null;
      target.mWaitPinjia = null;
      target.mImageView2 = null;
      target.mImageView3 = null;
      target.mTextView2 = null;
      target.mTuijian = null;
      target.mImageView5 = null;
      target.mImageView4 = null;
      target.mTextView3 = null;
      target.mPingjia = null;
      target.mImageView6 = null;
      target.mImageView7 = null;
      target.mTextView4 = null;
      target.mChoujiang = null;
      target.mImageView77 = null;
      target.mImageView8 = null;
      target.mTextView5 = null;
      target.mTextView7 = null;
      target.mEnterHome = null;

      view2131558567.setOnClickListener(null);
      view2131558567 = null;
      view2131558571.setOnClickListener(null);
      view2131558571 = null;
      view2131558572.setOnClickListener(null);
      view2131558572 = null;
      view2131558573.setOnClickListener(null);
      view2131558573 = null;
      view2131558574.setOnClickListener(null);
      view2131558574 = null;
      view2131558575.setOnClickListener(null);
      view2131558575 = null;
      view2131558576.setOnClickListener(null);
      view2131558576 = null;
      view2131558578.setOnClickListener(null);
      view2131558578 = null;
      view2131558582.setOnClickListener(null);
      view2131558582 = null;
      view2131558586.setOnClickListener(null);
      view2131558586 = null;
      view2131558590.setOnClickListener(null);
      view2131558590 = null;

      this.target = null;
    }
  }
}
