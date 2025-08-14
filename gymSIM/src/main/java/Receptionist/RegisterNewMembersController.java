package Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class RegisterNewMembersController
{
    @javafx.fxml.FXML
    private TableColumn<Integer, NewMember> ageCol;
    @javafx.fxml.FXML
    private TableColumn<String, NewMember> receptionistIDCol;
    @javafx.fxml.FXML
    private TextField contactInfoTextField;
    @javafx.fxml.FXML
    private TableColumn<Integer, NewMember> contactCol;
    @javafx.fxml.FXML
    private TableColumn<String , NewMember> nameCol;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField receptionistIdTextField;
    @javafx.fxml.FXML
    private TableView<NewMember> registerNewMemberTableView;
    @javafx.fxml.FXML
    private Label outputRegistrationLabel;
    @javafx.fxml.FXML
    private TableColumn<String, NewMember> genderCol;
    @javafx.fxml.FXML
    private ToggleGroup Gender;
    @javafx.fxml.FXML
    private TextField ageTextField1;

    @javafx.fxml.FXML
    public void initialize() {
        receptionistIDCol.setCellValueFactory(new PropertyValueFactory<>("receptionistID"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
    }
    ArrayList<NewMember> newMemberList = new ArrayList<>();

    @javafx.fxml.FXML
    public void saveValidateShowButtonOnClick(ActionEvent actionEvent) {
        String receptionistID = receptionistIdTextField.getText();
        String name = nameTextField.getText();
        int age = Integer.parseInt(ageTextField1.getText());
        int contact = Integer.parseInt(contactInfoTextField.getText());

        NewMember newMember = new NewMember(receptionistID, name, Gender, age, contact);
        newMemberList.add(newMember);
    }

    @javafx.fxml.FXML
    public void clickRegistrationButtonOnClick(ActionEvent actionEvent) {
    }
}