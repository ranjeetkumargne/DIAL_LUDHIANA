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
import android.widget.Button;
import android.widget.ListView;

public class Medical extends AppCompatActivity {
    ListView med;
    String Med[]=new String[]
            {
                    "Baba Jaswant Singh Dental College Hospital & Research Institute ",
                    "Baba Kundan College of Pharmacy  ",
                    "Christian Dental College ",
                    "Christian Medical & Brown Memorial Hospital School Of Nursing   ",
                    "Christian Medical College",
                    "Christian Medical College & Hospital ",
                    "Christian Medical College ",
                    "Dayanand Medical College & Hospital",
                    "Dayanand Medical College & Hospital College Of Nursing  ",
                    "Dayanand Medical College And Hospital College Of Nursing  ",
                    "Dr B L Kapoor Memorial Hospital  ",
                    "Dr. Mohan Kaur Memorial Nursing Institute  ",
                    "Durga School Of Nursing  ",
                    "Eastend School Of Nursing  ",
                    "Gujranwala Guru Nank Khalsa College of Pharmacy  ",
                    "Guru Angad Dev School Of Nursing  ",
                    "Guru Hargobind College Of Nursing  ",
                    "Guru Hargobind College of Pharmacy  ",
                    "Guru Horgobind College Of Nursing  ",
                    "Guru Nanak College Of Nursing  ",
                    "Guru Nanak School Of Nursing  Ludiana",
                    "Guru Teg Bahadur Hospital Instt. Of Nursing Education  ",
                    "Institute Of Nursing Education  ",
                    "Institute Of Nursing Education  ",
                    "Institute Of Nursing Education Guru Teg Bahadur Sahib C Hospital  ",
                    "Jeevan Jot Nursing Institute  ",
                    "Kiran Memorial Kular School Of Nursing  ",
                    "Kular College Of Nursing  ",
                    "Kular School Of Nursing  ",
                    "Lajjiawati Jain Memorial Nursing Institute  ",
                    "Lord Mahavira Homoeopathic Medical College",
                    "Institute Of Nursing  ",
                    "Mata Saraswati Institute Of Nursing Education  ",
                    "Mata Saraswati Nursing Institute  ",
                    "Mohan Dai Oswal Cancer Hospital  Treatment & Research Foundation  ",
                    "Mohan Dai Oswal College Of Nursing  ",
                    "Mohan Dai Oswal Memorial Hospital  School Of Nursing  ",
                    "Nightingale College Of Nursing  ",
                    "Nightingale Nursing Institute  ",
                    "S M L Memorial School Of Nursing  ",
                    "Sanjeevani College Of Nursing  ",
                    "Satguru Educational Welfare Society  ",
                    "Seth Madan Lal Memorial School Of Nursing  ",
                    "Shaheed Kartar Singh Sarabha College Of Nursing  ",
                    "Shaheed Kartar Singh Sarabha Dental College & Hospital  ",
                    "Shaheed Kartar Singh Sarabha School Of Nursing  ",
                    "Sidhu School Of Nursing Sidhu Educational & Res. Instt  ",
                    "Sigma Health Training Institute  ",
                    "Sigma Nursing Training Institute  ",
                    "Swami Vivekanand School Of Nursing"
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        med=(ListView)findViewById(R.id.med);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,Med);
        med.setAdapter(adapter);

        med.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Medical.this,MapLocation.class);
                it.putExtra("LOCATION",Med[position]);
                it.putExtra("POSITION",position);
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
