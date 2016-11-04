package com.example.paritosh.ldh;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HighSchool extends AppCompatActivity {
    ListView high;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_school);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        high=(ListView)findViewById(R.id.high);
        String [] pvthighschool =new String[]
                {
                        "A.B.C. Montessori Saddana International Preschool",
                        "A.S. Modern Primary School",
                        "A.V.M. High School",
                        "ABC Montessori",
                        "Dashmesh Public School, P.O. Sarinhd, (On Malerkotla Road)",
                        "ABC Montessori",
                        "ABC Montessori",
                        "ABC Montessori",
                        "ABC Montessori",
                        "Air Force School",
                        "Akal Sahai Convent Senior Secondary School",
                        "Alpine International School",
                        "American Kidz Play School",
                        "Amrit Indo Canadian Academy",
                        "Atam Devki Niketan",
                        "Atam Public School",
                        "Atam Public Senior Secondary School",
                        "B.C.M School",
                        "B.C.M School",
                        "B.C.M. School",
                        "B.C.M. Senior Secondary School",
                        "B.C.M. Arya Model Senior Secondary School",
                        "Sector 32-A, Chandigarh Road",
                        "B.V.S. Convent Public School",
                        "Baba Kartar Singh Public School"
                };
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,pvthighschool);
        high.setAdapter(adapter);

        high.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(), "Sorry,Address and Phone Number not available currently", Toast.LENGTH_SHORT);
                toast.show();
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
