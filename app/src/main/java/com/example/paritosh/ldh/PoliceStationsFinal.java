package com.example.paritosh.ldh;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class PoliceStationsFinal extends AppCompatActivity {
    String[] address = new String[]
            {
                    "Mair Market, Near Daba Chowk",

                    "Daresi Road, Near Daresi Ground Ludhiana, Ludhiana -141008 ",

                    "Police Station PS Dehlon ",

                    "Chaura Bazar, Near Clock Tower, Opp. Akal Market, Ludhiana-141008 ",

                    "Near Civil Hospital, Old Jail Road, Ludhiana -141008 ",

                    "Near Vashno Devi Chowk, Ludhiana -141008 ",

                    "Police Station PS Division No. 4 ",

                    "Near Durga Mata Mandir, Ferozepur Road, Ludhiana-141008 ",

                    "Near Dholewal Chowk, Ludhiana -141003 ",

                    "Near Vardhman Mill, Chd. Road, Ludhiana",

                    "Near Iqbal Nursing, Sadar Quarter, Ludhiana -141001 ",

                    "Near MD School, MIG Flats, Phase-1, Dugri , Ludhiana ",

                    "Phase-V, Near Railway Line, Focal Point, Ludhiana-141014 ",

                    "Near Pani di tanki, Corporation Park, Main Bazar, Haibowal, Ludhiana",

                    "Police Station PS Jamalpur ",

                    "Police Station PS Jodhewal ",

                    "Partapgarh to Ratangarh Road, Near Gurdwara, Koom Kalan, Ludhiana -141126 ",

                    "G.T. Road,Ladhowal Chowk, Ludhiana  -141008 ",

                    "Police Station PS Meharbaan ",

                    "Police Station PS Model Town ",

                    "Police Station PS Moti Nagar ",

                    "CPRC Building, CP Complex, Ferozepur Road, Ludhiana ",

                    "Police Station PS PAU ",

                    "Police Station PS Sadar ",

                    "Police Station PS Sahnewal ",

                    "Police Station PS Salem Tabri ",

                    "Police Station PS Sarabha Nagar ",

                    "Police Station PS Shimlapuri ",
            };


    String[] mobile = new String[]
            {
                    "09592914778",
                    "0161-2750078",
                    "9592914070 ",
                    "9592914721 ",
                    "9592914722 ",
                    "9592914723 ",
                    "9592914724 ",
                    "9592914725 ",
                    "9592914726 ",
                    "9592914727 ",
                    "9592914728 ",
                    "9592914776",
                    "9592914731 ",
                    "9592914733 ",
                    "9592914764",
                    "9592914736 ",
                    "9592914738 ",
                    "9592914739 ",
                    "9592914791",
                    "9592914729 ",
                    "9592914780",
                    "9592914740",
                    "9592914782",
                    "9592914734 ",
                    "9592914737 ",
                    "9592914735 ",
                    "9592914732 ",
                    "9592914730 ",
            };
    String[] eMail = new String[]
            {
                    "UNAVAILABLE",
                    "UNAVAILABLE",
                    "ps.dehlon.ldh.police@punjab.gov.in",
                    "ps.div1.ldh.police@punjab.gov.in",
                    "ps.div2.ldh.police@punjab.gov.in",
                    "ps.div3.ldh.police@punjab.gov.in",
                    "ps.div4.ldh.police@punjab.gov.in",
                    "ps.div5.ldh.police@punjab.gov.in",
                    "ps.div6.ldh.police@punjab.gov.in",
                    "ps.div7.ldh.police@punjab.gov.in",
                    "ps.div8.ldh.police@punjab.gov.in",
                    "UNAVAILABLE",
                    "ps.fclpnt.ldh.police@punjab.gov.in",
                    "ps.hbwl.ldh.police@punjab.gov.in",
                    "UNAVAILABLE",
                    "ps.jdwl.ldh.police@punjab.gov.in",
                    "ps.kumkln.khn.police@punjab.gov.in",
                    "ps.ldwl.ldh.police@punjab.gov.in",
                    "UNAVAILABLE",
                    "ps.mdltwn.ldh.police@punjab.gov.in",
                    "UNAVAILABLE",
                    "UNAVAILABLE",
                    "UNAVAILABLE",
                    "ps.sdr.ldh.police@punjab.gov.in",
                    "ps.shnwal.ldh.police@punjab.gov.in",
                    "ps.slmtbr.ldh.police@punjab.gov.in",
                    "ps.srbngr.ldh.police@punjab.gov.in",
                    "ps.smlpur.ldh.police@punjab.gov.in",
            };
    String[] MakeCall = new String[]
            {
                    "tel:09592914778",
                    "tel:01612750078",
                    "tel:9592914070",
                    "tel:9592914721",
                    "tel:9592914722",
                    "tel:9592914723",
                    "tel:9592914724",
                    "tel:9592914725",
                    "tel:9592914726",
                    "tel:9592914727",
                    "tel:9592914728",
                    "tel:9592914776",
                    "tel:9592914731",
                    "tel:9592914733",
                    "tel:9592914764",
                    "tel:9592914736",
                    "tel:9592914738",
                    "tel:9592914739",
                    "tel:9592914791",
                    "tel:9592914729",
                    "tel:9592914780",
                    "tel:9592914740",
                    "tel:9592914782",
                    "tel:9592914734",
                    "tel:9592914737",
                    "tel:9592914735",
                    "tel:9592914732",
                    "tel:9592914730",
            };

    TextView mobileNo, Email, place;
    ImageButton callButton;
    Button GMap;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_police_stations_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION", 0);
        name = it.getStringExtra("LOCATION");
        setTitle(name);
        mobileNo = (TextView) findViewById(R.id.mobile);
        GMap=(Button)findViewById(R.id.locate);
        place = (TextView) findViewById(R.id.place);
        Email = (TextView) findViewById(R.id.email);
        callButton = (ImageButton) findViewById(R.id.CallButton);

        mobileNo.setText(mobile[position]);
        Email.setText(eMail[position]);
        place.setText(address[position]);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse(MakeCall[position]));

                startActivity(callIntent);

            }
        });
        GMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(PoliceStationsFinal.this,MapLocation.class);
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
