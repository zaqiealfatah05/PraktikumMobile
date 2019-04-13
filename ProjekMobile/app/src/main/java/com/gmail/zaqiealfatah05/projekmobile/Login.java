package com.gmail.zaqiealfatah05.projekmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    ListView list;
    String[] maintitle ={
            "Zaqie","Ayu Nurfadilla",
            "Bella Safira","Ghea",
            "Randi Jaya","Rohmanto","Aga",       };
    String[] subtitle ={
            "Zaqiealfatah05@gmail.com","nurfadillah@gmail.com",
            "safira@gmail.com","Ghea@gmail.com",
            "Jaya@gmail.com","Rohmanto@gmaill.com","AgaPram@gmail.com",       };
    Integer[] imgid={
            R.drawable.zaqie,R.drawable.ayu,
            R.drawable.bella,R.drawable.ghea,
            R.drawable.randi,R.drawable.rohmanto,R.drawable.aga,       };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.    OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                //TODO Auto-generated method stub
                if(position == 0) {
                    // code specific to first list item
                    Toast.makeText(getApplicationContext(),"Kepo Ya !!",Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Kepo Ya !!",Toast. LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Kepo Ya !!",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Kepo Ya !!",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Kepo Ya !!",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {
                    Toast.makeText(getApplicationContext(),"Kepo Ya !!",Toast.LENGTH_SHORT).show();
                }
                else if(position ==6) {
                    Toast.makeText(getApplicationContext(),"Kepo Ya !!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}