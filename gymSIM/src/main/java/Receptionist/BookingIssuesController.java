package Receptionist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BookingIssuesController {

    private TableView<BookingSession> sessionListTableView;
    private TableColumn<BookingSession, String> sessionIDCol;
    private TableColumn<BookingSession, String> timeCol;
    private TableColumn<BookingSession, String> statusCol;
    private TextField searchMemberTextField;
    private Label outputShowBookingInfoLabel;

    private ObservableList<BookingSession> bookingData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        sessionIDCol.setCellValueFactory(cellData -> cellData.getValue().sessionIDProperty());
        timeCol.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        statusCol.setCellValueFactory(cellData -> cellData.getValue().statusProperty());

        // Dummy Data
        bookingData.addAll(
                new BookingSession("S101", "10:00 AM", "Booked"),
                new BookingSession("S102", "11:00 AM", "Pending"),
                new BookingSession("S103", "12:00 PM", "Cancelled")
        );

        sessionListTableView.setItems(bookingData);
    }

    public void updateBookingButtonOnClick(ActionEvent actionEvent) {
        String name = searchMemberTextField.getText().trim();
        if (!name.isEmpty()) {
            // Simulate updating a booking for demo purposes
            BookingSession newSession = new BookingSession("S104", "1:00 PM", "Booked");
            bookingData.add(newSession);
            sessionListTableView.setItems(bookingData);

            outputShowBookingInfoLabel.setText("Booking updated for: " + name);
        } else {
            outputShowBookingInfoLabel.setText("Enter member name to update booking.");
        }
    }

    public void cancelBookingButtonOnClick(ActionEvent actionEvent) {
        BookingSession selected = sessionListTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            bookingData.remove(selected);
            outputShowBookingInfoLabel.setText("Booking canceled: " + selected.getSessionID());
        } else {
            outputShowBookingInfoLabel.setText("Please select a booking to cancel.");
        }
    }
}
