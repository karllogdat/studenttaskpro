package com.hexacode.studenttaskpro;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Comparator;

public class TodoEntry implements Serializable, Comparable<TodoEntry> {
    // description
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
        this.name = name;
        this.subject = subject;
        this.isDone = status;
        this.type = type;
        this.deadline = deadline;
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

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
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
}
