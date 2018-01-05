package com.example.codeclan.todolist;

import java.util.ArrayList;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class DefaultCategories {

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

}
