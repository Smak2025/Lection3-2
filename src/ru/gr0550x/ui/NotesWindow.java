package ru.gr0550x.ui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class NotesWindow extends JFrame implements NoteView{
    private final JTextField inputField = new JTextField(50);
    private final JButton addButton = new JButton("Добавить заметку");
    private final JTextArea notesArea = new JTextArea(12, 50);

    private final NoteController controller;
    public NotesWindow(NoteController controller){

        this.controller = controller;

        setTitle("Хороший пример!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(inputField);
        topPanel.add(addButton);
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(notesArea), BorderLayout.CENTER);

        addButton.addActionListener(e -> {
            controller.addNoteClicked();
        });

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public String getInputText() {
        return inputField.getText();
    }

    @Override
    public void clearInput() {
        inputField.setText("");
    }

    @Override
    public void showNotes(List<Note> notes) {
        notesArea.setText("");
        var i = 1;
        for (Note note: notes) {
            notesArea.append(i++ + ". " + note.createdAt() + ": " + note.text());

        }
    }

    @Override
    public void showError(String message) {

    }
}
