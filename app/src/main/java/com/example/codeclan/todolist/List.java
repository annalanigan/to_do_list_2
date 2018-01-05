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
        list.add(new Item("food shop", "Sainsburys", 0));
        list.add(new Item("buy lighbulb", "halogen and 40 watt", 0));
        list.add(new Item("build drawer unit", "kids bedroom", 1));
    }

    public void addItem(Item item){
        list.add(item);
    }

    public int getItemRank(Item thisItem){
        int rank = list.indexOf(thisItem);
        return rank += 1;
    }


}
