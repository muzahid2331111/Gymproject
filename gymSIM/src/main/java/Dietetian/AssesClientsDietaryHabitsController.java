package Dietetian;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AssesClientsDietaryHabitsController
{

    @javafx.fxml.FXML
    private TextField memberIDTextField;
    @javafx.fxml.FXML
    private TextArea dietPlanTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignButtonOnClick(ActionEvent actionEvent) {
        String memberID = memberIDTextField.getText();
        String dietPlan = dietPlanTextArea.getText();
        DietaryHabits diethabit = new DietaryHabits(memberID, dietPlan);
    }

}