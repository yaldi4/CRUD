package com.ghali.crud.database;

import com.ghali.crud.model.Kontak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by galih on 1/5/2015.
 */
public class KontakDatabase {
    private static KontakDatabase KONTAK_DATABASE =
            new KontakDatabase();

    public static KontakDatabase getInstance() {
        return KontakDatabase.KONTAK_DATABASE;
    }

    private KontakDatabase() {
        //Kelas Singleton
    }

    private List<Kontak> list = new ArrayList<Kontak>();

    public void add(Kontak kontak) {
        list.add(kontak);
    }

    public List<Kontak> findAll() {
        return list;
    }
}
