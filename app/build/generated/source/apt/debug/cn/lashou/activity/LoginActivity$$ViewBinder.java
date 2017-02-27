// Generated code from Butter Knife. Do not modify!
package cn.lashou.activity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LoginActivity$$ViewBinder<T extends LoginActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends LoginActivity> implements Unbinder {
    protected T target;

    private View view2131558517;

    private View view2131558519;

    private View view2131558520;

    private View view2131558526;

    private View view2131558527;

    private View view2131558532;

    private View view2131558535;

    private View view2131558536;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      view = finder.findRequiredView(source, 2131558517, "field 'mIcBack' and method 'onClick'");
      target.mIcBack = finder.castView(view, 2131558517, "field 'mIcBack'");
      view2131558517 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mZhuce = finder.findRequiredViewAsType(source, 2131558518, "field 'mZhuce'", TextView.class);
      view = finder.findRequiredView(source, 2131558519, "field 'mTvQuickRegister' and method 'onClick'");
      target.mTvQuickRegister = finder.castView(view, 2131558519, "field 'mTvQuickRegister'");
      view2131558519 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558520, "field 'mTvCountRegister' and method 'onClick'");
      target.mTvCountRegister = finder.castView(view, 2131558520, "field 'mTvCountRegister'");
      view2131558520 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mViewLineLeft = finder.findRequiredViewAsType(source, 2131558521, "field 'mViewLineLeft'", ImageView.class);
      target.mViewLineRight = finder.findRequiredViewAsType(source, 2131558522, "field 'mViewLineRight'", ImageView.class);
      target.mQuickPhone = finder.findRequiredViewAsType(source, 2131558524, "field 'mQuickPhone'", EditText.class);
      view = finder.findRequiredView(source, 2131558526, "field 'mBtnGetCode' and method 'onClick'");
      target.mBtnGetCode = finder.castView(view, 2131558526, "field 'mBtnGetCode'");
      view2131558526 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mEtQuickCode = finder.findRequiredViewAsType(source, 2131558525, "field 'mEtQuickCode'", EditText.class);
      view = finder.findRequiredView(source, 2131558527, "field 'mQuickBtn' and method 'onClick'");
      target.mQuickBtn = finder.castView(view, 2131558527, "field 'mQuickBtn'");
      view2131558527 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mQuickLogin = finder.findRequiredViewAsType(source, 2131558523, "field 'mQuickLogin'", LinearLayout.class);
      target.mAccountPhone = finder.findRequiredViewAsType(source, 2131558529, "field 'mAccountPhone'", EditText.class);
      target.mCbShowPwd = finder.findRequiredViewAsType(source, 2131558531, "field 'mCbShowPwd'", CheckBox.class);
      target.mAccountPwd = finder.findRequiredViewAsType(source, 2131558530, "field 'mAccountPwd'", EditText.class);
      view = finder.findRequiredView(source, 2131558532, "field 'mAccountBtn' and method 'onClick'");
      target.mAccountBtn = finder.castView(view, 2131558532, "field 'mAccountBtn'");
      view2131558532 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mForgetPwd = finder.findRequiredViewAsType(source, 2131558534, "field 'mForgetPwd'", TextView.class);
      target.mAccountLogin = finder.findRequiredViewAsType(source, 2131558528, "field 'mAccountLogin'", LinearLayout.class);
      view = finder.findRequiredView(source, 2131558535, "field 'mQq' and method 'onClick'");
      target.mQq = finder.castView(view, 2131558535, "field 'mQq'");
      view2131558535 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558536, "field 'mSina' and method 'onClick'");
      target.mSina = finder.castView(view, 2131558536, "field 'mSina'");
      view2131558536 = view;
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

      target.mIcBack = null;
      target.mZhuce = null;
      target.mTvQuickRegister = null;
      target.mTvCountRegister = null;
      target.mViewLineLeft = null;
      target.mViewLineRight = null;
      target.mQuickPhone = null;
      target.mBtnGetCode = null;
      target.mEtQuickCode = null;
      target.mQuickBtn = null;
      target.mQuickLogin = null;
      target.mAccountPhone = null;
      target.mCbShowPwd = null;
      target.mAccountPwd = null;
      target.mAccountBtn = null;
      target.mForgetPwd = null;
      target.mAccountLogin = null;
      target.mQq = null;
      target.mSina = null;

      view2131558517.setOnClickListener(null);
      view2131558517 = null;
      view2131558519.setOnClickListener(null);
      view2131558519 = null;
      view2131558520.setOnClickListener(null);
      view2131558520 = null;
      view2131558526.setOnClickListener(null);
      view2131558526 = null;
      view2131558527.setOnClickListener(null);
      view2131558527 = null;
      view2131558532.setOnClickListener(null);
      view2131558532 = null;
      view2131558535.setOnClickListener(null);
      view2131558535 = null;
      view2131558536.setOnClickListener(null);
      view2131558536 = null;

      this.target = null;
    }
  }
}
