package Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleTrialSessionsController
{
    @javafx.fxml.FXML
    private ComboBox<String> trialSlotTimeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectTrainerComboBox;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;
    @javafx.fxml.FXML
    private Label outputTrialSlotLabel;
    @javafx.fxml.FXML
    private ComboBox<String> trainerAvailabilityComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        trialSlotTimeComboBox.getItems().addAll("9.00 AM", "11.00 AM", "1.00 PM", "3.00 PM", "5.00 PM" );
        selectTrainerComboBox.getItems().addAll("Mustakina Lazul", "Muzahid Anwar", "Nabil Ul Nabin", "Trisha Rahman", "Syeda Onnesha", "Ikraul Karim");
        trainerAvailabilityComboBox.getItems().addAll("9:00 AM – 11:00 AM" , "11:00 AM – 1:00 PM" , "1:00 PM – 3:00 PM" , "3:00 PM – 5:00 PM", "5:00 PM – 7:00 PM");
    }
    ArrayList <TrialSessions> trialSessionsList = new ArrayList<>();

    @javafx.fxml.FXML
    public void registerTrialSlotButtonOnClick(ActionEvent actionEvent) {
        String trainer = selectTrainerComboBox.getValue();
        String time = trialSlotTimeComboBox.getValue();
        String availability = trainerAvailabilityComboBox.getValue();
        LocalDate date = selectDateDatePicker.getValue();

        TrialSessions trialSessions = new TrialSessions(trainer, time, availability, date);
        trialSessionsList.add(trialSessions);

        outputTrialSlotLabel.setText(toString());
    }
}