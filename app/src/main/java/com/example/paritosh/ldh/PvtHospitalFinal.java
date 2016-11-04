package com.example.paritosh.ldh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PvtHospitalFinal extends AppCompatActivity {
    TextView Place;
    ImageButton CallButton;
    String [] address =new String[]
            {
                    "#1, Shakti Nagar, Pakhowal Road, Ludhiana, Punjab - India",
                    "Tagore Nagar Near Rose Garden, Ludhiana, Punjab - India",
                    "34, Dugri Rd, Dugri,  Ludhiana, Punjab - 141003,India",
                    "#593 - L, Model Town, Ludhiana, Punjab - India",
                    "21 Rose Enclave, Civil Lines, Ludhiana, Ludhiana, Punjab - India",
                    "451, Model Town,  Ludhiana, Punjab - 141002,India",
                    "G.T. Road, Mullanpur, Ludhiana, Punjab - India",
                    "993, Phase II, Urbsn Estate  Jamal Pur, Ludhiana, Punjab - India",
                    "2, Baba Than Singh Chowk Ludhiana, Ludhiana Ho, Ludhiana, Punjab - 141001,India",
                    "Green Avenue, Amritsar H O, Amritsar, Ludhiana Ho, Ludhiana, Punjab - 141001,India",
                    "21, Civil Lines,  Ludhiana, Punjab - 141001,India",
                    "907/ 15-A Tagore Nagar, Ludhiana, Punjab - India",
                    "833/3 Krishna Nagar, Opp.aarti Cinema, Ferozepur Road, Ludhiana, Punjab - 141001,India",
                    "Ferozepur Road,  Ludhiana, Punjab - 141001,India",
                    "Street Number- 2 & 3, Samrala Road, Ludhiana Ho, Ludhiana, Punjab – 141001 India",
                    "Opp Gill Petrol Pump GT Road Khanna, Ludhiana, Punjab - ,India",
                    "Hathur, Ludhiana, Punjab – 142031 India",
                    "Gill Road,  Ludhiana, Punjab - 141003,India",
                    "C/o Dayanand Medical Collage & Hospital, Department Of Corporate Cell, Ludhiana HO, Ludhiana, Punjab – 141001 India",
                    "14-F, Shahid Bhagat Singh Ngr, Pakhowal Road, Ludhiana, Punjab - India",
                    "200,Tagore Nagar, Opp Postal Colony, Ludhiana, Punjab - ,India",
                    "Opp.Gill Petrol Pump, G.T.Road, Ludhiana, Punjab - ,India",
                    "Kacha Malak Road, Near Railway Crossing, Ludhiana, Punjab - India",
                    "Hig-556, Focal Point Phase 4,  Ludhiana, Punjab - 141010,India",
                    "Opp. P.A.U. Gate No.1, Sarabha Nagar, Ludhiana, Punjab - India",
                    "F/01, Main Road, Dhandari Kalan, , Ludhiana, Punjab - 141014,India",
                    "23-South Model Gram, Near Kochar Market,  Ludhiana HO, , Ludhiana, Punjab - 141001,India",
                    "Model Town, Ludhiana, Punjab - 141002,India",
                    "81, Industrial Area A, Ludhiana, Punjab - 141003,India",
                    "33-B, Malhar Road, Sarabha Nagar Ludhiana, Ludhiana, Punjab - 141001,India",
                    "11-D, Kitchlu Nagar, Ludhiana, Ludhiana, Punjab - India",
                    "284-C, Model Town Extention. Ludhiana, Ludhiana, Punjab - ,India",
                    "SPS Hospital Grand Trunk Rd, Sherpur Chowk, Sherpur, Ludhiana, Punjab - 141001,India",
                    "Jalandhar Bye Pass, Salem Tabri, Ludhiana, Punjab – 141005 India",
                    "Main Road, Moti Nagar, Ludhiana, Punjab – 141009 India",
                    "Samrala Chowk, Ludhiana, Punjab – 141008 India",
                    "481, Model Town, Ludhiana Ho, Ludhiana, Punjab – 141001 India",
                    "C-23, Road, Shaheed Bhagat Singh Nagar Pakhowal, Ludhiana, Punjab - India",
                    "328, Bharat Nagar,  Ludhiana Ho, , Ludhiana, Punjab - 141001,India",
                    "Dr V.p Likhi Rd, Civil Lines,  Ludhiana, Punjab - 141001,India",
                    "28,  Railway Colony, 100ft Road, Sherpur, Ludhiana Ho, , Ludhiana, Punjab - 141001,India",
                    "594/ 1, Model Town, Ludhiana, Punjab - India",
                    "B-Xx/255, DR Sham Singh Road, Civil Lines, Ludhiana, Punjab - 141001,India",
                    "H-01, Main Road, Daba Road, Ludhiana, Punjab - 141014,India",
                    "Bhamia Road, Chandigarh Road, Ludhiana, Punjab - 141010,India",
                    "New Maya Nagar, Haibowal Kalan, Ludhiana, Punjab - 141001,India",
                    "Tagore Nagar, Civil Lines, Ludhiana, Punjab - 141001,India",
                    "Dr Sham Singh Rd, Ghumar Mandi, Ludhiana, Punjab - 141001,India",
                    "814, Madhopuri, Ludhiana, Punjab - 141008,India",
                    "Jagraon Rd, Bassian, Ludhiana, Punjab - 142032,India"
            };
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_pvt_hospital_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION", 0);
        name = it.getStringExtra("LOCATION");
        setTitle(name);
        Place = (TextView)findViewById(R.id.Place);
        CallButton = (ImageButton)findViewById(R.id.CallButton);

        Place.setText(address[position]);
        CallButton.setOnClickListener(new View.OnClickListener() {
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
