package com.example.paritosh.ldh;

import android.content.Intent;
import android.net.Uri;
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

public class CinemasFinal extends AppCompatActivity {
    TextView Address,Phone;
    ImageButton MakeACall;
    String address[]=new String[]{
            "531/2 B-20, Ghumar Mandi, Civil Lines, Ghumar Mandi, Ludhiana, Punjab 141001",
            "Firozpur Road, Near Aarti Chowk, G.T Road, Ludhiana - 141001",
            "Omaxe Plaza, 4th Floor, Omaxe Plaza, Firozpur Road, Ludhiana - 141001",
            "Jmd Govardhan City Centre, Ludhiana - 141008",
            "Janak Puri, Ludhiana - 140001",
            "Dalip Singh Market, Partap Chowk, Ludhiana - 141008",
            "Agar Nagar, Ludhiana - 141001",
            "Samrala Road, Samrala Chowk, Ludhiana - 141008",
            "Sant Ishwar Singh Nagar, Near Clock Tower, G T Road, Ludhiana - 141008 Flames Mall, Ludhiana - 141001",
            "Flames Mall, Ludhiana - 141001",
            "531/2 B-20, Civil Line, Ghumar Mandi, Ludhiana - 141001",
            "Near Railway Station, Jmd Govardhan City Centre, Ludhiana 141008"

    };

    String phone[]=new String[]{
            "0161 240 4291",
            "0161 240 9185",
            "0161 654 0128",
            "0161 508 9999",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "0161 468 8666",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "9855024427",
            "NOT AVAILABLE",
            "0161 508 9999"};
    String PhoneNumbers[]=new String[]{
            "tel:01612404291",
            "tel:01612409185",
            "tel:01616540128",
            "tel:01615089999",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:01614688666",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:9855024427",
            "NOT AVAILABLE",
            "tel:01615089999"};


    Button GoTo;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Address=(TextView)findViewById(R.id.AddressP);
        Phone=(TextView)findViewById(R.id.Phone);
        MakeACall=(ImageButton)findViewById(R.id.MakeACall);
        GoTo=(Button)findViewById(R.id.locate);

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION",0);
        name=it.getStringExtra("LOCATION");
        setTitle(name);
        Address.setText(address[position]);
        Phone.setText(phone[position]);

        MakeACall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                if (position == 4 || position == 5 || position == 7 || position == 8) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Sorry, Phone Number not available", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    callIntent.setData(Uri.parse(PhoneNumbers[position]));
                    startActivity(callIntent);
                }
            }
        });

        GoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CinemasFinal.this,MapLocation.class);
                it.putExtra("LOCATION",name);
                it.putExtra("POSITION",position);
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
