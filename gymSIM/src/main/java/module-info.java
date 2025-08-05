module com.example.gymsim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gymsim to javafx.fxml;
    exports com.example.gymsim;
}