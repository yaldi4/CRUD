package com.ghali.crud;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ghali.crud.form.MenuForm;

public class KontakActivity extends Activity implements View.OnClickListener {
    private MenuForm form;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        form = new MenuForm(this);

        form.getButtonBuatKontakBaru().setOnClickListener(this);
        form.getButtonDaftarKontak().setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == form.getButtonBuatKontakBaru()) {
            Intent intent = new Intent(this, BuatActivity.class);
            startActivity(intent);
        } else if (v == form.getButtonDaftarKontak()) {
            Intent intent = new Intent(this, DaftarActivity.class);
            startActivity(intent);
        }
    }
}
