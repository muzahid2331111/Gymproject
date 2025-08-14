package Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class RespondToPhoneIquiriesController {
    @javafx.fxml.FXML
    private Label lblSearchResult;
    @javafx.fxml.FXML
    private TextField txtCallerName;
    @javafx.fxml.FXML
    private TextField inqueryDetailsTextField;
    @javafx.fxml.FXML
    private Label outputSearchedInfoLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    ArrayList<RespondPhone> respondList = new ArrayList();

    @javafx.fxml.FXML
    public void SearchButtonOnClick(ActionEvent actionEvent) {
        String name = txtCallerName.getText();
        String details = inqueryDetailsTextField.getText();
        RespondPhone respondPhone = new RespondPhone(name, details);
        respondList.add(respondPhone);


    }
}