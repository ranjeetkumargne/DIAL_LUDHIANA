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

public class Education extends AppCompatActivity {
    ListView edu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        edu = (ListView)findViewById(R.id.Edu);

        String institutes[] = new String[]{"Play School","High School","Senior Secondary","Professional Colleges"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,institutes);
        edu.setAdapter(adapter);

        edu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                       @Override
                                       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                           if (position == 0) {
                                               Intent it = new Intent(Education.this, PlaySchool.class);
                                               startActivity(it);
                                           }
                                           if (position == 1) {
                                               Intent it = new Intent(Education.this, HighSchool.class);
                                               startActivity(it);
                                           }
                                           if (position == 2) {
                                               Intent it = new Intent(Education.this, SeniorSecondary.class);
                                               startActivity(it);
                                           }
                                           if (position == 3) {
                                               Intent it = new Intent(Education.this, Professional.class);
                                                startActivity(it);
                                           }

                                       }
                                   });

            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
    }

}
