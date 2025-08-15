package Dietetian;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DefineFitnessNutritionObjsController
{
    @javafx.fxml.FXML
    private TextField memberIDTextField;
    @javafx.fxml.FXML
    private TextArea fitnessGoalsTextArea;
    @javafx.fxml.FXML
    private TextArea txtNutritionGoals;
    @javafx.fxml.FXML
    private TextField heightTextField;
    @javafx.fxml.FXML
    private Label outputResultLabel;
    @javafx.fxml.FXML
    private Label weightTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveObjectivesButtonOnClick(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void verifyButtonOnClick(ActionEvent actionEvent) {
    }
    @javafx.fxml.FXML
    public void backButtonOnClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Dietitian.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Vogue Gold's Gym Lifestyle Lounge");
        stage.setScene(scene);
        stage.show();
    }
}