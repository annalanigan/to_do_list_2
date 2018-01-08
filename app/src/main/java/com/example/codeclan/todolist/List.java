package com.example.codeclan.todolist;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class List implements Serializable {

    ArrayList<Item> list;

    public List(){
        list = new ArrayList<Item>();
        list.add(new Item("food shop", "Sainsburys", "shopping"));
        list.add(new Item("buy lighbulb", "halogen and 40 watt", "shopping"));
        list.add(new Item("build drawer unit", "kids bedroom", "home"));
    }

    public void addItem(Item item){
        list.add(item);
    }

    public int getItemRank(Item thisItem){
        int rank = list.indexOf(thisItem);
        return rank += 1;
    }

    public ArrayList<Item> getList(){
        return new ArrayList<Item>(list);
    }


}
