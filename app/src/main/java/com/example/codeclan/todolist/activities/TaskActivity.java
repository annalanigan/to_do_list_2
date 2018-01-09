package com.example.codeclan.todolist.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.codeclan.todolist.Task;
import com.example.codeclan.todolist.R;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        TextView title = findViewById(R.id.view_title);
        TextView details = findViewById(R.id.view_details);
        TextView category = findViewById(R.id.view_category);
        ImageView logo = findViewById(R.id.view_logo);
        TextView date = findViewById(R.id.view_date);

        Intent intent = getIntent();
        Task task = (Task) intent.getSerializableExtra("task");

        title.setText(task.getName());
        details.setText(task.getDetails());
        category.setText(task.getCategory());
        logo.setImageResource(task.getLogo());
        date.setText(task.getDue().toString());

    }
}
