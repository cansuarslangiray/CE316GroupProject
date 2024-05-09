/*import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class ConfigurationManagementPanel extends VBox {
    private ListView<String> configurationListView;

    public ConfigurationManagementPanel() {
        Button addButton = new Button("Add Configuration");
        addButton.setTextFill(Color.BLUE);
        Button editButton = new Button("Edit Configuration");
        editButton.setTextFill(Color.GREEN);
        Button removeButton = new Button("Remove Configuration");
        removeButton.setTextFill(Color.RED);

        configurationListView = new ListView<>();
        configurationListView.getItems().addAll("C Configuration", "Java Configuration", "Python Configuration");

        addButton.setOnAction(e -> addConfiguration());
        editButton.setOnAction(e -> editConfiguration());
        removeButton.setOnAction(e -> removeConfiguration());

        setSpacing(10);
        setPadding(new Insets(10));
        getChildren().addAll(configurationListView, addButton, editButton, removeButton);
    }

    private void addConfiguration() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add Configuration");
        dialog.setHeaderText(null);
        dialog.setContentText("Enter the name of the new configuration:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> {
            if (!name.trim().isEmpty()) {
                configurationListView.getItems().add(name);
                System.out.println("Added new configuration: " + name);
            } else {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Configuration name cannot be empty!");
                alert.showAndWait();
            }
        });
    }

    private void editConfiguration() {
        String selectedConfig = configurationListView.getSelectionModel().getSelectedItem();
        if (selectedConfig != null) {
            TextInputDialog dialog = new TextInputDialog(selectedConfig);
            dialog.setTitle("Edit Configuration");
            dialog.setHeaderText(null);
            dialog.setContentText("Enter the new name for configuration:");

            Optional<String> result = dialog.showAndWait();
            result.ifPresent(newName -> {
                if (!newName.trim().isEmpty()) {
                    int selectedIndex = configurationListView.getSelectionModel().getSelectedIndex();
                    configurationListView.getItems().set(selectedIndex, newName);
                    System.out.println("Edited configuration: " + selectedConfig + " to " + newName);
                } else {
                    Alert alert = new Alert(AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setHeaderText(null);
                    alert.setContentText("Configuration name cannot be empty!");
                    alert.showAndWait();
                }
            });
        }
    }

    private void removeConfiguration() {
        String selectedConfig = configurationListView.getSelectionModel().getSelectedItem();
        if (selectedConfig != null) {
            configurationListView.getItems().remove(selectedConfig);
            System.out.println("Removed configuration: " + selectedConfig);
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please select a configuration to remove.");
            alert.showAndWait();
        }
    }
}

*/
