package com.hexacode.studenttaskpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // console checking
        Scanner console = new Scanner(System.in);

        TodoList list = new TodoList();

        TodoEntry linear = new TodoEntry(
                "Finals",
                "Free Elective",
                false,
                TodoType.REVIEW,
                LocalDateTime.of(2025, 1, 31, 0, 0)
        );

        TodoEntry dsa = new TodoEntry(
                "Review for Deptals",
                "DSA",
                false,
                TodoType.REVIEW,
                LocalDateTime.of(2025, 1, 15, 0, 0)
        );

        TodoEntry ds2 = new TodoEntry(
                "Review for Deptals",
                "Discrete Structures 2",
                false,
                TodoType.REVIEW,
                LocalDateTime.of(2025, 1, 22, 0, 0)
        );

        list.addEntry(linear);
        list.addEntry(dsa);
        list.addEntry(ds2);

        for (TodoEntry entry : list.getList()) {
            System.out.println(entry.toString());
            System.out.println();
        }

        console.close();
    }

    public static void main(String[] args) {
        launch();
    }
}