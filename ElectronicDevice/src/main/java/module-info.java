module com.example.electronicdevice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.electronicdevice to javafx.fxml;
    exports com.example.electronicdevice;
}