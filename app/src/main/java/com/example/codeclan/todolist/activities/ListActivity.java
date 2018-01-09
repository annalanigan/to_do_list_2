package com.example.codeclan.todolist.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import com.example.codeclan.todolist.Task;
import com.example.codeclan.todolist.list.List;
import com.example.codeclan.todolist.list.ListAdapter;
import com.example.codeclan.todolist.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    Button addButton;
    Button refreshButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        String allTasks = sharedPref.getString(getString(R.string.task_preference_key), new ArrayList<Task>().toString());

        Gson gson = new Gson();
        TypeToken<ArrayList<Task>> existingArrayList = new TypeToken<ArrayList<Task>>() {};
        ArrayList<Task> myToDoList = gson.fromJson(allTasks, existingArrayList.getType());

        Task newTask = (Task) getIntent().getSerializableExtra("task");
        myToDoList.add(newTask);

        ListAdapter adapter = new ListAdapter(this,myToDoList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString(getString(R.string.task_preference_key), gson.toJson(myToDoList));
        editor.apply();

        Toast.makeText(this, "Task Added", Toast.LENGTH_LONG).show();

        addButton = findViewById(R.id.button);
        refreshButton = findViewById(R.id.refresh);
    }

    // when clicking on the list item - takes you through to the further details
    public void getDetails(View listItem){

        Task task = (Task) listItem.getTag();

        Intent intent = new Intent(this, TaskActivity.class);
        intent.putExtra("task", task);

        startActivity(intent);

    }

    // button clicked to add new task
    public void onAddTaskButtonClicked(View button){

        Log.d(getClass().toString(), "clicked add task btn" );

        Intent intent = new Intent(this, AddTaskActivity.class);

        startActivity(intent);
    }


    public void onCheckBoxChecked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        Task task = (Task) view.getTag();

        if (checked){

            SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
            String allTasks = sharedPref.getString(getString(R.string.task_preference_key), new ArrayList<Task>().toString());

            Gson gson = new Gson();
            TypeToken<ArrayList<Task>> existingArrayList = new TypeToken<ArrayList<Task>>() {};
            ArrayList<Task> myToDoList = gson.fromJson(allTasks, existingArrayList.getType());

            int index = myToDoList.indexOf(task);
            task.completeTask();
            myToDoList.set(index, task);

            SharedPreferences.Editor editor = sharedPref.edit();

            editor.putString(getString(R.string.task_preference_key), gson.toJson(myToDoList));
            editor.apply();

        }
    }

    public void onRefreshButtonClicked(View view){

        onCheckBoxChecked(view);

        Intent intent = new Intent (this, ListActivity.class);
        startActivity(intent);

    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.activity_list, menu);
//        return true;
//    }
}
