package com.betelgeuse.corp.notes;

import androidx.cardview.widget.CardView;

import com.betelgeuse.corp.notes.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
