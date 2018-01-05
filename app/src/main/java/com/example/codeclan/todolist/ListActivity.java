package com.example.codeclan.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    // when clicking on the list item - takes you through to the further details
    public void getDetails(View listItem){

        Item item = (Item) listItem.getTag();

        Intent intent = new Intent(this, ItemActivity.class);
        intent.putExtra("item", item);

        startActivity(intent);

    }

    // button clicked to add new task
    public void onAddTaskButtonClicked(View button){
        Intent intent = new Intent(this, AddItemActivity.class);
        startActivity(intent);
    }
}
