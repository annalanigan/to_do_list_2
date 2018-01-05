package com.example.codeclan.todolist;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class Item implements Serializable {

    private String name;
    private String details;
    private Boolean completed;
    private Category category;
    private Date due;
    private Integer ranking;
    private DefaultCategories listOfCategories;

    public Item(String name, String details, int categoryIndex){
        this.name = name;
        this.details = details;
        this.completed = false;
        listOfCategories = new DefaultCategories();
        this.category = listOfCategories.getCategory(categoryIndex);
        this.due = new Date();
        this.ranking = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public void completeTask(){
        this.completed = true;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
