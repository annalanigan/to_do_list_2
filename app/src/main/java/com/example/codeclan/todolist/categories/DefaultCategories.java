package com.example.codeclan.todolist.categories;

import com.example.codeclan.todolist.R;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class DefaultCategories implements Serializable{

    private ArrayList<Category> defaultCategories;

    public DefaultCategories(){
        defaultCategories = new ArrayList<Category>();
        defaultCategories.add(new Category("Shopping", R.drawable.shopping));
        defaultCategories.add(new Category("Home", R.drawable.home));
        defaultCategories.add(new Category("Work", R.drawable.work));
        defaultCategories.add(new Category("Kids", R.drawable.kids));
    }

    public void addCategory(Category newCategory){
        defaultCategories.add(newCategory);
    }

    public ArrayList<Category> getDefaultList() {
        return new ArrayList<Category>(defaultCategories);
    }

    public int getSize() {
        return defaultCategories.size();
    }

    public Category getCategory(int index){
        return defaultCategories.get(index);
    }


    public ArrayList<String> getCategoryNames(){
        ArrayList<String> names = new ArrayList<>();
        for (Category each : defaultCategories){
            names.add(each.getName());
        }
        return names;
    }

}
