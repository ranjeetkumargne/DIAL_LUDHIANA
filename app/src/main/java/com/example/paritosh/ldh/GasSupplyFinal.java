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

public class GasSupplyFinal extends AppCompatActivity {
    TextView Address,Phone;
    ImageButton MakeACall;
    String address[] = new String[]{"Purani Sabzi Mandi, Deepak Band, G.T Road, Ludhiana, Punjab, India 141008",
            "Main Road, Kaku Telecom, Kot Mangal Singh, Ludhiana, Punjab, India 141003",
            "Shingar Cinema Road, Bharat Petrol Pump, Dhoka Mohalla, Ludhiana, Punjab, India 141008",
            "Krishna Nagar, Anand Dhaba, Krishna Nagar, Ludhiana, Punjab, India 141008",
            "City Colony, Near Ranjeet Singh Market, Grain Market, Ludhiana, Punjab, India 141120",
            "Jalandhar Bye Pass Chowk, Amar Palace, G.T Road, Ludhiana, Punjab, India 141008",
            "Dugri, Model Town, Chatar Singh Park, Model Town, Ludhiana, Punjab, India 141002",
            "M.M. Office Road, Nanak Gurdwara, Kashmir Nagar, Ludhiana, Punjab, India 141008",
            "Humbran Road, Manjeet Market, Choti Haibowal, Ludhiana, Punjab, India 141001",
            "New Model Town, Punjab Refrigeration & Electricals, Kochar Market, Ludhiana, Punjab, India 141002"};

    final String phone[]=new String[]{"9356303030",
            "9464612946",
            "NOT AVAILABLE",
            "01612445706",
            "01613299898",
            "NOT AVAILABLE",
            "9988991901",
            "9345596769",
            "01612427891",
            "9814923065"};
    String phoneCall[]=new String[]{"tel:9356303030",
            "tel:9464612946",
            "tel:NOT AVAILABLE",
            "tel:01612445706",
            "tel:01613299898",
            "tel:NOT AVAILABLE",
            "tel:9988991901",
            "tel:9345596769",
            "tel:01612427891",
            "tel:9814923065"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_gas_supply_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Address=(TextView)findViewById(R.id.Address_);
        Phone=(TextView)findViewById(R.id.Phone);
        MakeACall=(ImageButton)findViewById(R.id.MakeACall);
        Intent it = getIntent();
        final int position=it.getIntExtra("POSITION",0);
        String name = it.getStringExtra("name");
        setTitle(name);
        Address.setText(address[position]);
        Phone.setText(phone[position]);

        MakeACall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                if (position == 2 || position == 5) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Sorry, Phone Number not available", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    callIntent.setData(Uri.parse(phoneCall[position]));
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
