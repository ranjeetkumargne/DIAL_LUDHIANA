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

public class GovtDept extends AppCompatActivity {
    ListView departments;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Government Department");
        setContentView(R.layout.activity_govt_dept);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        departments = (ListView)findViewById(R.id.departments);
        final String [] govtdept =new String[]{
                "All India Human Right",
                "B S N L Head Office",
                "Chopson Airwing Office",
                "Goverment Office",
                "Goverment Sugar Check Store",
                "Government of Indian Tax Office",
                "Hindpal Coal Depu",
                "Human Rights Pratecion Office",
                "Kalra Sales Corporation",
                "Kumar Leader Point"
        };

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,govtdept);
        departments.setAdapter(adapter);

        departments.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it=new Intent(GovtDept.this,GovtDeptFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",govtdept[position]);
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
