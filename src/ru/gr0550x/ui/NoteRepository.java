package ru.gr0550x.ui;

import java.util.List;

public interface NoteRepository {
    void save(Note note);
    List<Note> findAll();
}
