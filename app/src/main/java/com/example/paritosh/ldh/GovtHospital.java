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

public class GovtHospital extends AppCompatActivity {
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

    String [] govthospitalMap = new String[]
            {
                    "Pal Hospital",
                    "Hero DMC Heart Institute",
                    "RG Stone & Super Speciality Hospital, Model Town",
                    "ESI Corp., G.T. Road",
                    "ESI Corp., Lajpat Nagar",
                    "Paramount Health Services Pvt Ltd",
                    "Avasthi Hospital",
                    "Jainsons India",
                    "Rattan Hospital",
                    "Sanjivani Hospital",
                    "Mohandai Oswal Cancer Hospital",
                    "Christian Medical College & Hospital",
                    "Life Line Hospital",
                    "SPS Hospitals",
                    "Dayanand Medical College & Hospital",
                    "Dewan Hospital & Advanced Laparoscopic Surgery Centre",
                    "GK Hospital",
                    "Gupta Hospital",
                    "Guru Teg Bahadur Sahib Hospital",
                    "Karan Hospital"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Government Hospital");
        setContentView(R.layout.activity_govt_hospital);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView govt = (ListView)findViewById(R.id.govt);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,govthospital);
        govt.setAdapter(adapter);

        govt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(GovtHospital.this,GovtHospitalFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",govthospitalMap[position]);
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
