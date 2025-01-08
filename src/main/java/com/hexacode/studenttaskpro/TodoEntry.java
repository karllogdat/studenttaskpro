package com.hexacode.studenttaskpro;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TodoEntry implements Serializable {
    // description
    private String name;
    // private String section;

    // setter needs to normalize string
    private String subject;
    // private String professor;
    // String school

    // checkbox sa ui
    private boolean status;
    // list sa ui
    private TodoType type;

    // date related fields
    private LocalDateTime deadline;

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public boolean isStatus() {
        return status;
    }

    public TodoType getType() {
        return type;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }
}
