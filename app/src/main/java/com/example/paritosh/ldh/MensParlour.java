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

public class MensParlour extends AppCompatActivity {
    ListView parlour;
    String [] mensparlour= new String[]
            {
                    "AWISH SALON",
                    "EVES & MENZ PARADISE BEAUTY & HAIR SALOON",
                    "FINE TOP HAIRCUT SALOON",
                    "HOOLIKA HAIR & BEAUTY SALOON",
                    "DAMI INDUSTRY",
                    "CREATIVE PACKAGES",
                    "BEAUTY WORLDS",
                    "BANSAL BEAUTY CLINIC",
                    "ARATI BEAUTY PARLOUR",
                    "FINE TOP HAIRCUT SALOON"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Men's Parlour");
        setContentView(R.layout.activity_mens_parlour);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        parlour=(ListView)findViewById(R.id.parlour);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,mensparlour);
        parlour.setAdapter(adapter);

        parlour.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(MensParlour.this,MensParlourFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("name",mensparlour[position]);
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
