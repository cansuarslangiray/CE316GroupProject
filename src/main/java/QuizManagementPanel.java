import javafx.application.Platform;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class QuizManagementPanel extends VBox {
    private FileChooser fileChooser = new FileChooser();
    private TextArea resultsDisplay = new TextArea();
    private String expectedOutputPath;

    public QuizManagementPanel() {
        Button uploadQuizAnswerButton = new Button("Upload Quiz Answer");
        Button uploadSubmissionsButton = new Button("Upload Student Submissions");

        configureFileChooser(fileChooser);

        uploadQuizAnswerButton.setOnAction(e -> {
            File quizAnswerFile = fileChooser.showOpenDialog(null);
            if (quizAnswerFile != null) {
                expectedOutputPath = quizAnswerFile.getPath();
                resultsDisplay.setText("Quiz answer file uploaded: " + quizAnswerFile.getName());
            }
        });

        uploadSubmissionsButton.setOnAction(e -> {
            File submissionsZip = fileChooser.showOpenDialog(null);
            if (submissionsZip != null && expectedOutputPath != null) {
                resultsDisplay.setText("Grading in progress...");
                processSubmissions(submissionsZip);
            } else if (expectedOutputPath == null) {
                resultsDisplay.setText("Please upload the quiz answer file first.");
            }
        });

        this.getChildren().addAll(uploadQuizAnswerButton, uploadSubmissionsButton, resultsDisplay);
    }

    private void processSubmissions(File submissionsZip) {
        Thread gradingThread = new Thread(() -> {
            try {
                List<String> results = QuizGrader.gradeSubmissions(submissionsZip.getPath(), expectedOutputPath);
                Platform.runLater(() -> resultsDisplay.setText(String.join("\n", results)));
            } catch (Exception e) {
                Platform.runLater(() -> resultsDisplay.setText("Failed to grade submissions: " + e.getMessage()));
            }
        });
        gradingThread.start();
    }
    private void configureFileChooser(FileChooser fileChooser) {
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("ZIP Files", "*.zip"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
    }


}
