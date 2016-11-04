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

public class shop extends AppCompatActivity {
    ListView shops;
    String [] mall =new String[]
            {
                    "Ansal Plaza ",
                    "Flamez Mall ",
                    "Global Mall Ferozpur Road ",
                    "JMD Goverdhan City Centre ",
                    "MBD Neopolis ",
                    "Omaxe Mall ",
                    "Omaxe Plaza ",
                    "Pavilion Mall ",
                    "The Celebration Bazaar Gobindgarh Khanna",
                    "Silver Arc Mall ",
                    "Westend Mall ",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SHOPS AND MALLS");
        setContentView(R.layout.activity_shop);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        shops = (ListView)findViewById(R.id.shops);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,mall);
        shops.setAdapter(adapter);

        shops.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(shop.this,shopFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",mall[position]);
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
