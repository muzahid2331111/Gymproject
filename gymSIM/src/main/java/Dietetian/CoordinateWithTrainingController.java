package Dietetian;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class CoordinateWithTrainingController
{

    @javafx.fxml.FXML
    private TextArea discussionTextArea;
    @javafx.fxml.FXML
    private TextField scheduleTextField;
    @javafx.fxml.FXML
    private Label outputShowMealLabel;
    @javafx.fxml.FXML
    private TextField memberIDTextField;
    @javafx.fxml.FXML
    private TextField dietaryTimingTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendCoordinationButtonOnClick(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void validateButtonOnClick(ActionEvent actionEvent) {
        String memberID = memberIDTextField.getText();
        String diettiming = dietaryTimingTextField.getText();
        String discussion = discussionTextArea.getText();

    }
}