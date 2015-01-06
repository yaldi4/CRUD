package com.ghali.crud.form;

import android.app.Activity;
import android.widget.Button;
import com.ghali.crud.R;

/**
 * Created by galih on 1/5/2015.
 * Updated at  5:19 AM
 */
public class MenuForm {
    private Activity activity;
    private Button buttonBuatKontakBaru;
    private Button buttonDaftarKontak;

    public MenuForm(Activity activity) {
        this.activity = activity;

        buttonBuatKontakBaru = (Button) activity.findViewById(R.id.main_buttonBuatKontakBaru);
        buttonDaftarKontak = (Button) activity.findViewById(R.id.main_buttonDaftarKontak);
    }

    public Activity getActivity() {
        return activity;
    }

    public Button getButtonBuatKontakBaru() {
        return buttonBuatKontakBaru;
    }

    public Button getButtonDaftarKontak() {
        return buttonDaftarKontak;
    }

}
