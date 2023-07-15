module com.example.endofsem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.endofsem to javafx.fxml;
    exports com.example.endofsem;
}