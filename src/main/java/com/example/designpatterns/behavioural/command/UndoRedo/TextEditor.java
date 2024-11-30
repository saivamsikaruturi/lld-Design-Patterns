package com.example.designpatterns.behavioural.command.UndoRedo;

public class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void type(String text) {
        content.append(text);
    }

    public void deleteLastTyped(int length) {
        int start = content.length() - length;
        if (start >= 0) {
            content.delete(start, content.length());
        }
    }

    public String getContent() {
        return content.toString();
    }
}
