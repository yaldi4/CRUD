package com.ghali.crud.form;

import android.app.Activity;
import android.widget.ListView;
import com.ghali.crud.R;

/**
 * Created by galih on 1/5/2015.
 */
public class DaftarForm {
    private Activity activity;
    private ListView listViewDaftarKontak;

    public DaftarForm(Activity activity) {
        this.activity = activity;

        listViewDaftarKontak = (ListView) activity.findViewById(R.id.daftar_listDaftarKontak);
    }

    public Activity getActivity() {
        return activity;
    }

    public ListView getListViewDaftarKontak() {
        return listViewDaftarKontak;
    }
}
