package com.example.CE316GroupProjet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("MainApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setTitle("The Integrated Assignment Environment");

        stage.setScene(scene);
        stage.show();

        stage.setMinWidth(1200);
        stage.setMinHeight(800);
        stage.setMaxWidth(1200);
        stage.setMaxHeight(800);
        stage.setResizable(false);

    }

    public static void main(String[] args) {
        launch();
    }
}

