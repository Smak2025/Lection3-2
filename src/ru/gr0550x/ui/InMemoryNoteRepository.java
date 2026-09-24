package ru.gr0550x.ui;

import java.util.ArrayList;
import java.util.List;

public class InMemoryNoteRepository implements NoteRepository{

    private final List<Note> notes = new ArrayList<>();
    @Override
    public void save(Note note) {
        notes.add(note);
    }

    @Override
    public List<Note> findAll() {
        return List.copyOf(notes);
    }
}
