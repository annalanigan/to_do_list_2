package com.example.codeclan.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List list = new List();
        ArrayList<Item> listToView = list.getList();

        ListAdapter adapter = new ListAdapter(this,listToView);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        addButton = findViewById(R.id.button);
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

        Log.d(getClass().toString(), "clicked add task btn" );

        Intent intent = new Intent(this, AddItemActivity.class);

        startActivity(intent);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.activity_list, menu);
//        return true;
//    }
}
