package Dietetian;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class EducateNutritionPrinciplesController
{

    @javafx.fxml.FXML
    private TextArea educationContentTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> topicComboBox;
    @javafx.fxml.FXML
    private Label outputContentLabel;

    @javafx.fxml.FXML
    public void initialize() {
        topicComboBox.getItems().addAll("Macronutrients", "Micronutrients", "Hydration", "Energy Balance", "Meal Timing", "Dietary Patterns");
    }

    @javafx.fxml.FXML
    public void publishButtonOnClick(ActionEvent actionEvent) {
        String topic = topicComboBox.getValue();
        String content = educationContentTextArea.getText();

    }
}