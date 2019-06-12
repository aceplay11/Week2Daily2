package com.example.week2daily2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Animal_List extends AppCompatActivity{
 ArrayList<String> categoryArrayList = new ArrayList<>();
    ArrayList<> animalList = new ArrayList<>();
    RecyclerView rvAnimalRecyclerView;
    ListView lvCategoryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal__list);

        lvCategoryList = findViewById(R.id.lvCategoryList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categoryArrayList);
        lvCategoryList.setAdapter(adapter);
        populateList();

        }

    private void populateList() {
        categoryArrayList.add("Safari");


    }

    public void onClick(View view) {
        startActivity(new Intent(this, Animal_RecyclerView.class));
    }
    private void initializeRecyclerView() {
        rvAnimalRecyclerView = findViewById(R.id.rvAnimalRecyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        Animal_RecyclerView movieRecyclerViewAdapter = new Animal_RecyclerView(animalList);

        rvAnimalRecyclerView.setLayoutManager(layoutManager);
        rvAnimalRecyclerView.setAdapter(movieRecyclerViewAdapter);



    }
}
