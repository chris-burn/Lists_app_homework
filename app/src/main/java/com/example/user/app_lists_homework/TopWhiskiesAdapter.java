package com.example.user.app_lists_homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class TopWhiskiesAdapter extends ArrayAdapter<Whisky> {

    public TopWhiskiesAdapter(Context context, ArrayList<Whisky> whiskies){
        super(context, 0, whiskies);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.whisky_item, parent, false);
        }
        Whisky currentWhisky = getItem(position);

        TextView rating = (TextView) listItemView.findViewById(R.id.rating);
        rating.setText(currentWhisky.getRating().toString());

        TextView distillery = (TextView) listItemView.findViewById(R.id.distillery);
        distillery.setText(currentWhisky.getDistillery());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentWhisky.getName());

        listItemView.setTag(currentWhisky);

        return listItemView;
    }


}
