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

public class DhabaFinal extends AppCompatActivity {
    ImageButton MakeACall;
    TextView address,phone;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_dhaba_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MakeACall=(ImageButton)findViewById(R.id.MakeACall);
        address=(TextView)findViewById(R.id.place);
        phone=(TextView)findViewById(R.id.mobile);
        Intent it = getIntent();
        int position = it.getIntExtra("POSITION",0);
        String name = it.getStringExtra("name");
        setTitle(name);
        address.setText(Address[position]);
        phone.setText("NOT AVAILABLE");

        MakeACall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"Sorry, Phone Number not available", Toast.LENGTH_SHORT);
                toast.show();
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
