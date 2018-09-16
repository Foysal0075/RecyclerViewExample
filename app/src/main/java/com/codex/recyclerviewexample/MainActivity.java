package com.codex.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameView,locationView,professionView;
    Button addButton;
    RecyclerView myRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameView = findViewById(R.id.name_ET);
        locationView = findViewById(R.id.location_ET);
        professionView = findViewById(R.id.profession_ET);
        addButton = findViewById(R.id.add_Button);

        myRecyclerView = findViewById(R.id.recycler_view);

        final RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,PersonData.persons);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(linearLayoutManager);
        myRecyclerView.setAdapter(adapter);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameView.getText().toString();
                String location = locationView.getText().toString();
                String profession = professionView.getText().toString();

                if (!name.isEmpty() && !location.isEmpty() && !profession.isEmpty()){
                    Person person = new Person(name,location,profession);
                    PersonData.persons.add(person);
                    adapter.notifyDataSetChanged();
                }
                nameView.setText(null);
                locationView.setText(null);
                professionView.setText(null);
            }
        });


    }
}
