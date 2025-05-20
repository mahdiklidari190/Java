package com.example.emak;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class listveo extends AppCompatActivity {

         ListView listView;
        static String[] names = {"موز", "سیب", "پرتقال"};
        static int[] images = {R.drawable.a , R.drawable.d , R.drawable.s};

        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_veo);

            listView = findViewById(R.id.listView);
            listView.setAdapter((ListAdapter) new SimpleAdapter());
        }

        class SimpleAdapter extends BaseAdapter {
            @Override
            public int getCount() {
                return names.length;
            }

            @Override
            public Object getItem(int position) {
                return names[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }
            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                View row = getLayoutInflater().inflate(R.layout.list_item, null);

                TextView text = row.findViewById(R.id.textView);
                ImageView image = row.findViewById(R.id.imageView);

                text.setText(names[i]);
                image.setImageResource(images[i]);

                return row;
            }
        }
    }

