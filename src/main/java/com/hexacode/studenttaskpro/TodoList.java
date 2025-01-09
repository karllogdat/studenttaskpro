package com.hexacode.studenttaskpro;

import java.io.*;
import java.util.PriorityQueue;

public class TodoList {
    private PriorityQueue<TodoEntry> list = new PriorityQueue<TodoEntry>();
    private final File file = new File("src/main/resources/com/hexacode/studenttaskpro/todos.ser");

    TodoList() {
        readTodosFromFile();
    }

    public void readTodosFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // file is empty, no need to read object
            if (file.length() == 0) {
                return;
            }

        } catch (IOException _) {
            System.out.println("No file found: " + file.getPath());
        }
    }

    public void writeTodosToFile() {
        // TODO: unimplemented
    }
}