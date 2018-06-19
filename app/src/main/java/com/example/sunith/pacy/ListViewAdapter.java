package com.example.sunith.pacy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sunith on 21-10-2017.
 */

public class ListViewAdapter extends BaseAdapter {
    Context context;
    String [] version;
    int[] imgversion;
    LayoutInflater inflater1;


    public ListViewAdapter(begg context, int[] imgversion, String[] version) {
        this.context = context;
        this.imgversion=imgversion;
        this.version=version;
        inflater1 = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return version.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView txtview;
        ImageView imgView;
        inflater1 =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=inflater1.inflate(R.layout.items_for_list_beg,parent,false);
        txtview=(TextView)itemView.findViewById(R.id.name_for_list_beg);
        imgView=(ImageView)itemView.findViewById(R.id.img_beg_icon);
        txtview.setText(version[position]);
        imgView.setImageResource(imgversion[position]);
        return itemView;
    }
}
