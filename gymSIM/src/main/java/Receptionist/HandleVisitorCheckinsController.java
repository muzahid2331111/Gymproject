package Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class HandleVisitorCheckinsController
{
    @javafx.fxml.FXML
    private Label outputShowCheckInLabel;
    @javafx.fxml.FXML
    private TextField checkInTimeTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private TextField visitorNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Integer , Visitor> contactCol;
    @javafx.fxml.FXML
    private TableView<Visitor> visitorTableView;
    @javafx.fxml.FXML
    private TableColumn<String, Visitor> nameCol;
    @javafx.fxml.FXML
    private TableColumn<String, Visitor> checkinCol;

    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        contactCol.setCellValueFactory(new PropertyValueFactory<>("contact"));
        checkinCol.setCellValueFactory(new PropertyValueFactory<>("timing"));
    }
    ArrayList<Visitor> visitorList = new ArrayList<>();

    @javafx.fxml.FXML
    public void logCheckInButtonOnClick(ActionEvent actionEvent) {
        String name = visitorNameTextField.getText();
        int contact = Integer.parseInt(contactTextField.getText());
        String timing = checkInTimeTextField.getText();
        Visitor visitor = new Visitor(name, contact, timing);
        visitorList.add(visitor);
        visitorTableView.getItems().clear();
        visitorTableView.getItems().addAll(visitorList);

        outputShowCheckInLabel.setText(toString());
    }

}