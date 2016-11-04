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

public class HotelsFinal extends AppCompatActivity {
    TextView address,phone;
    ImageButton MakeACall;
    Button GoTo;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_hotels_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        address=(TextView)findViewById(R.id.place);
        GoTo=(Button)findViewById(R.id.locate);
        phone = (TextView)findViewById(R.id.mobile);
        MakeACall = (ImageButton)findViewById(R.id.MakeACall);

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION",0);
        name = it.getStringExtra("LOCATION");
        setTitle(name);
        String [] Address = new String[]
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
        address.setText(Address[position]);
        phone.setText("PHONE NOT AVAILABLE");
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
                Intent it = new Intent(HotelsFinal.this,MapLocation.class);
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
