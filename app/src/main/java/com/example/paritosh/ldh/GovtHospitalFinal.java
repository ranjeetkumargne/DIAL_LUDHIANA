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

public class GovtHospitalFinal extends AppCompatActivity {
    Button location;
    String [] govthospital = new String[]
            {
                    "Pal Hospital, Model Town",
                    "Hero DMC Heart Institute, Civil Lines",
                    "RG Stone & Super Speciality Hospital, Model Town",
                    "ESI Corp., G.T. Road",
                    "ESI Corp., Lajpat Nagar",
                    "Paramount Healthcare Services Ltd., Pakhowal Road",
                    "Avasthi Hospital, Civil Lines",
                    "Jainsons India, Ludhiana",
                    "Rattan Hospital, Harcharan Nagar",
                    "Sanjivani Hospital & Dibesity Research Centre, Civil Lines",
                    "Mohan Dai Oswal Cancer Hospital, G.T. Road",
                    "Christian Medical College & Hospital, Brown Road",
                    "Life Line Hospital, Gill Road",
                    "Satguru Pratap Singh Apollo Hospitals, G.T. Road",
                    "Dayanand Medical College & Hospital, Civil Lines",
                    "Dewan Hospital & Advanced Laparoscopic Surgery Centre, Civil Lines",
                    "GK Hospital, G.T. Road",
                    "Gupta Hospital, Haibowal Kalan",
                    "Guru Teg Bahadur Sahib Hospital, Model Town",
                    "Karan Hospital, Kochar Market Road"
            };
    String [] place = new String[]
            {
                    "Government Hospitals, No. 517R, Atam Nagar, Model Town, Ludhiana – 141002",

                    "Government Hospitals, 1st Floor, Tagore Nagar, Civil Lines, Ludhiana – 141001",

                    "Government Hospitals, No. L510, Model Town, Ludhiana – 141002",

                    "Government Hospitals, Taran Singh, Hero Nagar, G.T. Road, Ludhiana – 141003",

                    "Government Hospitals, #449/3, Lajpat Nagar, Ludhiana – 141001",

                    "Government Hospitals, No. SCO 138, 3rd Floor, Feroz Ghandi Market, Pakhowal Road, Ludhiana –141001, Sulekha score1.4",

                    "Government Hospitals, No. 135, Green Park, Civil Lines, Ludhiana – 141001",

                    "Government Hospitals, Also Servicing in : Ludhiana",

                    "Government Hospitals, No. 2, Samrala Road, Harcharan Nagar, Ludhiana - 141008",

                    "Government Hospitals, Chander Nagar, Civil Lines, Ludhiana – 141010",

                    "Government Hospitals No. 45, Sherpur Bypass, G.T. Road, Ludhiana – 141001",

                    "Government Hospitals, 1st Floor, Brown Road, Ludhiana – 141008",

                    "Government Hospitals, No. 1661/9, Maheshwari Complex, Gill Road, Ludhiana 141003",

                    "Government Hospitals, Sherpur Chowk, G.T. Road, Ludhiana – 141003",

                    "Government Hospitals, Tagore Nagar, Civil Lines, Ludhiana – 141001",

                    "Government Hospitals, No. 452/2, Sangat Road, Civil Lines, Ludhiana – 141001",

                    "Government Hospitals, No. 3, G.T. Road, Ludhiana – 141003",

                    "Government Hospitals, Haibowal Kalan Main Raod, Haibowal Kalan, Ludhiana – 141001",

                    "Government Hospitals, Shastri Nagar,Model Town Road, Model Town, Ludhiana – 141002",

                    "Government Hospitals, Bagdi Park, Kochar Market Road, Ludhiana141008",
            };

    String [] Contact = new String[]
            {
                    "9216180527",
                    "01612304284",
                    "01614618585",
                    "1800112526",
                    "1800112526",
                    "01615016819",
                    "01612448026",
                    "9915050433",
                    "9876233422",
                    "9851457556",
                    "01612676100",
                    "01615010809",
                    "01612501741",
                    "088720 27036",
                    "01614688800",
                    "9417209502",
                    "01616546722",
                    "9417600009",
                    "9463566303",
                    "01612407908"

            };


    String [] ContactNo = new String[]
            {
                    "tel:9216180527",
                    "tel:01612304284",
                    "tel:01614618585",
                    "tel:1800112526",
                    "tel:1800112526",
                    "tel:01615016819",
                    "tel:01612448026",
                    "tel:9915050433",
                    "tel:9876233422",
                    "tel:9851457556",
                    "tel:01612676100",
                    "tel:01615010809",
                    "tel:01612501741",
                    "tel:088720 27036",
                    "tel:01614688800",
                    "tel:9417209502",
                    "tel:01616546722",
                    "tel:9417600009",
                    "tel:9463566303",
                    "tel:01612407908"
            };
    String GoTo;
    TextView Place,MobileNo;
    ImageButton CallButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_govt_hospital_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        location=(Button)findViewById(R.id.locate);

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION",0);
        GoTo = it.getStringExtra("LOCATION");
        setTitle(GoTo);
        MobileNo = (TextView)findViewById(R.id.MobileNo);
        Place = (TextView)findViewById(R.id.Place);
        CallButton = (ImageButton)findViewById(R.id.CallButton);

        MobileNo.setText(Contact[position]);
        Place.setText(place[position]);

        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse(ContactNo[position]));
                startActivity(callIntent);

            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(GovtHospitalFinal.this,MapLocation.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",GoTo);
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
