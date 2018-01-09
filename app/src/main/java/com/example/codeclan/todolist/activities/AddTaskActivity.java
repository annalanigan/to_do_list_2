package com.example.codeclan.todolist.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.codeclan.todolist.Task;
import com.example.codeclan.todolist.R;

import java.util.ArrayList;

public class AddTaskActivity extends AppCompatActivity {

    EditText titleText;
    EditText detailsText;
    EditText categoryChoice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        titleText = findViewById(R.id.title);
        detailsText = findViewById(R.id.details);
        categoryChoice = findViewById(R.id.add_category);

    }

    public void onAddButtonClicked(View button){
        String newTitle = titleText.getText().toString();
        String newDetails = detailsText.getText().toString();
        String newCategory = categoryChoice.getText().toString();

        Task newTask = new Task(newTitle, newDetails, newCategory);

        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("task", newTask);
        startActivity(intent);

    }

}
