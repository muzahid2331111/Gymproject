module Receptionist {
    requires javafx.controls;
    requires javafx.fxml;


    opens  Receptionist to javafx.fxml;
    exports Receptionist;
}