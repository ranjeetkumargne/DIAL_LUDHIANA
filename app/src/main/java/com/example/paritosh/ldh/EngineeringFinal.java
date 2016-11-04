package com.example.paritosh.ldh;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class EngineeringFinal extends AppCompatActivity {
    TextView name, add, ph;
    Button locate;
    ImageButton MakeACall;
    String nameCollege;
    String address[] = new String[]
            {
                    "Grand Trunk Road",
                    "Gill Road, Gill VIllage, Ludhiana - 141006",
                    "Chandigarh Highway,Katani, Punjab 141113",
                    "Bhutta College Road",
                    "Chaukimann, Ferozepur Road, Ludhiana, Punjab 141001",
                    "Punjab Agricultural University, Ludhiana, Punjab 141004",
                    "Punjab Agricultural University, Ludhiana, Punjab 141004",
            };
    String PhoneSet[] = new String[]
            {
                    "18001370800",
                    "01612502700",
                    "01612834307",
                    "18001802001",
                    "08146407500",
                    "01612401960",
                    "01612401960"
            };

    String Phone[] = new String[]
            {
                    "tel:18001370800",
                    "tel:01612502700",
                    "tel:01612834307",
                    "tel:18001802001",
                    "tel:08146407500",
                    "tel:01612401960",
                    "tel:01612401960"
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ph = (TextView) findViewById(R.id.ph);
        add = (TextView) findViewById(R.id.add);
        MakeACall = (ImageButton) findViewById(R.id.MakeACall);
        locate = (Button) findViewById(R.id.locate);

        Intent it = getIntent();
        nameCollege = it.getStringExtra("LOCATION");
        setTitle(nameCollege);
        final int position = it.getIntExtra("POSITION", 0);

        add.setText(address[position]);
        ph.setText(PhoneSet[position]);

        locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EngineeringFinal.this, MapLocation.class);
                if(position == 6)
                    intent.putExtra("LOCATION","Punjab Agricultural University");
                else
                intent.putExtra("LOCATION", nameCollege);
                intent.putExtra("POSITION", position);
                startActivity(intent);
            }
        });

        MakeACall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse(Phone[position]));

                startActivity(callIntent);

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
