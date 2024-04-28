import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button uploadButton = new Button("Upload ZIP File");
        uploadButton.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open ZIP File");
            fileChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("ZIP Archives", "*.zip")
            );
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                try {
                    
                } catch (Exception e) {
                    e.printStackTrace();
                    showAlert("An error occurred: " + e.getMessage(), Alert.AlertType.ERROR);
                }
            } else {
                showAlert("Please upload a ZIP file.", Alert.AlertType.WARNING);
            }
        });

        Button exportButton = new Button("Export File");
        exportButton.setOnAction(event -> {
            FileChooser fileSaver = new FileChooser();
            fileSaver.setTitle("Save File");
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt");
            fileSaver.getExtensionFilters().add(extFilter);
            File file = fileSaver.showSaveDialog(primaryStage);
            if (file != null) {
                exportFile(file);
            }
        });

        StackPane root = new StackPane();
        root.getChildren().addAll(uploadButton, exportButton);
        uploadButton.setTranslateY(-30);
        exportButton.setTranslateY(30);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Integrated Assignment Environment");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle("Notification");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void exportFile(File file) {
        try {
            String content = "Sample data to export";
            Files.write(Paths.get(file.toURI()), content.getBytes());
            showAlert("File exported successfully!", Alert.AlertType.INFORMATION);
        } catch (Exception e) {
            showAlert("Failed to export file: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
