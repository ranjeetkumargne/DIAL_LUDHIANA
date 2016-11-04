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

import java.lang.reflect.Array;

public class GasSupply extends AppCompatActivity {
    ListView Agencies;
    String GasSupplyAgencies[]=new String[]{"Arora Gas Supply (LPG Distributors) ",
            "Deep Gas Service (LPG Distributors) ",
            "E M M Kay Gas Agency (LPG Distributors) ",
            "HP Gas (LPG Distributors) ",
            "HP Gas (LPG Distributors) ",
            "H P Gas Agencies (LPG Distributors) ",
            "HP Gas Agency (LPG Distributors) ",
            "Indane Gilson Enterprises (LPG Distributors) ",
            "Kailash Enterprises (LPG Distributors) ",
            "Kesari Gas Service (LPG Distributors) "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Gas Supply");
        setContentView(R.layout.activity_gas_supply);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Agencies=(ListView)findViewById(R.id.Agencies);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1, GasSupplyAgencies);
        Agencies.setAdapter(arrayAdapter);

        Agencies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it=new Intent(GasSupply.this,GasSupplyFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("name",GasSupplyAgencies[position]);
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
