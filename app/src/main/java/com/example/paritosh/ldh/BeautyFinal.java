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

public class BeautyFinal extends AppCompatActivity {
    TextView add;
    ImageButton MakeACall;
    String Address[]=new String[]{"11-12, G T Road Ludhiana,  Ludhiana, Punjab - 141003,India",
            "Machhiwara,  Ludhiana, Punjab - 141115,India",
            "Kitchlu Nagar,  Ludhiana, Punjab - 141001,India",
            "Kohara Rd, Sanehwal,  Ludhiana, Punjab - 141120,India",
            "Main Road, Kot Mangal Singh, Ludhiana Ho, Ludhiana, Punjab - 141001,India",
            "Chandigarh Road, 33 Feet Road, Jamalpur, Ludhiana, Punjab - 141010,India",
            "Biscuit Factory Road, Karma Hospital, Shimlapuri,  Ludhiana, Punjab - 141003,India",
            "Sco 8 First Floor, Model Town Extension Market, Model Town, , Ludhiana, Punjab - 141002,India",
            "338, Shahpur Road, Field Ganj,  Ludhiana, Punjab - 141008,India",
            "3, Dashmesh Nagar, Ludhiana, Punjab - 141003,India",
            "Azad Nagar,  Ludhiana, Punjab - 141002,India",
            "Gill Road, Kadam Footwear,  Dashmesh Nagar, , Ludhiana, Punjab - 141003,India",
            "Near Radha Swami Dairy, Samrala,  Ludhiana, Punjab - 141114,India",
            "Kohara Road, Sanehwal,  Ludhiana, Punjab - 141120,India",
            "17 S C F, Brs Nagar, Ludhiana, Punjab - 141001,India",
            "Plot No-323, Street No-12, Model Gram, Ludhiana, Punjab - 141002,India",
            "Adj.makkar Bakery, Anarkali Bazar, Jagraon, Ludhiana, Punjab - 142026,India",
            "224 L, Model Town,  Ludhiana, Punjab - 141002,India",
            "Campa Cola Chowk, Link Road, Lucky Traders, Ludhiana Ho, Ludhiana, Punjab 141001,India",
            "Osis Cplx, Raikot RD, Mullanpur, Ludhiana, Punjab - 141101,India",
            "Shop No : 1219/6, Opp. Railway Crossing Harnam Nagar, New Model Town, Ludhiana, Punjab - 141002,India",
            "7-A, Moti Nagar, Ludhiana, Punjab - 141009,India",
            "Shop Number 7, Model Town, Ludhiana, Punjab - 141002,India",
            "Bus Stand Road, Lajpat Nagar, Pragati Traders, Model Town, , Ludhiana, Punjab - 141002,India",
            "H.No .-933 Plot No .-81 Maya Nagar, Civil Lines, , Ludhiana, Punjab - 141001,India",
            "Opposite 84 Pauria Wala Mandir, Opposite 84 Pauria Wala Mandir, Samrala, Ludhiana, Punjab - 141114,India",
            "01 Sham Nagar,  Ludhiana, Punjab - 141001,India",
            "31, Ashok Nagar,  Ludhiana, Punjab - 141008,India",
            "786-G, S.B.S Nagar, Near City Centre, Ludhiana,  Ludhiana, Punjab - 141003,India",
            "2112, St No-25, Gill Rd, Janta Nagar,  Ludhiana, Punjab - 141003,India",
            "Khambra Road, Kitchlu Nagar,  Ludhiana, Punjab - 141001,India",
            "Plot No - 10/1, St No - 9 Near A S Model School, Civil Lines, Ludhiana, Punjab - 141001, India",
            "Arjun DEV Nagar, Biscuit Factory Road, C P School, Ludhiana Ho, , Ludhiana, Punjab - 141001,India",
            "1298/15 A, St No - 10, Pakhowal Road, Ludhiana, Punjab - 141001,India",
            "83-J, Sarabha Nagar Ludhiana, , Ludhiana, Punjab - 141001,India",
            "Scf-26, Gt Road Urban Estate, Dugri, , Ludhiana, Punjab - 141003,India",
            "Basement Talwar Electrovision, St No 4, CMC Ludhiana,  Ludhiana, Punjab - 141008,India",
            "Ludhiana HO, Ludhiana, Punjab - 141001,India",
            "13, Main Deep Nagar Road, Ludhiana HO, Ludhiana, Punjab - 141001,India",
            "Ghumar Mandi, Ludhiana, Punjab - 141001,India",
            "Pakhowal Road, Ludhiana, Punjab - 141001,India",
            "1824, B-34, 02, Ludhiana Ho, Ludhiana, Punjab - 141001,India",
            "Shop No-13, Main Road, Ludhiana Ho, , Ludhiana, Punjab - 141001,India",
            "Sekhon Market, New Dana Mandi Mullanpur Dakha, Mullanpur Dakha, Ludhiana, Punjab - 141101,India",
            "Ludhiana Road, Ludhiana Road, Samrala,  Ludhiana, Punjab - 141114,India",
            "Scf-17, Brs Nagar,  Ludhiana, Punjab - 141001,India",
            "Bus Stand Chowk, Mullanpur Mandi,  Ludhiana, Punjab - 141101,India",
            "966, I Block, Arjun DEV Gurudwara, Brs Nagar, , Ludhiana, Punjab - 141001,India",
            "434/4, Ghumar Mandi,  Ludhiana, Punjab - 141001,India",
            "Kohara Road, Sanehwal,  Ludhiana, Punjab - 141120,India"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent it = getIntent();
        int position = it.getIntExtra("POSITION",0);
        String name = it.getStringExtra("name");
        setTitle(name);
        add=(TextView)findViewById(R.id.ph);
        MakeACall=(ImageButton)findViewById(R.id.MakeACall);

        add.setText(Address[position]);
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
