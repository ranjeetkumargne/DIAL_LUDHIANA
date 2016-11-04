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

public class Business extends AppCompatActivity {
    ListView business;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        business = (ListView)findViewById(R.id.business);
        final String [] businesscollege = new String[]
                {
                        "Baba Kundan Rural College of Education",
                        "AS College of Education, Kalalmajra",
                        "B.C.M. College of Education",
                        "Bhutta College of Education",
                        "D. D. Jain College of Education",
                        "GHG College of Teacher Training",
                        "GHG Harprakash College for Women",
                        "G.H.G. Khalsa College Of Education",
                        "GMT College of Education",
                        "Gobindgarh College of Education",
                        "Doraha College of Education for Women",
                        "Devki Devi Jain Memorial College for Women",
                        "S. R. S Govt. Polytechnic College for Girls",
                        "SDP College for Women",
                        "Partap College of Education, Ludhiana",
                        "Malwa Central College of Education For Women",
                        "K.S College, Ludhiana",
                        "Guru Nanak College of Education, Ludhiana",
                        "National College for Women, Machhiwara"
                };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,businesscollege);
        business.setAdapter(adapter);
        business.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Business.this,BusinessFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("name",businesscollege[position]);
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
