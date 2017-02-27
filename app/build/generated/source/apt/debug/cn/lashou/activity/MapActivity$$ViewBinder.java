// Generated code from Butter Knife. Do not modify!
package cn.lashou.activity;

import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import com.baidu.mapapi.map.MapView;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MapActivity$$ViewBinder<T extends MapActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends MapActivity> implements Unbinder {
    protected T target;

    protected InnerUnbinder(T target, Finder finder, Object source) {
      this.target = target;

      target.mMapView = finder.findRequiredViewAsType(source, 2131558539, "field 'mMapView'", MapView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.mMapView = null;

      this.target = null;
    }
  }
}
