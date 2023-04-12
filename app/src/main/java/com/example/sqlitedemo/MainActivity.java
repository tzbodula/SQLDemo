package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DatabaseManager dm;
    final String TAG = "demo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dm = new DatabaseManager(this );

//        dm.getNotesDAO().save(new Note("Subject 1", "Text 1"));
//        dm.getNotesDAO().save(new Note("Subject 2", "Text 2"));
//        dm.getNotesDAO().save(new Note("Subject 3", "Text 3"));

       dm.getNotesDAO().delete(1);
       dm.getNotesDAO().delete(2);

       Note note = dm.getNotesDAO().get(3);
       note.setSubject("Updated Subject 3");

       dm.getNotesDAO().update(note);

    }
}