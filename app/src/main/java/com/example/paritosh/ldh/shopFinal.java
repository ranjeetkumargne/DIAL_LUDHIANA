package com.example.paritosh.ldh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class shopFinal extends AppCompatActivity {
    String name;
    String [] address = new String[]
            {
                    "Ansal Plaza Mall Opp. Circuit House, Ferozpur Road Gurdev Nagar, Ludhiana Pincode - 141001",
                    "Flamez Mall Malhar Cinema Road Gurdev Nagar Ludhiana",

                    "Global Mall Ferozpur Ludhiana",

                    "JMD Goverdhan City Centre G.T.Road Ludhiana",

                    "MBD Neopolis Ferozpur Road Adjacent to Rajguru Nagar Ludhiana Pincode - 141001, Phone Number - 0161-4305000, E-Mail-info@mbdneopolis.com",

                    "Omaxe Mall alandhar Bypass GT Road Ludhiana",

                    "Omaxe Plaza Opposite Park Plaza Hotel Ferozpur Road Ludhiana, Pincode – 141001",

                    "Pavilion Mall Fountain Chowk Ludhiana, Phone Number - 0124 4984000",

                    "The Celebration Bazaar DreamCity Gobindgarh - Khanna, G.T.Road 25 minutes  drive  from  Ludhiana  City  DISTT  Ludhiana. Pincode – 141401, Phone Number - 0162 - 8645973/74",
                    "The Silver Arc Mall Ferozpur Road Ludhiana, Pincode – 141001",

                    "The Westend Mall NH95, Housing Board Colony Ferozpur Road Ludhiana, Pincode - 141012"
            };


    TextView addressT;
    ImageButton MakeACall;
    Button GoTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_shop_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION",0);
        name=it.getStringExtra("LOCATION");
        setTitle(name);
        addressT=(TextView)findViewById(R.id.address);
        MakeACall=(ImageButton)findViewById(R.id.MakeACall);
        GoTo=(Button)findViewById(R.id.locate);

        addressT.setText(address[position]);
        MakeACall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Sorry, Phone Number not available", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        GoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(shopFinal.this,MapLocation.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",name);
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
