package com.hexacode.studenttaskpro;

import com.hexacode.studenttaskpro.exceptions.IllegalDateException;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Focal class for application todo entries
 */
public class TodoEntry implements Serializable, Comparable<TodoEntry> {
    private String name;
    // private String section;

    // setter needs to normalize string
    private String subject;
    // private String professor;
    // String school

    // checkbox sa ui
    private boolean isDone;
    // list sa ui
    private TodoType type;

    // date related fields
    private LocalDateTime deadline;

    // constructor
    TodoEntry(String name, String subject, boolean status, TodoType type, LocalDateTime deadline) {
        // uses setter functions to properly handle invalid arguments
        this.setName(name);
        this.setSubject(subject);
        this.setDone(status);
        this.setType(type);
        this.setDeadline(deadline);
    }

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
     * Sets todo entry deadline.
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
