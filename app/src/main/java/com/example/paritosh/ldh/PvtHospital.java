package com.example.paritosh.ldh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PvtHospital extends AppCompatActivity {
    ListView PrivateHospitals;
    String [] pvthospitals =new String[]
            {
                    "Kohli Hospital",
                    "Hero Dmc Heart Institute",
                    "Takyar Hospital",
                    "Sadana Nursing Home",
                    "Seth Hospital",
                    "Khosla Stone Kidney & Surgical Centre",
                    "Deol Hospital",
                    "Om Eye And Maternity Hospital",
                    "Gee Ess Heart Centre & General Hospital",
                    "Baba Deep Singh Charitable Hospital",
                    "Seth Hospital",
                    "Godra Dental And Implant Clinic",
                    "Khania Nursing Home",
                    "Ludhiana Mediways Hospital",
                    "Rattan Multispeciality Hospital",
                    "Khanna Nursing Home",
                    "Gill Hospital",
                    "Grewal Hospital",
                    "Hero Heart Centre",
                    "Rimal Hospital",
                    "AIMC Bassi Hospital",
                    "Khanna Nursing Home Multispeciality Centre",
                    "Gupta Hospital",
                    "Aggarwal Hospital",
                    "Deepak Hospital",
                    "Om Clinic",
                    "Gupta Hospital",
                    "Shri Krishna Hospital",
                    "Devi Dayal Hospital",
                    "Walia Hospital",
                    "Kulwant Heart Hospital",
                    "Puri Nursing Home",
                    "SPS Hospitals (Satguru Partap Singh Hospitals)",
                    "Kanchan Hospital",
                    "Manu Hospital",
                    "Kalyan Hospital",
                    "Deep Hospital",
                    "Jatinder Gambhir Hospital",
                    "Duggal College Of Science",
                    "Likhi Hospital",
                    "Arora Hospital",
                    "Gulati ENT And Allergy Hospital",
                    "City Nursing Home & Hospital",
                    "S K Health Care",
                    "Asian Multispeciality Hospital",
                    "BR Thakur Memorial Hospital",
                    "Dayanand Medical College & Hospital",
                    "Bal Nursing Home & Hospital",
                    "Passi Hospital",
                    "Khan Hospital"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PRIVATE HOSPITALS");
        setContentView(R.layout.activity_pvt_hospital);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PrivateHospitals = (ListView)findViewById(R.id.pvt);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,pvthospitals);
        PrivateHospitals.setAdapter(adapter);

        PrivateHospitals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(PvtHospital.this,PvtHospitalFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",pvthospitals[position]);
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
