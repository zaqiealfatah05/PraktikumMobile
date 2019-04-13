package com.gmail.zaqiealfatah05.pertemuan6a;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //
    ListView list;
    String[] maintitle ={
            "Instagram","Toyota",
            "WhatsApp","Skype",
            "Mitsubishi",       };
    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",       };
    Integer[] imgid={
            R.drawable.download1,R.drawable.download2,
            R.drawable.download3,R.drawable.download4,
            R.drawable.download5,       };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.    OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                //TODO Auto-generated method stub
                 if(position == 0) {
                // code specific to first list item
                 Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                 }
                 else if(position == 1) {
                 //code specific to 2nd list item
                 Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast. LENGTH_SHORT).show();
                 }
                 else if(position == 2) {
                Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                 }
                 else if(position == 3) {
                 Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                 }
                 else if(position == 4) {
                 Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                 }
                 }
                });
    }
}
