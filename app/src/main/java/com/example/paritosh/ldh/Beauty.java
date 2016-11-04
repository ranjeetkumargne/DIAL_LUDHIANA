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

public class Beauty extends AppCompatActivity {
    ListView parlour;
    String ParlourNames[]=new String[]{"Sallan Beauty Parlour",
            "Sharma Beauty Parlour",
            "Khushiana Beauty World",
            "Anju Beauty Parlour",
            "Burmeese Beauty World",
            "Jolen 3",
            "Bobby Hair Deser",
            "Indira Hair Weaving & Beauty Centre",
            "Nehazz Herbal Beauty Clinic",
            "Payal Beauty Parllour",
            "Mannat Beauty Parlour",
            "Chimes Beauty Parlou",
            "Sunita Beauty Parlour",
            "Style Beauty Parlour",
            "Unistart Beauty Saloon",
            "Avon Beauty Clinic",
            "Femina Beauty & Skin Care",
            "STYLE INN",
            "Bobby Hair Dressers",
            "Jass Beauty Parlour & Beauty Clinic",
            "Beauty Reforming Saloon",
            "Hina Herbal Beauty Saloon",
            "Fusion Salon",
            "Billu Hair Dresser",
            "Jasmine Beauty World",
            "EVE's Beauty Care & Training",
            "New Style Beauty Saloon & Training Center",
            "Shruti Beauty Parlour",
            "Madonna Beauty Studio",
            "Queens Beauty World",
            "Hollywood Beauty Saloon",
            "Jyoti Beauty Parlour",
            "Chandel Hair Dresser",
            "Simran Beauty Clinic",
            "Roopse Beauty Clinic",
            "Lawrence Unisex Professional Saloon",
            "Super Style Hair And Beauty Saloon",
            "Maya Beauty Salon",
            "Princess & Style",
            "Turn On Salon & Spa",
            "Bombay Hair Dresser & Beauty Parlour",
            "Queens Beauty Parlour",
            "Krishna Beauty Corner",
            "Taran Beauty Parlour",
            "Naaz Beauty World",
            "Scissor Style Beauty Salon",
            "Sangam Beauty Parlour & Training Institute",
            "Sonam K Salon",
            "Nikhar Beauty Parlour",
            "Tara Chand Di Hatti"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("BEAUTY PARLOURS");
        setContentView(R.layout.activity_beauty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        parlour=(ListView)findViewById(R.id.parlour);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,ParlourNames);
        parlour.setAdapter(adapter);

        parlour.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(Beauty.this,BeautyFinal.class);
                it.putExtra("POSITION",position);
                it.putExtra("name",ParlourNames[position]);
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
