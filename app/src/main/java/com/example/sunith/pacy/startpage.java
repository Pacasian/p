package com.example.sunith.pacy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by sunith on 16-10-2017.
 */

public class startpage extends AppCompatActivity  {
    ImageButton imageButton;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);
        imageButton = (ImageButton) findViewById(R.id.imagee);
        Thread splash=new Thread(){
          public void run()
          {
              try{
                  sleep(3000);
                  Intent intent = new Intent (startpage.this,MainActivity.class);
                  startActivity(intent);
                  finish();
              } catch (Exception e) {

              }
          }
        };
        splash.start();
    }
}
