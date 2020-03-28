package com.example.android.test100000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        ArrayList<dataType> list = new ArrayList<>();
        list.add(new dataType("omar" , R.drawable.img1));
        list.add(new dataType("ad" , R.drawable.img2));
        list.add(new dataType("oasdasdadmar" , R.drawable.img3));


        ColorAdapter colorAdapter =new ColorAdapter(this , list , true);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(colorAdapter);

    }
}
