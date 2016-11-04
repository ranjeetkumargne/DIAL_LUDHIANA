package com.example.paritosh.ldh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.File;
import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ActionBarDrawerToggle toggle;  //it is for drawer layout
    Button Aboutldh;
    RelativeLayout Police,Ambulance,Entertainment,Hospital,FireBrigade,GovtDept,Gas,Shopping,Beauty,Hotel,Transport,Education;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("DIAL LUDHIANA");
        setSupportActionBar(toolbar);

        //this is the code of drawer layout
        DrawerLayout drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        toggle=new ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView=(NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        //DrawerLayout's code ends here

        Police=(RelativeLayout)findViewById(R.id.police);
        Ambulance=(RelativeLayout)findViewById(R.id.Ambulance);
        Hospital=(RelativeLayout)findViewById(R.id.hospital);
        FireBrigade=(RelativeLayout)findViewById(R.id.fire);
        GovtDept=(RelativeLayout)findViewById(R.id.govtdept);
        Gas=(RelativeLayout)findViewById(R.id.gasAgency);
        Beauty=(RelativeLayout)findViewById(R.id.Beauty);
        Shopping=(RelativeLayout)findViewById(R.id.shopping);
        Entertainment=(RelativeLayout)findViewById(R.id.Entertainment);
        Hotel=(RelativeLayout)findViewById(R.id.Hotel);
        Transport=(RelativeLayout)findViewById(R.id.transport);
        Education=(RelativeLayout)findViewById(R.id.education);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //drawer layout
        if (toggle.onOptionsItemSelected(item))
            return true;

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public File getFilesDir() {
        return super.getFilesDir();
    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.police||v.getId()==R.id.policeicon)
        {
            Intent it = new Intent(MainActivity.this,PoliceStations.class);
            startActivity(it);
        }
        if(v.getId()==R.id.Ambulance||v.getId()==R.id.ambulanceicon)
        {
            Intent it = new Intent(MainActivity.this, com.example.paritosh.ldh.Ambulance.class);
            startActivity(it);
        }
        if(v.getId()==R.id.hospital||v.getId()==R.id.hospitalicon)
        {
            Intent it = new Intent(MainActivity.this,Hospitals.class);
            startActivity(it);
        }
        if(v.getId()==R.id.fire||v.getId()==R.id.firebrigadeicon)
        {
            Intent it = new Intent(MainActivity.this,Fire.class);
            startActivity(it);
        }
        if(v.getId()==R.id.govtdept||v.getId()==R.id.govtdepartmenticon)
        {
            Intent it = new Intent(MainActivity.this,GovtDept.class);
            startActivity(it);
        }
        if(v.getId()==R.id.gasAgency||v.getId()==R.id.gasagencyicon)
        {
            Intent it = new Intent(MainActivity.this,GasSupply.class);
            startActivity(it);
        }
        if(v.getId()==R.id.Beauty||v.getId()==R.id.beautyfashionicon)
        {
            Intent it = new Intent(MainActivity.this,BeautyListView.class);
            startActivity(it);
        }
        if(v.getId()==R.id.shopping||v.getId()==R.id.shoppingicon)
        {
            Intent it = new Intent(MainActivity.this,shop.class);
            startActivity(it);
        }
        if(v.getId()==R.id.Entertainment||v.getId()==R.id.entertainmenticon)
        {
            Intent it = new Intent(MainActivity.this,EntertainmentList.class);
            startActivity(it);
        }
        if(v.getId()==R.id.Hotel||v.getId()==R.id.hotel_dhabaicon)
        {
            Intent it = new Intent(MainActivity.this,hotelList.class);
            startActivity(it);
        }
        if(v.getId()==R.id.transport||v.getId()==R.id.transporticon)
        {
            Intent it = new Intent(MainActivity.this,transportCarrier.class);
            startActivity(it);
        }
        if(v.getId()==R.id.education||v.getId()==R.id.educationicon)
        {
            Intent it = new Intent(MainActivity.this, com.example.paritosh.ldh.Education.class);
            startActivity(it);
        }


    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.nearby_places:
            Intent it = new Intent(MainActivity.this,Nearby.class);
                startActivity(it);
                break;

            case R.id.ludhiana_official:
                Intent childIntent=new Intent(MainActivity.this,LudhianaOfficial.class);
               startActivity(childIntent);
                break;

            case R.id.about_ldh:
                Intent ldhit= new Intent(MainActivity.this,AboutLdh.class);
                startActivity(ldhit);
                break;


           /* case R.id.municipality:
                Intent mIntent =new Intent(MainActivity.this,Municipality.class);
                startActivity(mIntent);
                break;*/

            case R.id.news:
                Intent newsIntent=new Intent(MainActivity.this,LudhianaDaily.class);
                startActivity(newsIntent);
                break;

            case R.id.feedback:
                Intent feedbackIntent =new Intent(MainActivity.this,Feedback.class);
                startActivity(feedbackIntent);
                break;

            case R.id.share:
                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.setType("text/plain");

                intent.putExtra(Intent.EXTRA_TEXT, "Dial Ludhiana");

                intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Check out this site!");

                startActivity(Intent.createChooser(intent, "Share"));
                break;


        }
        return false;
    }
}



