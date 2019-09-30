package com.dicoding.belajarsqlite;

import com.dicoding.belajarsqlite.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}