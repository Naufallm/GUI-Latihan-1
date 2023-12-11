module proglan.guilatihan {
    requires javafx.controls;
    requires javafx.fxml;


    opens proglan.guilatihan to javafx.fxml;
    exports proglan.guilatihan;
}