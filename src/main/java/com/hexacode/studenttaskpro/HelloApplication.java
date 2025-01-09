package com.hexacode.studenttaskpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.PriorityQueue;
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

        TodoEntry myTodo = new TodoEntry(
                "Review for deptals",
                "DSA",
                false,
                TodoType.REVIEW,
                LocalDateTime.of(
                        2025,
                        1,
                        24,
                        12,
                        0
                )
        );

        TodoEntry othertodo = new TodoEntry(
                "Review for deptals",
                "OOP",
                false,
                TodoType.REVIEW,
                LocalDateTime.of(
                        2025,
                        1,
                        22,
                        12,
                        0
                )
        );

        PriorityQueue<TodoEntry> list = new PriorityQueue<TodoEntry>();

        list.add(othertodo);
        list.add(myTodo);

        System.out.println(list.peek().getSubject());

        System.out.println(myTodo.getName());
        System.out.println(myTodo.getSubject());
        System.out.println(myTodo.isDone());
        System.out.println(myTodo.getType());
        System.out.println(myTodo.getDeadline());

        console.close();
    }

    public static void main(String[] args) {
        launch();
    }
}