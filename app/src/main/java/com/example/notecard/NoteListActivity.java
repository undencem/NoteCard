package com.example.notecard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.notecard.adapters.NotesRecyclerAdapter;
import com.example.notecard.models.Note;
import com.example.notecard.util.VerticalSpacingItemDecorator;

import java.util.ArrayList;

public class NoteListActivity extends AppCompatActivity {
    
    private static final String TAG = "NoteListActivity";

    // UI Components
    private RecyclerView mRecyclerView;

    // vars
    private ArrayList<Note> mNotes = new ArrayList<>();
    private NotesRecyclerAdapter mNotesRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: NoteListActivity created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

        mRecyclerView = findViewById(R.id.recyclerView);

        initRecyclerView();
        insertFakeNotes();

    }

    private void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        VerticalSpacingItemDecorator itemDecorator=new VerticalSpacingItemDecorator(10);
        mRecyclerView.addItemDecoration(itemDecorator);
        mNotesRecyclerAdapter = new NotesRecyclerAdapter(mNotes);
        mRecyclerView.setAdapter(mNotesRecyclerAdapter);
    }

    private void insertFakeNotes(){
        for(int i=0;i<50;i++){
            Note note=new Note();
            note.setTitle("title # "+i);
            note.setContent("content # "+i);
            note.setTimestamp("Jan 2019");
            mNotes.add(note);
        }
        // adds values to the adapter
        mNotesRecyclerAdapter.notifyDataSetChanged();
    }

}