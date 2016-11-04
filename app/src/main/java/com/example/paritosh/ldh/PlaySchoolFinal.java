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

public class PlaySchoolFinal extends AppCompatActivity {
    String Address[] = new String[]
            {
                    "85-G, BRS Nagar, Ludhiana - 141001 ",
                    "B Xx 2648,LIC Building,Premjit Road, Gurdev Nagar, Ludhiana - 141001  ",
                    "H No-1079,Behind Vardhman Factory,Sec -32, Chandigarh Road, Ludhiana - 141003  ",
                    "2nd Add., Backside New Court, Model Gram, Ludhiana – 141002",

                    "Block-C, H.No. 80, Model Town Extension, Ludhiana – 141003",

                    "100, New Lajpat Nagar, Model Gram, Pakhowal Road, Ludhiana - 141001 ",
                    " 6-B,Near Rose Garden & Lions Club, Udham Singh Nagar, Ludhiana – 141001",
                    " Main Jassian Road, Haibowal, Ludhiana - 141004 ",
                    " Rishi Dayanand Road, PWD colony, Civil Lines, Ludhiana - 141001",
                    "485, G Block, Backside Aditya Hotel, BRS Nagar, Ludhiana - 141001",
                    "2110, Diving Road, Near BSNL Telephone Exchange Phase II, Durgi, Durgi ",
                    "Opposite Sector- 32, Near Amrit Dharam Kanda, Tajpur Road, Tajpur Road, Ludhiana, Punjab - 141010, India",

                    "Thapar Nagar, Near Jalandhar Bye Pass Chowk, Near Jalandhar Bye Pass Chowk Ludhiana, Punjab - ,India",
                    "Chandigarh Road, Near Palm City, Kohara, Kohara, Ludhiana, Punjab - 141008,India",
                    "-II Noble Enclave, Opp Parkplaza Hotel, Opp Parkplaza Hotel, Ludhiana, Punjab - 143001,India",
                    "Hambran Road, Adjacent To Radha Swami Satsang Ghar, Adjacent To Radha Swami Satsang Ghar, Ludhiana, Punjab - 141001,India",
                    "Phase II, Urban Estate, Dugri Road, Dugri Road,, Ludhiana, Punjab - 141002,India",

                    "18-H Sarabha Nagar , Ludhiana, Ludhiana, Punjab - 141001,India",

                    "Main Jassian Road Haibowal Kalan, Main Jassian Road Haibowal Kalan, Ludhiana, Punjab - ,India",
                    "Near Civil Surgeon's Office, Rishi Dayanand Road Civil Lines, Rishi Dayanand Road Civil Lines,, Ludhiana, Punjab - ,India",
                    "H.No. 1079, MIG, Behind Vardhman Factory, Sec- 32, Sec- 32, Ludhiana, Punjab 141003,India",
                    "2521, Urban Estate, Phase - 1, Dugri Rd, Dugri Rd, Ludhiana, Punjab - 141013,India",
                    "654, Adjacant Pizzeria, Gurudev Nagar, Gurudev Nagar, Ludhiana, Punjab - 141001,India",
                    "Lalton Road, Village Pamal, Ludhiana, Punjab - 141001,India",

                    "C-548 Phase-1, Urban State, Jamalpur, Jamalpur, Ludhiana, Punjab - 141010,India",

                    "31, Shakti Nagar, Off Pakhowal Road, Off Pakhowal Road,, Ludhiana, Punjab - 141002,India",
                    "55-56, Shere Punjab Colony, Shere Punjab Colony, Ludhiana, Punjab - 141001,India",
                    "1015, Shangla Wala Shivala Road, Near Post Office, Near Post Office, Ludhiana, Punjab - ,India",
                    "6-B Udham Singh Nagar, 6-B Udham Singh Nagar, Ludhiana, Punjab - ,India",

                    "West Room, Town Hall, Jagraon, Jagraon, Ludhiana, Punjab - 142026,India",

                    " Model Gram, Ludhiana",

                    " Dugri, Ludhiana",

                    " Jail Road, Ludhiana",

                    " Near Krishna Mandir, Ludhiana",

                    " Near Civil City, Ludhiana",

                    " Canal Road, Ludhiana",

                    " Randhir Singh Nagar, Ludhiana",

                    " Atam Nagar, Ludhiana",

                    " Netaji Nagar, Ludhiana",

                    " Atam Nagar, Ludhiana",

                    " Model Gram, Ludhiana",

                    " Sherpur Road, Ludhiana",

                    "Dashmesh Nagar, Ludhiana",


            };


    String phone[] = new String[]
            {
                    "tel:9316904652",
                    "tel:9501222444",
                    "tel:9914409374",
                    "tel:9988881151",
                    "tel:9915601938",
                    "tel:9814211132",
                    "tel:1614411135",
                    "tel:9872404915",
                    "tel:9814076576",
                    "tel:9501187373",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available"
            };

    String[] telephone = new String[]
            {
                    "9316904652",
                    "9501222444",
                    "9914409374",
                    "9988881151",
                    "9915601938",
                    "9814211132",
                    "1614411135",
                    "9872404915",
                    "9814076576",
                    "9501187373",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available",
                    "Not Available"
            };



    TextView PlaySchoolAdd,PlaySchoolPhone;
    ImageButton MakeACall2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setTitle("PROFILE");
        setContentView(R.layout.activity_play_school_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION", 0);
            String name = it.getStringExtra("name");
            setTitle(name);
        PlaySchoolAdd=(TextView)findViewById(R.id.PlaySchoolAdd);
        PlaySchoolPhone=(TextView)findViewById(R.id.PlaySchoolPhone);

        PlaySchoolAdd.setText(Address[position]);
        PlaySchoolPhone.setText(telephone[position]);
        MakeACall2=(ImageButton)findViewById(R.id.MakeACall2);

            MakeACall2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            Intent callIntent = new Intent(Intent.ACTION_CALL);
                            if (position > 9) {
                                    Toast toast = Toast.makeText(getApplicationContext(), "Sorry, Phone Number not available", Toast.LENGTH_SHORT);
                                    toast.show();
                            } else {
                                    callIntent.setData(Uri.parse(phone[position]));
                                    startActivity(callIntent);
                            }

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
