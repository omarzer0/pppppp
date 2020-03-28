package com.example.android.test100000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<dataType> {
    boolean mIsOne;

    public ColorAdapter(@NonNull Context context, ArrayList<dataType> arrayList, boolean isOne) {
        super(context, 0, arrayList);
        mIsOne = isOne;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (mIsOne) {
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.items, parent, false);
            }
        }


        else {
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.items2, parent, false);
            }
        }


        dataType data = getItem(position);

        TextView textView = listItemView.findViewById(R.id.textView);
        //set data
        textView.setText(data.getmName());

        ImageView imageView = listItemView.findViewById(R.id.imageView);
        //set img
        imageView.setImageResource(data.getmImg());

        return listItemView;

    }
}
