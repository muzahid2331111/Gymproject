package Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class FrontDeskSuppliesController
{

    @javafx.fxml.FXML
    private ComboBox<String> priorityComboBox;
    @javafx.fxml.FXML
    private TextField itemNameTextField;
    @javafx.fxml.FXML
    private Label refillStatusLabel;
    @javafx.fxml.FXML
    private TableView<Supplies> suppliesTableView;
    @javafx.fxml.FXML
    private TableColumn<String, Supplies> itemCol;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private TableColumn<Double, Supplies> quantityCol;


    @javafx.fxml.FXML
    public void initialize() {
        itemCol.setCellValueFactory(new PropertyValueFactory<>("item"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }
    ArrayList<Supplies> suppliesList = new ArrayList<>();

    @javafx.fxml.FXML
    public void checkInventoryButtonOnClick(ActionEvent actionEvent) {
        String item = itemNameTextField.getText();
        double quantity = Double.parseDouble(quantityTextField.getText());
        Supplies supplies = new Supplies(item, quantity);

        suppliesList.add(supplies);
        suppliesTableView.getItems().clear();
        suppliesTableView.getItems().addAll(suppliesList);
    }

    @javafx.fxml.FXML
    public void submitRefillButtonOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void validateButtonOnClick(ActionEvent actionEvent) {
    }

}