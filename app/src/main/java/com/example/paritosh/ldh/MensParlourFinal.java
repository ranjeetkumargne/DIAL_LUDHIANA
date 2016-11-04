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

public class MensParlourFinal extends AppCompatActivity {

    String [] Address = new String[]
            {
                    "Shop No 9, Main Market, Rajguru Nagar, Ludhiana - 141012",
                    "Sat Sang Road, Civil Line, Ludhiana - 141001",
                    "44- C, Main Market, Kitchlu Nagar, Ludhiana - 141001",
                    "18- H, Mini Market, Sarabha Nagar, Ludhiana - 141001",
                    "Model Town, Ludhiana - 141001",
                    "Sua Road, Dhandari Kalan, Ludhiana - 141001",
                    "Pakhowal Road, Ludhiana - 141001",
                    "132, Green Park, Opposite Prince Hostel, Civil Lines, Ludhiana - 141001",
                    "No.1202, Model Town Extension, Dugri Road, Ludhiana - 141002",
                    "44- C, Main Market, Kitchlu Nagar, Ludhiana - 141001",
            };
    TextView address;
    ImageButton MakeACall;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_mens_parlour_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION", 0);
        String name = it.getStringExtra("name");
        setTitle(name);

        address=(TextView)findViewById(R.id.address);
        MakeACall=(ImageButton)findViewById(R.id.MakeACall);

        address.setText(Address[position]);
        MakeACall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Sorry, Phone Number not available", Toast.LENGTH_SHORT);
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
