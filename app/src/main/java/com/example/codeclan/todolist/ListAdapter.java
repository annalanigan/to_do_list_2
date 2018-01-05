package com.example.codeclan.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.*;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class ListAdapter extends ArrayAdapter<Item> {

    public ListAdapter(Context context, ArrayList<Item> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item, parent, false);
        }

        Item currentItem = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.rank);
        ranking.setText(currentItem.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title_list);
        title.setText(currentItem.getName());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.icon);
        icon.setImageResource(currentItem.getCategory().getLogo());

        listItemView.setTag(currentItem);

        return listItemView;

    }

}
