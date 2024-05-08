import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();
/*
        // Create tabs for quiz management, project creation, and configuration management
        Tab quizTab = new Tab("Quiz Management", new QuizManagementPanel());
        Tab projectCreationTab = new Tab("Project Creation", new ProjectCreationPanel());
        Tab configurationManagementTab = new Tab("Configuration Management", new ConfigurationManagementPanel());

        tabPane.getTabs().addAll(quizTab, projectCreationTab, configurationManagementTab);
*/
        // Set scene and stage properties
        Scene scene = new Scene(tabPane, 1024, 768);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Educational Code Compiler and Grader");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
