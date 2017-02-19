package com.example.hp_pc.debtapp;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by nekhi on 2/18/2017.
 */

public class Database extends SugarRecord {

    String name;
    String moneyVal;

    public Database(){

    }

    public Database(String name, String moneyVal) {
        this.name = name;
        this.moneyVal = moneyVal;
    }

    List<Database> getDatabaseByName(String name) {
        return Database.find(Database.class, "name = ?", name);
    }
}
