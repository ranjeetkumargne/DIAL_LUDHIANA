package com.example.paritosh.ldh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class FireFinal extends AppCompatActivity {
    TextView place,phoneNo;
    ImageButton CallButton;
    String FireServiceAddress[] = new String[]{
            "B-575/7, II Floor, Overlock Road, Ludhiana, 141001, Punjab, India ",
            "Control Room, Gurdev Nagar, Ludhiana, 141001, Punjab, India ",
            "Malerkotla Road, Nalwa Chowk, Raikot, Ludhiana, 141109, Punjab, India",
            "Street No.1, G T Road, Daba Road, Ludhiana, 141014, Punjab, India ",
            "Near Gora Factory Extension, Industrial Area A, Ludhiana, 141003, Punjab, India ",
    };

    String PhoneNumbers[] = new String[]
            {
                    " 9216426512",
                    " 016101",
                    " 9417783072",
                    " 01612543087",
                    " 9815000966"
            };

    String CallNumbers[] = new String[]
            {
                    "tel:9216426512",
                    "tel:016101",
                    "tel:9417783072",
                    "tel:01612543087",
                    "tel:9815000966"
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_fire_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION", 0);
        String name = it.getStringExtra("name");
        setTitle(name);

        place = (TextView)findViewById(R.id.place);
        phoneNo = (TextView)findViewById(R.id.phoneNo);
        CallButton = (ImageButton)findViewById(R.id.CallButton);


        place.setText(FireServiceAddress[position]);
        phoneNo.setText(PhoneNumbers[position]);


        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse(CallNumbers[position]));
                startActivity(callIntent);
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
