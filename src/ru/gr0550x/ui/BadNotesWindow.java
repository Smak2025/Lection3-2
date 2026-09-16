package ru.gr0550x.ui;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BadNotesWindow extends JFrame {
    private final JTextField inputField = new JTextField(50);
    private final JButton addButton = new JButton("Добавить заметку");
    private final JTextArea notesArea = new JTextArea(12, 50);

    private final List<String> notes = new ArrayList<>();

    public BadNotesWindow(){
        setTitle("Плохой пример!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(inputField);
        topPanel.add(addButton);
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(notesArea), BorderLayout.CENTER);

        addButton.addActionListener(e -> {
            String text = inputField.getText();

            if (text == null || text.isBlank()){
                JOptionPane.showMessageDialog(this, "Введите текст заметки");
                return;
            }

            notes.add((notes.size() + 1) + ". " + LocalDateTime.now() + ":" + text);

            notesArea.setText("");
            for (var note: notes){
                notesArea.append(note + "\n");
            }
        });

        pack();
        setLocationRelativeTo(null);
    }
}
