package com.example.hi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ContactList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("John Doe"));
        contactList.add(new Contact("Jane Smith"));
        contactList.add(new Contact("Michael Johnson"));

        ContactAdapter adapter = new ContactAdapter(this, contactList);
        recyclerView.setAdapter(adapter);
    }
}
