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

import java.util.List;

public class SeniorSecondary extends AppCompatActivity {
    ListView senior;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senior_secondary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        senior=(ListView)findViewById(R.id.senior);

        String[] govthighschools = new String[]
                {
                        "   Govt.Sr. Sec. School,Barsal	C",
                        "	Govt.Sr. Sec. School,Bhundari	C",
                        "	Govt.Sr. Sec. School,Boparai Kalan	C",
                        "	Govt.Sr. Sec. School,Chakar	C",
                        "	Govt.Sr. Sec. School,Galib Kalan	C",
                        "	Govt.Sr. Sec. School,Giddar Windi	C",
                        "	Govt.Sr. Sec. School,Hans Kalan	C",
                        "	Govt.Sr. Sec. School,Hathoor	C",
                        "	Govt.Sr. Sec. School,Jagraon	A",
                        "	Govt.Sr. Sec. School,Jagraon(G)	C",
                        "	Govt.Sr. Sec. School,Kamalpura	C",
                        "	Govt.Sr. Sec. School,Koenkey Kalan	C",
                        "	Govt.Sr. Sec. School,Lamma Jatpura	C",
                        "	Govt.Sr. Sec. School,Leela Megh Singh	C",
                        "	Govt.Sr. Sec. School,Mallah(G)	C",
                        "	Govt.Sr. Sec. School,Malsihan Bajan	C",
                        "	Govt.Sr. Sec. School,Manuke	C",
                        "	Govt.Sr. Sec. School,Purain	C",
                        "	Govt.Sr. Sec. School,Sherpur Kalan	C",
                        "	Govt.Sr. Sec. School,Sidhwan Bet	C",
                        "	Govt.Sr. Sec. School,Sidhwan Bet(G)	C",
                        "	Govt.Sr. Sec. School,Sidhwan Kalan	C",
                        "	Govt.Sr. Sec. School,Sohian	C",
                        "	Govt.Sr. Sec. School,Swaddi Kalan	C",
                        "	Govt.Sr. Sec. School,Swaddi Kalan(G)	C",
                        "	Govt.Sr. Sec. School,Talwandi kalan(G)	C",
                        "	Govt.Sr. sec. school,Bija	C",
                        "	Govt.Sr. sec. school,Chakohi	C",
                        "	Govt.Sr. sec. school,Daheru(G)	C",
                        "	Govt.Sr. sec. school,Ikolaha	C",
                        "	Govt.Sr. sec. school,Isru	C",
                        "	Govt.Sr. sec. school,Jatana	C",
                        "	Govt.Sr. sec. school,Khanna(G)	A",
                        "	Govt.Sr. sec. school,Lalheri	C",
                        "	Govt.Sr. sec. school,Libra	C",
                        "	Govt.Sr. sec. school,Manak Majra	C",
                        "	Govt.Sr. sec. school,Nasrali	C",
                        "	Govt.Sr. Sec. School,Basti Jodhewal	A",
                        "	Govt.Sr. Sec. School,Bhaini Sahib	C",
                        "	Govt.Sr. Sec. School,Bhutta	C",
                        "	Govt.Sr. Sec. School,Butahari	C",
                        "	Govt.Sr. Sec. School,Chaunta	C",
                        "	Govt.Sr. Sec. School,Dehlon	c",
                        "	Govt.Sr. Sec. School,Dhanansu	c",
                        "	Govt.Sr. Sec. School,Dhandari Khurd	A",
                        "	Govt.Sr. Sec. School,Div.No.3,Ldh	A",
                        "	Govt.Sr. Sec. School,Guram	C",
                        "	Govt.Sr. Sec. School,Hargobindpur(G)	C",
                        "	Govt.Sr. Sec. School,Jandiali	c",
                        "	Govt.Sr. Sec. School,Jarkhar	C",
                        "	Govt.Sr. Sec. School,Kadian Kalan	C",
                        "	Govt.Sr. Sec. School,Karamasar	C",
                        "	Govt.Sr. Sec. School,Katani Kalan(G)	c",
                        "	Govt.Sr. Sec. School,Kila Raipur	c",
                        "	Govt.Sr. Sec. School,Kum Kalan	c",
                        "	Govt.Sr. Sec. School,Multipurpose Ldh	A",
                        "	Govt.Sr. Sec. School,Mangat	C",
                        "	Govt.Sr. Sec. School,Mangili Nichi	C",
                        "	Govt.Sr. Sec. School, Miller Ganj	A",
                        "	Govt.Sr. Sec. School,Sahnewal	B",
                        "	Govt.Sr. Sec. School,Sahnewal(G)	B",
                        "	Govt.Sr. Sec. School,Sakhewal	A",
                        "	Govt.Sr. Sec. School,Alamgir	c",
                        "	Govt. Sr. Sec School,Ayali Khurd	A",
                        "	Govt.Sr. Sec. School,Baddowal	c",
                        "	Govt.Sr. Sec. School,Bharat Nagar(G)	A",
                        "	Govt.Sr. Sec. School,Cemetary Road	A",
                        "	Govt. Sr. Sec. School,Chak Kalan	C",
                        "	Govt.Sr. Sec. School,Dakha	C",
                        "	Govt.Sr. Sec. School,Dhandra	c",
                        "	Govt.Sr. Sec. School,Gill(G)	B",
                        "	Govt.Sr. Sec. School,Gobind Nagar,Ldh	A",
                        "	Govt.Sr. Sec. School,Gujjarwal	C",
                        "	Govt.Sr. Sec. School,Haibowal Khurd,Ldh	A",
                        "	Govt.Sr. Sec. School,Hambran	c",
                        "	Govt.Sr. Sec. School,Hasanpur	C",
                        "	Govt.Sr. Sec. School,Isewal	c",
                        "	Govt.Sr. Sec. School,Jagraon Bridge,Ldh	A",
                        "	Govt.Sr. Sec. School,Jawahar Nagar(G)	A",
                        "	Govt.Sr. Sec. School,Jawahar Nagar,Ldh	A",
                        "	Govt.Sr. Sec. School,Kalakh	C",
                        "	Govt.Sr. Sec. School,Khanpur	C",
                        "	Govt.Sr. Sec. School,Kundanpuri,Ldh	A",
                        "	Govt.Sr. Sec. School,Lalton Kalan	C",
                        "	Govt.Sr. Sec. School,Latala	C",
                        "	Govt.Sr. Sec. School,Mansuran(G)	C",
                        "	Govt.Sr. Sec. School,Model Town,Ldh	A",
                        "	Govt.Sr. Sec. School,Narangwal(G)	C",
                        "	Govt.Sr. Sec. School,Nurpur Bet	c",
                        "	Govt.Sr. Sec. School,PAU,Ldh	A",
                        "	Govt.Sr. Sec. School,Pamal	C",
                        "	Govt.Sr. Sec. School,Rakba	C",
                        "	Govt.Sr. Sec. School,Saholi	c",
                        "	Govt.Sr. Sec. School,Sangowal	c",
                        "	Govt.Sr. Sec. School,Sarabha	c",
                        "	Govt.Sr. Sec. School,Tahli sahib	C",
                        "	Govt.Sr. Sec. School,Threeke	c",
                        "	Govt.Sr. Sec. School,Bilaspur	C",
                        "	Govt.Sr. Sec. School,Dhamot	C",
                        "	Govt.Sr. Sec. School,Doraha	C",
                        "	Govt.Sr. Sec. School,Ghudani Kalan	C",
                        "	Govt.Sr. Sec. School,Kaddon	C",
                        "	Govt.Sr. Sec. School,Lehal	C",
                        "	Govt.Sr. Sec. School,Maksudra	C",
                        "	Govt.Sr. Sec. School,Maladu(G)	C",
                        "	Govt.Sr. Sec. School,Malaud	C",
                        "	Govt.Sr. Sec. School, Rampur	C",
                        "	Govt.Sr. Sec. School,Payal	A",
                        "	Govt.Sr. Sec. School,Rauni	C",
                        "	Govt.Sr. Sec. School,Shahpur	C",
                        "	Govt.Sr. Sec. School,Siarh	C",
                        "	Govt.Sr. Sec. School,Uksi	C",
                        "	Govt.Sr. Sec. School,Ajitsar,Raikot(G)	A",
                        "	Govt.Sr. Sec. School,B.M.Raikot	a",
                        "	Govt.Sr. Sec. School,Barundi	C",
                        "	Govt.Sr. Sec. School,Bassian	C",
                        "	Govt.Sr. Sec. School,Bhaini Bringa	C",
                        "	Govt.Sr. Sec. School,Bhaini Dreran	C",
                        "	Govt.Sr. Sec. School,Dadahoor	C",
                        "	Govt.Sr. Sec. School,Halwara	C",
                        "	Govt.Sr. Sec. School,Jalaldiwal	C",
                        "	Govt.Sr. Sec. School,Jhorran	C",
                        "	Govt.Sr. Sec. School,Karir Sahib Litar	C",
                        "	Govt.Sr. Sec. School,Maherna Kaln	C",
                        "	Govt.Sr. Sec. School,Nathowal	C",
                        "	Govt.Sr. Sec. School,Pakhowal	C",
                        "	Govt.Sr. Sec. School,Rachheen	C",
                        "	Govt.Sr. Sec. School,Sehbajpura	C",
                        "	Govt.Sr. Sec. School,Talwandi Rai	C",
                        "	Govt.Sr. Sec. School,Behlolpur	C",
                        "	Govt.Sr. Sec. School,Goslan(G)	C",
                        "	Govt.Sr. Sec. School,Gungrali Sikhan	C",
                        "	Govt.Sr. Sec. School,Hambowal Bet	C",
                        "	Govt.Sr. Sec. School,Kotala	C",
                        "	Govt.Sr. Sec. School,Kubba	C",
                        "	Govt.Sr. Sec. School,Lalori Kalan	C",
                        "	Govt.Sr. Sec. School,Lumbangarh	C",
                        "	Govt.Sr. Sec. School,Machhiwara	B",
                        "	Govt.Sr. Sec. School,Machhiwara(G)	B",
                        "	Govt.Sr. Sec. School,Manki	C",
                        "	Govt.Sr. Sec. School,Manupur	C",
                        "	Govt.Sr. Sec. School,Rupalon	C",
                        "	Govt.Sr. Sec. School,Samrala	A",
                        "	Govt.Sr. Sec. School,Samrala(G)	A",
                };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,govthighschools);
        senior.setAdapter(adapter);

        senior.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
