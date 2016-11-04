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

public class Dhaba extends AppCompatActivity {
    ListView dhabas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("DHABAS");
        setContentView(R.layout.activity_dhaba);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        dhabas=(ListView)findViewById(R.id.dhabas);
        final String Dhabas[]=new String[]{"Lucky Dhaba",
                "Kuldeep Dhaba",
                "Amar Vaishno Dhaba",
                "Ajay Kumar Dhaba",
                "Baba Banab Dhaba",
                "Tilak Dhaba",
                "Saveta Dhaba",
                "Prince Dhaba",
                "Gurdeep Vaishno Dhaba",
                "Gagan Dhaba",
                "Chandan Dhaba",
                "Bittu Dhaba",
                "Suresh Singh",
                "Lala Vaishno Dhaba",
                "Chopra Refreshment",
        };

        String Address[]=new String[]{"Opposite Clock Tower",
                "5, Focal Point, Main Road",
                "New Market, Guru Nanak Timber Lakkar Bazar, B 7, 893",
                "Gt Road, Opposite Railway Station",
                "Uttam Nagar, Focal Point, Phase 8",
                "New Shakti Nagar",
                "Gali No 6, New Shakti Nagar",
                "G K Estate, Chandigarh Road",
                "G K Estate, Chandigarh Road",
                "Mundia Khurd",
                "Jamalpur Awana, Chandigarh Road",
                "Opposite Arti Cinema, Ferozepur Road",
                "Industrial Area A",
                "Transport Nagar, P No 17, Shop No 4",
                "Opposite Clock Tower"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,Dhabas);
        dhabas.setAdapter(adapter);

        dhabas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Dhaba.this,DhabaFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("name",Dhabas[position]);
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
