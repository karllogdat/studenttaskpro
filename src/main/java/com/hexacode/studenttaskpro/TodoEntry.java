package com.hexacode.studenttaskpro;

import com.hexacode.studenttaskpro.exceptions.IllegalDateException;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Focal class for application
 */
public class TodoEntry implements Serializable, Comparable<TodoEntry> {
    private String name;
    private String subject;
    private boolean isDone;
    private TodoType type;
    private LocalDateTime deadline;

    // constructor
    // status parameter might be removed since addition of entry
    // implies that it is not done yet
    TodoEntry(String name, String subject, boolean status, TodoType type, LocalDateTime deadline) {
        // uses setter functions to properly handle
        // invalid arguments (if required)
        this.setName(name);
        this.setSubject(subject);
        this.setDone(status);
        this.setType(type);
        this.setDeadline(deadline);
    }

    // default constructor
    TodoEntry() {
        this.name = "Unnamed";
        this.subject = "Unnamed";
        this.isDone = false;
        this.type = TodoType.REVIEW;
        this.deadline = LocalDateTime.now();
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }

    public void setType(TodoType type) {
        this.type = type;
    }

    /**
     * Sets entry deadline.
     * @param deadline LocalDateTime type. deadline must not be a past date.
     * @throws IllegalDateException when given date is invalid. use try-catch statements
     * to handle such cases.
     */
    public void setDeadline(LocalDateTime deadline) throws IllegalDateException{
        if (deadline.isBefore(LocalDateTime.now())) {
            throw new IllegalDateException("Todo deadline is in the past");
        }
    }

    // getters
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isDone() {
        return isDone;
    }

    public TodoType getType() {
        return type;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    // for sorting the class
    @Override
    public int compareTo(TodoEntry other) {
        return this.deadline.compareTo(other.deadline);
    }

    // string debug
    @Override
    public String toString() {
        return this.name + "\n" + this.subject + "\n" + this.isDone + "\n" + this.type + "\n" + this.deadline + "\n";
    }
}