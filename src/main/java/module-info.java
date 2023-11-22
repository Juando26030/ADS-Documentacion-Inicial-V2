module com.example.hola {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires com.fasterxml.jackson.databind;


    opens com.example.hola to javafx.fxml;
    exports com.example.hola;
    exports com.example.hola.integracion;
    opens com.example.hola.integracion to javafx.fxml;
    exports com.example.hola.negocio;
    opens com.example.hola.negocio to javafx.fxml;
}