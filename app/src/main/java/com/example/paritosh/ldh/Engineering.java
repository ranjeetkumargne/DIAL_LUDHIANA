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

public class Engineering extends AppCompatActivity {
    String EngCol[]=new String[]
            {
                    "Gulzar Group of Institutes",
                    "Guru Nanak Dev Engineering College",
                    "Ludhiana College of Engineering and Technology",
                    "Bhutta College of Engineering and Technology",
                    "Ludhiana Group of Colleges",
                    "College of Agricultural Engineering - Punjab",
                    "College of Basic Science and Humanities - Punjab"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView eng=(ListView)findViewById(R.id.Eng);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,EngCol);
        eng.setAdapter(adapter);
        eng.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Engineering.this,EngineeringFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",EngCol[position]);
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
