package com.example.designpatterns.behavioural.command.UndoRedo;

// Command to type text
public class TypeTextCommand implements Command {
    private String text;
    private TextEditor editor;

    public TypeTextCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.type(text);
    }

    @Override
    public void undo() {
        editor.deleteLastTyped(text.length());
    }
}
