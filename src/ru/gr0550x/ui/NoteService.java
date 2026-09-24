package ru.gr0550x.ui;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class NoteService {
    private final NoteRepository repository;

    public NoteService(NoteRepository repository){
        this.repository = repository;
    }

    public void addNote(String text){
        if (text == null || text.isBlank()){
            throw new IllegalArgumentException("Текст заметки не может быть пустым");
        }
        var note = new Note(UUID.randomUUID(), text, LocalDateTime.now());
        repository.save(note);
    }

    public List<Note> getAllNotes(){
        return repository.findAll();
    }
}
