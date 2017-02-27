// Generated code from Butter Knife. Do not modify!
package cn.lashou.fragment;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MoreFragment$$ViewBinder<T extends MoreFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends MoreFragment> implements Unbinder {
    protected T target;

    private View view2131558595;

    private View view2131558597;

    private View view2131558599;

    private View view2131558600;

    private View view2131558601;

    private View view2131558602;

    private View view2131558604;

    private View view2131558605;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.mWifiCb = finder.findRequiredViewAsType(source, 2131558596, "field 'mWifiCb'", CheckBox.class);
      view = finder.findRequiredView(source, 2131558595, "field 'mMoreWifi' and method 'onClick'");
      target.mMoreWifi = finder.castView(view, 2131558595, "field 'mMoreWifi'");
      view2131558595 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mRemindCb = finder.findRequiredViewAsType(source, 2131558598, "field 'mRemindCb'", CheckBox.class);
      view = finder.findRequiredView(source, 2131558597, "field 'mMoreMind' and method 'onClick'");
      target.mMoreMind = finder.castView(view, 2131558597, "field 'mMoreMind'");
      view2131558597 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558599, "field 'mMoreClean' and method 'onClick'");
      target.mMoreClean = finder.castView(view, 2131558599, "field 'mMoreClean'");
      view2131558599 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558600, "field 'mMoreGood' and method 'onClick'");
      target.mMoreGood = finder.castView(view, 2131558600, "field 'mMoreGood'");
      view2131558600 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558601, "field 'mMoreAdvice' and method 'onClick'");
      target.mMoreAdvice = finder.castView(view, 2131558601, "field 'mMoreAdvice'");
      view2131558601 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.mKefu = finder.findRequiredViewAsType(source, 2131558603, "field 'mKefu'", TextView.class);
      view = finder.findRequiredView(source, 2131558602, "field 'mMoreKefu' and method 'onClick'");
      target.mMoreKefu = finder.castView(view, 2131558602, "field 'mMoreKefu'");
      view2131558602 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558604, "field 'mMoreCheck' and method 'onClick'");
      target.mMoreCheck = finder.castView(view, 2131558604, "field 'mMoreCheck'");
      view2131558604 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558605, "field 'mMoreAbout' and method 'onClick'");
      target.mMoreAbout = finder.castView(view, 2131558605, "field 'mMoreAbout'");
      view2131558605 = view;
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

      target.mWifiCb = null;
      target.mMoreWifi = null;
      target.mRemindCb = null;
      target.mMoreMind = null;
      target.mMoreClean = null;
      target.mMoreGood = null;
      target.mMoreAdvice = null;
      target.mKefu = null;
      target.mMoreKefu = null;
      target.mMoreCheck = null;
      target.mMoreAbout = null;

      view2131558595.setOnClickListener(null);
      view2131558595 = null;
      view2131558597.setOnClickListener(null);
      view2131558597 = null;
      view2131558599.setOnClickListener(null);
      view2131558599 = null;
      view2131558600.setOnClickListener(null);
      view2131558600 = null;
      view2131558601.setOnClickListener(null);
      view2131558601 = null;
      view2131558602.setOnClickListener(null);
      view2131558602 = null;
      view2131558604.setOnClickListener(null);
      view2131558604 = null;
      view2131558605.setOnClickListener(null);
      view2131558605 = null;

      this.target = null;
    }
  }
}
