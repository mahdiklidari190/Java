package com.example.emak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    String[] names;
    int[] images;

    public MyAdapter(Context context, String[] names, int[] images) {
        this.context = context;
        this.names = names;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View row = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        TextView text = row.findViewById(R.id.textView);
        ImageView image = row.findViewById(R.id.imageView);

        text.setText(names[i]);
        image.setImageResource(images[i]);

        return row;
    }
}

