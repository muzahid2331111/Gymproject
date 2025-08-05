package Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class ScheduleTrialSessionsController
{
    @javafx.fxml.FXML
    private ComboBox trialSlotTimeComboBox;
    @javafx.fxml.FXML
    private ComboBox selectTrainerComboBox;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;
    @javafx.fxml.FXML
    private Label outputTrialSlotLabel;
    @javafx.fxml.FXML
    private ComboBox trainerAvailabilityComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void registerTrialSlotButtonOnClick(ActionEvent actionEvent) {
    }
}