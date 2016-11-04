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

public class PlaySchool extends AppCompatActivity {
    ListView Play;
    String kidschool[] =new String[]
            {
                    "CHERRY LANE PLAY SCHOOL",
                    "DAFFODIL PRE SCHOOL",
                    "KIDS HOME PLAYWAY SCHOOL",
                    "LITTLE BLOSSOM NURSERY SCHOOL",
                    "MICKY AND DONALD PLAYWAY SCHOOL AND CRECHE",
                    "MOTHERS PRIDE JUNIOR SCHOOL",
                    "PENGUIN CASTLE PRE SCHOOL",
                    "RISING STARS PLAYWAY SCHOOL",
                    "ST XAVIERS PLAYWAY SCHOOL",
                    "STORY BROOKE PRE SCHOOL",
                    "Cherubs The Pre School",
                    "New Era Public School",
                    "Eduvillas Montessori School",
                    "B.V.S. Convent Public School",
                    "Sri Guru Harkrishan Sr. Sec. School",
                    "Partap Public School",
                    "Bal Bharati Public School",
                    "Sanfort World Pre- School",
                    "Rising Stars Playway School",
                    "St. Xavier Playway School",
                    "Kids Home Playway School",
                    "Kangaroo Kids",
                    "The Little Kingdom Nursery School",
                    "Waheguru Public School",
                    "Small Angels Playway School",
                    "Children's Valley School",
                    "Sanfort Play School",
                    "Jingle Bell School",
                    "Penguin Castle Pre School",
                    "Happy Valley Play School",
                    "Sips ( Swiss International Public School)",
                    "Bal Bharati Public School",
                    "Himalya Modern High School",
                    "Bajaj Capital Insurance Broking Limited",
                    "International Public School",
                    "Indus World School",
                    "Guru Nanak International School4.5 rating",
                    "Atam Public Sr Sec School",
                    "V N Goswami",
                    "Atam Public School",
                    "Little Blossom Nursery School",
                    "Spring Dale Pubplic School",
                    "Mahavir Vidyamandir School"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PLAY SCHOOL");
        setContentView(R.layout.activity_play_school);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Play = (ListView)findViewById(R.id.Play);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,kidschool);
        Play.setAdapter(adapter);
        Play.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(PlaySchool.this,PlaySchoolFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("name",kidschool[position]);
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
