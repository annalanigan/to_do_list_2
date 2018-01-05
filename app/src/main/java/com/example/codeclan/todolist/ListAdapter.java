package com.example.codeclan.todolist;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.*;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class ListAdapter extends ArrayAdapter<Item> {

    public ListAdapter(Context context, ArrayList<Item> list) {
        super(context, 0, list);
    }

}
