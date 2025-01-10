package com.hexacode.studenttaskpro;

import java.io.*;
import java.util.PriorityQueue;

public class TodoList {
    private PriorityQueue<TodoEntry> list = new PriorityQueue<TodoEntry>();

    // TODO: make file path dynamic
    // example: System.getProperty("user.home") + "/todos.ser"
    private final File file = new File("src/main/resources/todos.ser");

    TodoList() {
        readTodosFromFile();
    }

    @SuppressWarnings("unchecked")
    public void readTodosFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // file is empty, no need to read object
            if (file.length() == 0) {
                return;
            }
            // TODO: add proper checking of file to prevent IOException
            // IOException occurs when the file contains no object, but
            // lines 24-26 fails.

            // read todos in file to PriorityQueue<TodoEntry> list of TodoList
            this.list = (PriorityQueue<TodoEntry>) in.readObject();

            fileIn.close();
            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file.getPath());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }

    public void writeTodosToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(this.list);

            fileOut.close();
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file.getPath());
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    public void addEntry(TodoEntry entry) {
        this.list.add(entry);
        writeTodosToFile();
    }

    public PriorityQueue<TodoEntry> getList() {
        return this.list;
    }
}