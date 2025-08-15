module Receptionist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens  Receptionist to javafx.fxml;
    exports Receptionist;
}