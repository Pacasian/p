package com.example.sunith.pacy;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    GridAdapter ga;
    String[] name = {"Beginner", "Medium", "Advance", "Race a question ?", "About Us !", "Visit our site.."};
    int[] img = {R.drawable.begi, R.drawable.med, R.drawable.proohj, R.drawable.info, R.drawable.about, R.drawable.iite};

    SliderLayout sliderLayout;

    HashMap<String, String> HashMapForURL;

    HashMap<String, Integer> HashMapForLocalRes;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static final Integer[] XMEN= {R.drawable.kim,R.drawable.p,R.drawable.micro,R.drawable.weeeb,R.drawable.eesa};
    private ArrayList<Integer> XMENArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = (GridView) findViewById(R.id.gride);
        ga = new GridAdapter(getApplicationContext(), name, img);
        gv.setAdapter(ga);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (name[position] == "Beginner") {
                    Intent intent1 = new Intent(MainActivity.this, begg.class);
                    startActivity(intent1);
                }
                if (name[position] == "Medium") {
                    Intent intent2 = new Intent(MainActivity.this, med.class);
                    startActivity(intent2);
                }
                if (name[position] == "Advance") {
                    Intent intent3 = new Intent(MainActivity.this, advance.class);
                    startActivity(intent3);
                }
                if (name[position] == "Race a question ?") {
                    Intent intent4 = new Intent(MainActivity.this, ques.class);
                    startActivity(intent4);
                }
                if (name[position] == "About Us !") {
                    Intent intent5 = new Intent(MainActivity.this, about.class);
                    startActivity(intent5);
                }
                if (name[position] == "Visit our site..") {
                    Intent intent6 = new Intent(MainActivity.this, site.class);
                    startActivity(intent6);
                }

            }
        });
        init();

    }
    private void init() {
        for(int i=0;i<XMEN.length;i++)
            XMENArray.add(XMEN[i]);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter(MainActivity.this,XMENArray));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == XMEN.length) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);
    }


}




