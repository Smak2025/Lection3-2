package ru.gr0550x.ui;

public class NoteController {
    private final NoteService service;
    private final NoteView view;

    public NoteController(
            NoteService service,
            NoteView view
    ){
        this.service = service;
        this.view = view;
    }

    public void addNoteClicked(){
        try {
            var text = view.getInputText();
            service.addNote(text);
            view.clearInput();
            view.showNotes(service.getAllNotes());
        } catch (IllegalArgumentException ex){
            view.showError(ex.getMessage());
        }
    }
}
