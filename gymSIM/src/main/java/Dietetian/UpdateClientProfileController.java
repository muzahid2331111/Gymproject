package Dietetian;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class UpdateClientProfileController
{
    @javafx.fxml.FXML
    private TextField txtMemberID;
    @javafx.fxml.FXML
    private TextField txtPhone;
    @javafx.fxml.FXML
    private TextField txtEmail;
    @javafx.fxml.FXML
    private TextArea medicalNotesTextArea;
    @javafx.fxml.FXML
    private Label outPutShowLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }
    ArrayList<ClientProfile> clientProfileList = new ArrayList<>();
    @javafx.fxml.FXML
    public void updateProfileButtonOnClick(ActionEvent actionEvent) {
        String memberID = txtMemberID.getText();
        String email = txtEmail.getText();
        int phone = Integer.parseInt(txtPhone.getText());
        String medicalNote = medicalNotesTextArea.getText();

        ClientProfile clientProfile = new ClientProfile(memberID, email, medicalNote, phone );
        clientProfileList.add(clientProfile);


    }

    @javafx.fxml.FXML
    public void verifyChangesButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordChangesButtonOnClick(ActionEvent actionEvent) {
    }
}