module com.example.lab3walec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab3walec to javafx.fxml;
    exports com.example.lab3walec;
}