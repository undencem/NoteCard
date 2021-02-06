package com.example.notecard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.notecard.models.Note;

public class NoteListActivity extends AppCompatActivity {
    
    private static final String TAG = "NoteListActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: NoteListActivity created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

    }
}