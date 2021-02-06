package com.example.notecard.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Instead of ListView , RecyclerView.ViewHolder is recommended
 */
public class NoteRecyclerAdapter extends RecyclerView.ViewHolder {

    private TextView title,timestamp;

    public NoteRecyclerAdapter(@NonNull View itemView) {
        super(itemView);
    }
}
