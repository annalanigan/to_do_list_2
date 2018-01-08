package com.example.codeclan.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddItemActivity extends AppCompatActivity {

    EditText titleText;
    EditText detailsText;
    EditText categoryChoice;
    EditText dateChoice;
    ArrayList<Item> spinnerList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        titleText = findViewById(R.id.title);
        detailsText = findViewById(R.id.details);
        dateChoice = findViewById(R.id.due_date);
        categoryChoice = findViewById(R.id.add_category);

//        spinnerList =  new DefaultCategories.getCategoryNames();
//        // Not working anyway - but...
//        // this will return an array list of the objects and the spinner needs an array list
//        // of the Strings of the names?

    }

    public void onAddButtonClicked(View button){
        String newTitle = titleText.getText().toString();
        String newDetails = detailsText.getText().toString();
        String newCategory = categoryChoice.getText().toString();



    }

}
