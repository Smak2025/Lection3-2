package ru.gr0550x.ui;

import java.util.List;

public interface NoteView {
    String getInputText();
    void clearInput();
    void showNotes(List<Note> notes);
    void showError(String message);
}
