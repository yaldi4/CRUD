package com.ghali.crud.model;

/**
 * Created by galih on 1/5/2015.
 */
public class Kontak {
    public String nama;
    public String email;
    public String telepon;

    @Override
    public String toString() {
        return "Nama : " + nama + "\n" +
                "Telepon : " + telepon + "\n" +
                "Email : " + email;
    }
}
