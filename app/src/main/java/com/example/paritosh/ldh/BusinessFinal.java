package com.example.paritosh.ldh;

import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class BusinessFinal extends AppCompatActivity {
    TextView Details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent it = getIntent();
        int position = it.getIntExtra("POSITION",0);
        String name = it.getStringExtra("name");
        super.onCreate(savedInstanceState);
        setTitle(name);
        setContentView(R.layout.activity_business_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Details = (TextView)findViewById(R.id.Details);
        String[] address = new String[]
                {
                        "Ludhiana , Punjab, Established in 2000, Bachelor of Education, 9 - 12 Months",

                        "Ludhiana , Punjab,Established in 2006, Bachelor of Education, 9 - 12 Months",

                        "Ludhiana , Punjab, Established in 1998, Bachelor of Education, 9 - 12 Months",

                        "Ludhiana , Punjab, Established in 2007, Bachelor of Education, 9 - 12 Months",

                        "Ludhiana , Punjab, Established in 1999, Bachelor of Education, 9 - 12 Months",

                        "Ludhiana , Punjab, Established in 1955, Elementry Teacher Education, 1 - 2 Years",

                        "Ludhiana , Punjab, Established in 1955, Bachelor of Education, 9 - 12 Months",

                        "Ludhiana , Punjab, Established in 1955, Bachelor of Education, 9 - 12 Months",

                        "Fee Range: Less than 50K, Ludhiana , Punjab, Established in 2005, Bachelor of Education, 9 - 12 Months",

                        "Fee Range: Less than 50K, Ludhiana , Punjab, Established in 2005, Bachelor of Education, 9 - 12 Months",

                        "Ludhiana , Punjab, Established in 2005, Bachelor of Education, 9 - 12 Months , Fee Range: Less than 50K",

        "Ludhiana , Punjab, Established in 1971, Bachelor of Education, 9 - 12 Months, Fee Range: Less than 50K",

        "Ludhiana , Punjab, Established in 1994, Diploma in Modern Office Practice, 2 - 3 Years",

        "Ludhiana , Punjab, Established in 1968, Diploma in Personal Grooming, 9 - 12 Months",

        "Ludhiana , Punjab, Established in 2000, Bachelor of Education, 9 - 12 Months",

                "Ludhiana , Punjab, Bachelor of Education, 9 - 12 Months",

                "Ludhiana , Punjab",

                "Ludhiana , Punjab, Established in 2006, Bachelor of Education, 9 - 12 Months, Fee Range: Less than 50K",

        "Ludhiana , Punjab, Established in 1985, Nursery Teacher Training, 9 - 12 Months",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1, address);

        Details.setText(address[position]);

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
