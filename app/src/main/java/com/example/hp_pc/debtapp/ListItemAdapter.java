package com.example.hp_pc.debtapp;

import android.app.Activity;
import android.content.ClipData;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by HP-PC on 2/18/2017.
 */

public class ListItemAdapter extends ArrayAdapter<ItemObject> {

    public ListItemAdapter(Activity context, ArrayList<ItemObject> ItemObjectList){
        super(context, 0, ItemObjectList);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemObject currentItemObject = getItem(position);

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.debt_item, parent, false);
        }

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon

        TextView nameView = (TextView) listItemView.findViewById(R.id.name);
        nameView.setText(currentItemObject.getName());

        TextView moneyValueView = (TextView) listItemView.findViewById(R.id.moneyValue);
        moneyValueView.setText(currentItemObject.getValue());

        return listItemView;
    }


}
