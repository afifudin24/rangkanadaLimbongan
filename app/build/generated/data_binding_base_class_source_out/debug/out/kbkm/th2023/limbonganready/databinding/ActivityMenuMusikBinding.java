// Generated by view binder compiler. Do not edit!
package kbkm.th2023.limbonganready.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import kbkm.th2023.limbonganready.R;

public final class ActivityMenuMusikBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FloatingActionButton backButton;

  @NonNull
  public final Button btGambangan;

  @NonNull
  public final Button btGambus;

  @NonNull
  public final Button btHadra;

  @NonNull
  public final Button btLesung;

  @NonNull
  public final ImageView img1;

  @NonNull
  public final TextView textE;

  @NonNull
  public final TextView textJudul2;

  @NonNull
  public final TextView textSub2;

  @NonNull
  public final TextView textd;

  @NonNull
  public final TextView textg;

  @NonNull
  public final TextView texth;

  @NonNull
  public final TextView txtdetailE;

  private ActivityMenuMusikBinding(@NonNull RelativeLayout rootView,
      @NonNull FloatingActionButton backButton, @NonNull Button btGambangan,
      @NonNull Button btGambus, @NonNull Button btHadra, @NonNull Button btLesung,
      @NonNull ImageView img1, @NonNull TextView textE, @NonNull TextView textJudul2,
      @NonNull TextView textSub2, @NonNull TextView textd, @NonNull TextView textg,
      @NonNull TextView texth, @NonNull TextView txtdetailE) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.btGambangan = btGambangan;
    this.btGambus = btGambus;
    this.btHadra = btHadra;
    this.btLesung = btLesung;
    this.img1 = img1;
    this.textE = textE;
    this.textJudul2 = textJudul2;
    this.textSub2 = textSub2;
    this.textd = textd;
    this.textg = textg;
    this.texth = texth;
    this.txtdetailE = txtdetailE;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuMusikBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuMusikBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu_musik, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuMusikBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      FloatingActionButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.bt_gambangan;
      Button btGambangan = ViewBindings.findChildViewById(rootView, id);
      if (btGambangan == null) {
        break missingId;
      }

      id = R.id.bt_gambus;
      Button btGambus = ViewBindings.findChildViewById(rootView, id);
      if (btGambus == null) {
        break missingId;
      }

      id = R.id.bt_hadra;
      Button btHadra = ViewBindings.findChildViewById(rootView, id);
      if (btHadra == null) {
        break missingId;
      }

      id = R.id.bt_lesung;
      Button btLesung = ViewBindings.findChildViewById(rootView, id);
      if (btLesung == null) {
        break missingId;
      }

      id = R.id.img1;
      ImageView img1 = ViewBindings.findChildViewById(rootView, id);
      if (img1 == null) {
        break missingId;
      }

      id = R.id.textE;
      TextView textE = ViewBindings.findChildViewById(rootView, id);
      if (textE == null) {
        break missingId;
      }

      id = R.id.textJudul2;
      TextView textJudul2 = ViewBindings.findChildViewById(rootView, id);
      if (textJudul2 == null) {
        break missingId;
      }

      id = R.id.textSub2;
      TextView textSub2 = ViewBindings.findChildViewById(rootView, id);
      if (textSub2 == null) {
        break missingId;
      }

      id = R.id.textd;
      TextView textd = ViewBindings.findChildViewById(rootView, id);
      if (textd == null) {
        break missingId;
      }

      id = R.id.textg;
      TextView textg = ViewBindings.findChildViewById(rootView, id);
      if (textg == null) {
        break missingId;
      }

      id = R.id.texth;
      TextView texth = ViewBindings.findChildViewById(rootView, id);
      if (texth == null) {
        break missingId;
      }

      id = R.id.txtdetailE;
      TextView txtdetailE = ViewBindings.findChildViewById(rootView, id);
      if (txtdetailE == null) {
        break missingId;
      }

      return new ActivityMenuMusikBinding((RelativeLayout) rootView, backButton, btGambangan,
          btGambus, btHadra, btLesung, img1, textE, textJudul2, textSub2, textd, textg, texth,
          txtdetailE);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
