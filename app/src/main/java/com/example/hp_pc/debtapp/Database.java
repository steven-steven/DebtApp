package com.example.hp_pc.debtapp;

import com.orm.SugarRecord;

/**
 * Created by nekhi on 2/18/2017.
 */

public class Database extends SugarRecord {

    String name;
    String moneyVal;
    String details;
    String password;

    public Database(){

    }

    public Database(String name, String moneyVal, String details) {
        this.name = name;
        this.moneyVal = moneyVal;
        this.details = details;
    }
}
