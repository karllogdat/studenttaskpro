package com.hexacode.studenttaskpro;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.time.LocalDateTime;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private VBox TodoContainer;

    @FXML
    private void initialize() {
        InitTodoEntries();
    }

    @FXML
    private void InitTodoEntries() {
        for (int i = 0; i < 5; ++i) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("todo-entry.fxml"));
                Pane cardPane = loader.load();

                TodoEntryController todoEntryController = loader.getController();
                todoEntryController.setName("Test Todo Entry" + i);
                todoEntryController.setSubject("Test Subject" + i);
                todoEntryController.setType("REVIEW");
                todoEntryController.setIsDone(false);
                todoEntryController.setDeadline(LocalDateTime.now());

                TodoContainer.getChildren().add(cardPane);
            } catch (IOException e) {
                System.err.println("Error loading FXML File for todo-entry");
            }
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}