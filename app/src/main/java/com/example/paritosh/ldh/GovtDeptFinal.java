package com.example.paritosh.ldh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class GovtDeptFinal extends AppCompatActivity {
    TextView phone,address;
    ImageButton MakeACall;
    Button GoTo;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("PROFILE");
        setContentView(R.layout.activity_govt_dept_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        address=(TextView)findViewById(R.id.place);
        phone=(TextView)findViewById(R.id.mobile);
        MakeACall=(ImageButton)findViewById(R.id.MakeACall);
        GoTo=(Button)findViewById(R.id.locate);
        String [] Address = new String[]
                {
                        "East Model Gram Garcha Paint & Hardware Store Kochar Market Ludhiana India 141002" ,
                        "A.T.I. Road Surya Hotel Ranjit Nagar Ludhiana Punjab India 141003",
                        "A.T.I. Road Surya Hotel Ranjit Nagar Ludhiana Punjab India 141003",
                        "Link Road Chabra Chemical Industrial Area-B Ludhiana Punjab India 141003",
                        "Dushera Park Upkar Nagar Ludhiana Punjab India 141001",
                        "Near Dandi Swami Chowk Near Arora Medicos Civil Lines Ludhiana Punjab India 141001",
                        "Nirankali Street No 1 Old Oswal Mill Opposite SBI Bank Millerganj Ludhiana Punjab India 141003",
                        "Samrala Chowk Road Shingar Cinema Harcharan Nagar Ludhiana Punjab India 141008",
                        "Ashoka Trading Center Kochar Market Ludhiana Punjab India 141002 Punjab",
                        "Arora Industries Ludhiana Punjab India 141001"
                };

        final String Calls[] = new String[]
                {
                        "tel:9592736434",
                        "tel:9257314660",
                        "tel:01612432540",
                        "tel:01612532052",
                        "tel:01615002324",
                        "NOT AVAILABLE",
                        "NOT AVAILABLE",
                        "NOT AVAILABLE",
                        "tel:9356357220",
                        "tel:01612420018",
                        "tel:9780144421",
                };
        String phoneNos[]=new String[]
                {
                        "9592736434",
                        "9257314660",
                        "01612432540",
                        "01612532052",
                        "01615002324",
                        "NOT AVAILABLE",
                        "NOT AVAILABLE",
                        "NOT AVAILABLE",
                        "9356357220",
                        "01612420018",
                        "9780144421",
                };

        Intent it = getIntent();
        final int position = it.getIntExtra("POSITION",0);
        name=it.getStringExtra("LOCATION");
        setTitle(name);
        address.setText(Address[position]);
        phone.setText(phoneNos[position]);

        MakeACall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                if (position == 6 || position == 5 || position == 7) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Sorry, Phone Number not available", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    callIntent.setData(Uri.parse(Calls[position]));
                    startActivity(callIntent);
                }
            }
        });
        GoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(GovtDeptFinal.this,MapLocation.class);
                it.putExtra("POSITION",position);
                it.putExtra("LOCATION",name);
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
