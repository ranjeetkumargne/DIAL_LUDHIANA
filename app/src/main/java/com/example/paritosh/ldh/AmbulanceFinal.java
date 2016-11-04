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

public class AmbulanceFinal extends AppCompatActivity {

    String[] address =new String[]{
            "Mall Road, Ludhiana",
            "Brown Road, Ludhiana",
            "Civil Lines, Ludhiana",
            "452, HIG Colony, Ludhiana",
            "Bharat Nagar Chowk, Ludhiana",
            "Sarabha Nagar, Ludhiana",
            "3164, Gurdev Nagar, Near Baba Gajju Di Samadh, Ludhiana141001",
            "Shinagar Cinema Road, Near Baba Than Singh Chowk, Ludhiana141008",
            "11D, Kitchlu Nagar, Ludhiana141001",
            "H.No.3839, Hargobindpura, W.No.19, Sherpur Khurd, Sherpur Khurd, Ludhiana141010",
            "Office No. 125, Near Obc, Street No.03, Bhamian Khurd, Chandigarh Road, Ludhiana141010",
            "Old Sabzi Mandi Chowk, G T Road, G T Road Ludhiana, Ludhiana141003",
            "Medicity Hospital, Ferozepur Road, Ludhiana141001",
            "C/O Civil Hospital, Field Ganj, Old Jail Road, Field Ganj, Ludhiana141004",
            "G T Road, Doraha, Ludhiana141421",
            "309, New Jawahar Nagar, Ludhiana Ho, Ludhiana141001",
            "Vill Bassian, Near Jagraon Ludhiana, Jagraon, Ludhiana142026",
            "Hospital Road, Sherpur",
            "Bhamian Khurd, Ludhiana141010, Near Oriental Bank Of Commerce",
            "Sherpur Road, Sherpur ...",
            "Brown Road, CMC Hospit",
            "Sherpur Khurd, Sherpur",
            "Old Jail Road, Field G.. ",
            "Medicity Hospital, Fer",
            "Side GNE college, Ishernagar",
            " G T, G T Road",
            "Sherpur Chowk, Sherpur",
            "Sherpur Chowk, Sherpur.",
    };


    String phones[]=new String[]{
            "01612401141",
            "01612669924",
            "01612470052",
            "01612671717",
            "01612426150",
            "01612461737",
            "01612400877",
            "01613292806",
            "01612301476",
            "9501554059",
            "8283840777",
            "01612743053",
            "9914428685",
            "9501500101",
            "01628258815",
            "9815595940",
            "9815651114",
            "9815357947",
            "8283840777",
            "9888521425",
            "9815357947",
            "9501554059",
            "9501500101",
            "9914428685",
            "9815040360",
            "1612743053",
            "9815357947",
            "8727980600",
    };
    String[] telephones = new String[]{
            "tel:01612401141",
            "tel:01612669924",
            "tel:01612470052",
            "tel:01612671717",
            "tel:01612426150",
            "tel:01612461737",
            "tel:01612400877",
            "tel:01613292806",
            "tel:01612301476",
            "tel:9501554059",
            "tel:8283840777",
            "tel:01612743053",
            "tel:9914428685",
            "tel:9501500101",
            "tel:01628258815",
            "tel:9815595940",
            "tel:9815651114",
            "tel:9815357947",
            "tel:8283840777",
            "tel:9888521425",
            "tel:9815357947",
            "tel:9501554059",
            "tel:9501500101",
            "tel:9914428685",
            "tel:9815040360",
            "tel:1612743053",
            "tel:9815357947",
            "tel:8727980600",
    };

    TextView place,mobileNo;
    ImageButton Call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        setTitle(name);
        setContentView(R.layout.activity_ambulance_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final int position = intent.getIntExtra("POSITION",0);

        Call = (ImageButton)findViewById(R.id.Call);
        place = (TextView)findViewById(R.id.place);
        mobileNo = (TextView)findViewById(R.id.phoneNo);

        place.setText(address[position]);
        mobileNo.setText(phones[position]);

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse(telephones[position]));
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
