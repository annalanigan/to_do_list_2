package com.example.codeclan.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        TextView title = findViewById(R.id.view_title);
        TextView details = findViewById(R.id.view_details);
        TextView category = findViewById(R.id.view_category);
        ImageView logo = findViewById(R.id.view_logo);
        TextView date = findViewById(R.id.view_date);

        Intent intent = getIntent();
        Item item = (Item) intent.getSerializableExtra("item");

        title.setText(item.getName());
        details.setText(item.getDetails());
        category.setText(item.getCategory().getName());
        logo.setImageResource(item.getCategory().getLogo());
        date.setText(item.getDue().toString());

    }
}
