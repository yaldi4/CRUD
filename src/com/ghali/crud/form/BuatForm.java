package com.ghali.crud.form;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import com.ghali.crud.R;

/**
 * Created by galih on 1/5/2015.
 */
public class BuatForm {
    private Activity activity;

    private EditText editTextNama;
    private EditText editTextTelepon;
    private EditText editTextEmail;

    private Button buttonSimpan;

    public BuatForm(Activity activity) {
        this.activity = activity;

        editTextNama = (EditText) activity.findViewById(R.id.buat_editTextNama);
        editTextTelepon = (EditText) activity.findViewById(R.id.buat_editTextTelepone);
        editTextEmail = (EditText) activity.findViewById(R.id.buat_editTextEmail);

        buttonSimpan = (Button) activity.findViewById(R.id.buat_buttonSimpan);
    }

    public Activity getActivity() {
        return activity;
    }

    public Button getButtonSimpan() {
        return buttonSimpan;
    }

    public EditText getEditTextNama() {
        return editTextNama;
    }

    public EditText getEditTextTelepon() {
        return editTextTelepon;
    }

    public EditText getEditTextEmail() {
        return editTextEmail;
    }

    public void reset() {
        editTextNama.setText("");
        editTextEmail.setText("");
        editTextTelepon.setText("");
    }
}
