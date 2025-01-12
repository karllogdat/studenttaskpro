package com.hexacode.studenttaskpro;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.time.LocalDateTime;

public class TodoEntryController {
    @FXML
    private Label name;

    @FXML
    private Label subject;

    @FXML
    private Label type;

    @FXML
    private Label deadline;

    @FXML
    private CheckBox isDone;

    @FXML
    public void initialize() {
        // TODO initialize event handling for marking as done
        System.out.println("print for debug :)");
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public void setSubject(String subject) {
        this.subject.setText(subject);
    }

    public void setType(String type) {
        this.type.setText(type);
    }

    public void setIsDone(boolean isDone) {
        this.isDone.setSelected(isDone);
    }

    public void setDeadline(LocalDateTime deadline) {
        // TODO convert LocalDateTime to string
        this.deadline.setText("01/01/2025");
    }
}
