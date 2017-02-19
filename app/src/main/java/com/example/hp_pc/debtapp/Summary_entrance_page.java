package com.example.hp_pc.debtapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.List;

import static com.example.hp_pc.debtapp.R.id.graph;

public class Summary_entrance_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_entrance_page);


        //Listener to take user to My Debtors Page
        Button myDebtorsPage = (Button)findViewById(R.id.bmydebtors);
        myDebtorsPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent entrancePageIntent = new Intent(Summary_entrance_page.this, Debtors.class);
                startActivity(entrancePageIntent);
            }
        });

        //Listener to take user to I Owe page if needed.
        Button owePage = (Button)findViewById(R.id.bowe);
        owePage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent entrancePageIntent = new Intent(Summary_entrance_page.this, Iowe.class);
                startActivity(entrancePageIntent);
            }
        });//

        GraphView graph = (GraphView) findViewById(R.id.graph);
        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[] {
                new DataPoint(1, 6),
                new DataPoint(2, 5)
        });
        graph.addSeries(series);
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(3);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(8);

        series.setSpacing(50);
/*
        LineChart chart = (LineChart) findViewById(R.id.chart);
        YourData[] dataObjects = ...;

        List<Entry> entries = new ArrayList<Entry>();

        for (YourData data : dataObjects) {

            // turn your data into Entry objects
            entries.add(new Entry(data.getValueX(), data.getValueY()));
        }*/

    }
}
