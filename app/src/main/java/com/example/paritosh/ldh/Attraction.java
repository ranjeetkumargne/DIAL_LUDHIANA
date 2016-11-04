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

public class Attraction extends AppCompatActivity {
    ListView places;
    String[] attractions =new String[]{
            "Gurudwara Nanaksar Jagroan",
            "Punjab Agricultural University Museum",
            "Rakh Bagh Park",
            "Phillaur Fort",
            "Maharaja Ranjit Singh War Museum",
            "Nehru Rose Garden",
            "Hardy's World",
            "Guru Nanak Bhawan",
            "Gurudwara Charan Kamal",
            "Punjab Rural Heritage Museum",
            "Deer Park",
            "Guru Nanak Stadium",
            "Gurudwara Shri Manji Sahib",
            "Oswal Mills Showroom",
            "Lodhi Fort",
            "Payal Fort",
            "Fun Sphere"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("ATTRACTIONS");
        setContentView(R.layout.activity_attraction);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        places=(ListView)findViewById(R.id.places);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,attractions);
        places.setAdapter(adapter);

        places.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Attraction.this,AttractionFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",attractions[position]);
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
