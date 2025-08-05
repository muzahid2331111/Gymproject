package Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class WalkInMembershipQueryController
{
    @javafx.fxml.FXML
    private CheckBox cbStudentDiscount;
    @javafx.fxml.FXML
    private CheckBox cbShortTerm;
    @javafx.fxml.FXML
    private CheckBox cbLongTerm;
    @javafx.fxml.FXML
    private Label lblPlanDetails;
    @javafx.fxml.FXML
    private ComboBox durationComboBox;
    @javafx.fxml.FXML
    private TableColumn planNameCol;
    @javafx.fxml.FXML
    private ComboBox priceComboBox;
    @javafx.fxml.FXML
    private TableView PlanTableView;
    @javafx.fxml.FXML
    private TableColumn durationCol;
    @javafx.fxml.FXML
    private TableColumn priceCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void findPlansButtonOnClick(ActionEvent actionEvent) {
    }
}