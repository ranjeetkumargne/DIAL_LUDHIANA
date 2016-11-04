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

public class Cinemas extends AppCompatActivity {
    ListView cinema;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cinema=(ListView)findViewById(R.id.Cinema);
        final String [] cinemas =new String[]{
                "CINE ENTERPRISES",
                "AARTI CINEMA",
                "SRS CINEMAS",
                "SOLITAIRE CINEMAS",
                "MANJU CINEMA",
                "SANGEET TAKIZ",
                "WAVE CINEMA",
                "SHRINGAR CINEMA",
                "RAIKHY THEATRE",
                "PVR CINEMA",
                "MANJU CINEMA",
                "SOLITAIRE CINEMAS",

        };
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,cinemas);
        cinema.setAdapter(adapter);
        cinema.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Cinemas.this,CinemasFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",cinemas[position]);
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
