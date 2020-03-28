package com.example.android.test100000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class fruits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        ArrayList<dataType> list = new ArrayList<>();
        list.add(new dataType("omar" , R.drawable.img1));
        list.add(new dataType("ad" , R.drawable.img2));
        list.add(new dataType("oasdasdadmar" , R.drawable.img3));


        ColorAdapter colorAdapter =new ColorAdapter(this , list, false);
        ListView listView = findViewById(R.id.listView2 );
        listView.setAdapter(colorAdapter);
    }
}
