package com.example.hp_pc.debtapp;

/**
 * Created by HP-PC on 2/18/2017.
 */

public class ItemObject {
    private String mName;
    private String mValue;

    public ItemObject(String name, String value) {
        mName = name;
        mValue=value;
    }

    public String getName(){
        return mName;
    }
    public String getValue(){
        return mValue;
    }

}
