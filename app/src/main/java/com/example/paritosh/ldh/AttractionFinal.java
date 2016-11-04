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

public class AttractionFinal extends AppCompatActivity {
    String Address[]=new String[]{
            "Grand Trunk Rd, Samrala Chowk, Guru Arjan Dev Nagar, Ludhiana, Punjab 141012",
            "Ferozpur Road, Punjab Agricultural University, Ludhiana, Punjab 141001",
            "Near Railway Station, Ludhiana",
            "Punjab Police Academy Campus, Phillaur, Punjab 144410",
            "Grand Trunk Rd, Bhattian, Ludhiana, Punjab 141008",
            "Government College Rd, Near Government College, New Prem Nagar, Civil Lines, Ludhiana, Punjab 141001",
            "Ludhiana–Jalandhar, G.T. Road, Ludhiana, Punjab 141001",
            "98, Ferozpur Rd, Jila Kacheri Area, Model Gram, Ludhiana, Punjab 141001",
            "Machiwara, Charan Kamal Road",
            "Punjab Agricultural University, Ludhiana, Punjab 141004",
            "Ludhiana-Chandigarh Highway",
            "Club Rd, Near Mata Rani Mandir, Gandhi Nagar, Civil Lines, Ludhiana, Punjab 141001",
            "NH 1, Ludhiana, Punjab 141421",
            "Opposite Shri Niketan, Chaura Bazaar",
            "Address Not available",
            "Payal, Ludhiana District",
            "Fun Sphere, 2nd Floor, Silver Arc Mall, Ferozepur Rd, Gurdev Nagar, Ludhiana, Punjab 141001"
    };

    String phone[]=new String[]{
            "0161 222 2277",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "01612826195",
            "01612771395",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "01615052062",
            "NOT AVAILABLE",
            "01612745492",
            "NOT AVAILABLE",
            "NOT AVAILABLE",
            "01614660070"
    };
    String name;
    String contact[]=new String[]{
            "tel:01612222277",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:01612826195",
            "tel:01612771395",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:01615052062",
            "tel:NOT AVAILABLE",
            "tel:01612745492",
            "tel:NOT AVAILABLE",
            "tel:NOT AVAILABLE",
            "tel:01614660070",
    };
    TextView place,phn;
    ImageButton MakeACall;
    Button GoTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION",0);
        name=it.getStringExtra("LOCATION");
        setTitle(name);
        place=(TextView)findViewById(R.id.place);
        phn=(TextView)findViewById(R.id.phn);
        MakeACall=(ImageButton)findViewById(R.id.MakeACall);
        GoTo=(Button)findViewById(R.id.locate);

        place.setText(Address[position]);
        phn.setText(phone[position]);

        MakeACall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 1 || position == 2 || position == 3 || position == 4 || position == 5 || position == 8 || position == 9 || position == 10 || position == 12 || position == 14 || position == 15) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Sorry, Phone Number not available", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse(contact[position]));
                    startActivity(callIntent);
                }
            }
        });

        GoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(AttractionFinal.this,MapLocation.class);
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
