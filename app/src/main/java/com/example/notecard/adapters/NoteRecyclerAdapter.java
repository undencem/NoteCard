package com.example.notecard.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteRecyclerAdapter extends RecyclerView.ViewHolder {

    private TextView title,timestamp;

    public NoteRecyclerAdapter(@NonNull View itemView) {
        super(itemView);
    }
}
