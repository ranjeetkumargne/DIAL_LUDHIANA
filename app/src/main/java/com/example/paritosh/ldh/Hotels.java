package com.example.paritosh.ldh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hotels extends AppCompatActivity {
    ListView Hotel;

    String [] hotels = new String[]
            {
                    "Radisson Blu Hotel  ",
                    "Hyatt Regency ",
                    "HOTEL ATITHI",
                    "Hotel City Lite",
                    "Hotel Onn",
                    "Keys Hotel",
                    "Radisson Blu Hotel ",
                    "Park Plaza ",
                    "City Heart Sarovar Portico",
                    "Fort Klassik",
                    "Imperial Executive",
                    "Hyatt Regency ",
                    "Hotel Maharaja Regency",
                    "Nirvana Hotel",
                    "Hotel Friends Regency",
                    "HOTEL ATITHI",
                    "Hotel Kohinoor",
                    "Hotel City Lite",
                    "Hotel Vikrant",
                    "Hotel Sartaj"
            };
    String [] address = new String[]
            {
                    "Ferozepur Road, Ludhiana",
                    "Ferozepur Road, Ludhiana",
                    "Clock Tower Area, Ludhiana",
                    "Brown Road, Ludhiana",
                    "Onn Lane, Ludhiana",
                    "City Centre, Ludhiana",
                    "Ferozepur Road, Ludhiana",
                    "Ferozepur Road, Ludhiana",
                    "Clock Tower Area, Ludhiana",
                    "Model Town, Ludhiana",
                    "Pakhowal Road, Ludhiana",
                    "Ferozepur Road, Ludhiana",
                    "Ferozepur Road, Ludhiana",
                    "Onn Lane, Ludhiana",
                    "Ferozepur Road, Ludhiana",
                    "Clock Tower Area, Ludhiana",
                    "City Centre, Ludhiana",
                    "Brown Road, Ludhiana",
                    "Bhadaur House, Ludhiana",
                    "Bhadaur House, Ludhiana"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Hotel=(ListView)findViewById(R.id.hotel);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,hotels);
        Hotel.setAdapter(adapter);

        Hotel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Hotels.this,HotelsFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",hotels[position]);
                startActivity(it);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
