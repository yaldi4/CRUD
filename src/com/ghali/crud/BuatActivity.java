package com.ghali.crud;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.ghali.crud.database.KontakDatabase;
import com.ghali.crud.form.BuatForm;
import com.ghali.crud.model.Kontak;

/**
 * Created by galih on 1/5/2015.
 */
public class BuatActivity extends Activity implements View.OnClickListener {
    private BuatForm form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buat);

        form = new BuatForm(this);

        form.getButtonSimpan().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Kontak kontak = new Kontak();
        kontak.nama = form.getEditTextNama().getText().toString();
        kontak.email = form.getEditTextEmail().getText().toString();
        kontak.telepon = form.getEditTextTelepon().getText().toString();

        KontakDatabase database = KontakDatabase.getInstance();
        database.add(kontak);

        form.reset();
    }
}
