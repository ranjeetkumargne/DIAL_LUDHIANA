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

public class PoliceStations extends AppCompatActivity {
    ListView Police;
    String[] policestation = new String[]
            {
                    "Police Station Daba",
                    "Police Station Daresi ",
                    "Police Station Dehlon ",
                    "Police Station Division No. 1 ",
                    "Police Station Division No. 2 ",
                    "Police Station Division No. 3 ",
                    "Police Station Division No. 4 ",
                    "Police Station Division No. 5 (Civil Lines) ",
                    "Police Station Division No. 6 (Dholewal) ",
                    "Police Station Vardhman ",
                    "Police Station Division No. 8 ",
                    "Police Station DUGRI ",
                    "Police Station Focal Point ",
                    "Police Station Haibowal ",
                    "Police Station Jamalpur ",
                    "Police Station Jodhewal ",
                    "Police Station Koom Kalan ",
                    "Police Station Ladhowal ",
                    "Police Station Meharbaan ",
                    "Police Station Model Town  ",
                    "Police Station Moti Nagar ",
                    "Police Station N.R.I. ",
                    "Police Station PAU ",
                    "Police Station Sadar ",
                    "Police Station Sahnewal ",
                    "Police Station Salem Tabri ",
                    "Police Station Sarabha Nagar ",
                    "Police Station Shimlapuri ",
            };








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("POLICE STATIONS");
        setContentView(R.layout.activity_police_stations);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Police = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,policestation);
        Police.setAdapter(adapter);

            Police.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent it = new Intent(PoliceStations.this,PoliceStationsFinal.class);
                            it.putExtra("POSITION",position);
                            it.putExtra("LOCATION",policestation[position]);
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
