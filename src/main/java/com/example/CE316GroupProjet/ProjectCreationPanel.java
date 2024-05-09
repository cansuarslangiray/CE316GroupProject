/*import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ProjectCreationPanel extends VBox {
    private ComboBox<String> configurationComboBox;

    public ProjectCreationPanel() {
        Label titleLabel = new Label("Create New Project");
        configurationComboBox = new ComboBox<>();
        configurationComboBox.getItems().addAll("C Configuration", "Java Configuration", "Python Configuration");
        Button createButton = new Button("Create Project");

        createButton.setOnAction(e -> createProject());

        setSpacing(10);
        setPadding(new Insets(10));
        getChildren().addAll(titleLabel, configurationComboBox, createButton);
    }

    private void createProject() {
        String selectedConfig = configurationComboBox.getSelectionModel().getSelectedItem();
        // Code to create the project with the selected configuration
        System.out.println("Project created with configuration: " + selectedConfig);
    }
}
*/