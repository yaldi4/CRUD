package com.ghali.crud;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.ghali.crud.database.KontakDatabase;
import com.ghali.crud.form.DaftarForm;
import com.ghali.crud.model.Kontak;

import java.util.List;

/**
 * Created by galih on 1/5/2015.
 */
public class DaftarActivity extends Activity {
    private DaftarForm form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        form = new DaftarForm(this);

        loadKontak();//meload contact
    }

    private void loadKontak() {
        KontakDatabase database = KontakDatabase.getInstance();
        List<Kontak> list = database.findAll();

        ArrayAdapter<Kontak> adapter = new ArrayAdapter<Kontak>(this, android.R.layout.simple_list_item_1, list);

        form.getListViewDaftarKontak().setAdapter(adapter);
    }
}
