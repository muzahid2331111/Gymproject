package Dietetian;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BuildNutritionPlanController
{

    @javafx.fxml.FXML
    private TextField memberIDTextField;
    @javafx.fxml.FXML
    private ComboBox<String>  mealPlanComboBox;
    @javafx.fxml.FXML
    private TextArea planDetailsTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        mealPlanComboBox.getItems().addAll("Standard Gym Diet" , "High Protein Diet" , "Low Carb Diet" , "Ketogenic Diet" , "Vegan / Plant-Based Diet" , "Vegetarian Diet" , "Paleo Diet" , "Gluten-Free Diet" , "Dairy-Free Diet");
    }

    @javafx.fxml.FXML
    public void buildPlanButtonOnClick(ActionEvent actionEvent) {
        String memberID = memberIDTextField.getText();
        String mealPlan = mealPlanComboBox.getValue();
        String planDetails = planDetailsTextArea.getText();
        NutritionPlan plan = new NutritionPlan(memberID, planDetails , planDetails);

    }
}