package com.example.contactosapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ContactAdapter contactAdapter;
    RecyclerView listContacts;
    public static List<Contact> createContacts(){
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ariana Grande, "55555555"));
        return contacts;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listContacts = findViewById(R.id.ListContacs);
        contacsAdapter = new ContactAdapter(MainActivity.createContacts());
        listContacts.setAdapter(contactAdapter);
        listContacts.setLayoutManager(new LinearLayoutManager );

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}