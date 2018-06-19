package com.example.sunith.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class begg extends AppCompatActivity {
    ListView listV;
    ListViewAdapter ladapter;
    String [] version;
    int [] imgversion;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.begg);
        version=new String[]{"chapter1","chapter 2","chapter 3","chapter 4","chapter 5","chapter 6","chapter 7","chapter 8","chapter 9","chapter 10"};
        imgversion =new int[]{R.drawable.bold,R.drawable.bold,R.drawable.bold,R.drawable.bold,R.drawable.bold,R.drawable.bold,R.drawable.bold,R.drawable.bold,R.drawable.bold,R.drawable.bold};
        listV=(ListView)findViewById(R.id.list_for_beg);
        ladapter=new ListViewAdapter(this,imgversion,version);
        listV.setAdapter(ladapter);
        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(begg.this, "your have clicked "+version[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
