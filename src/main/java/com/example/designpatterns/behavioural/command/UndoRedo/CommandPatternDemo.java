package com.example.designpatterns.behavioural.command.UndoRedo;

public class CommandPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        Command typeHello = new TypeTextCommand(editor, "Hello ");
        Command typeWorld = new TypeTextCommand(editor, "World!");

        // Execute commands
        manager.executeCommand(typeHello);
        manager.executeCommand(typeWorld);

        System.out.println("Content after typing: " + editor.getContent()); // Output: Hello World!

        // Undo last command
        manager.undo();
        System.out.println("Content after undo: " + editor.getContent()); // Output: Hello

        // Redo last command
        manager.redo();
        System.out.println("Content after redo: " + editor.getContent()); // Output: Hello World!
    }
}
