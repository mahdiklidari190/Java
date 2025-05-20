package com.example.emak;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class sss extends AppCompatActivity {

    ListView listView;
    String[] names = {"موز", "سیب", "پرتقال"};
    int[] images = {R.drawable.s , R.drawable.a , R.drawable.d};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veo);

        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, names, images);
        listView.setAdapter((ListAdapter) adapter);
    }
}

