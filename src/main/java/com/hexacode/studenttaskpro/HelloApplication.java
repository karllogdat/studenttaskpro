package com.hexacode.studenttaskpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
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

//        TodoEntry pastTodo = new TodoEntry(
//                "Review for departmentals",
//                "Data Structures and Algorithms",
//                false,
//                TodoType.REVIEW,
//                LocalDateTime.of(2023, 1, 1, 0, 0)
//        );

        console.close();
    }

    public static void main(String[] args) {
        launch();
    }
}