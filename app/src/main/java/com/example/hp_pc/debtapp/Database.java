package com.example.hp_pc.debtapp;

import com.orm.SugarRecord;

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
}
