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

public class Ambulance extends AppCompatActivity {
    ListView Ambulances;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent in = getIntent();
        Ambulances=(ListView)findViewById(R.id.Ambulances);

        final String[] names =new String[]{
                "Arora Neuro Center",
                "CMC Hospital",
                "DMC Hospital",
                "Dr. Satish Nooria Hospital",
                "ESI Hospital",
                "Satluj Hospital",
                "Kalyan Hospital",
                "Kalra Hospital",
                "Kulwant Heart Centre",
                "Monty Ambulance Service",
                "Goodwill Rescue & Healthcare Services",
                "Dr B L Kapur Ambulance Services",
                "Manmeet Ambulance",
                "Samvedna NGO",
                "Sidhu Ambulance Services",
                "Centre For Retinal Diseases",
                "Gurudwara Baba Shaheed Ambulance Service",
                "Bhai Kanhaiya Ji Ambulance",
                "Goodwill Rescue & Healthcar",
                "Inder Ambulance Service",
                "Ravindera Ambulance Service",
                "Monty Ambulance Service",
                "Samvedna NGO",
                "Manmeet Ambulance",
                "Blessings Homecare Pvt Ltd",
                "Bittu Ambulance",
                "Ravindera Ambulance Service",
                "Dr B L Kapur Ambulance Services",
        };

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,names);

        Ambulances.setAdapter(adapter);

        Ambulances.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Ambulance.this,AmbulanceFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("NAME",names[position]);
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
