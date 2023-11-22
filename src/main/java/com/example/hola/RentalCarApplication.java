package com.example.hola;


import com.example.hola.negocio.NegocioLogIn;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class RentalCarApplication extends Application {
    final public NegocioLogIn negocioLogIn=new NegocioLogIn();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RentalCarApplication.class.getResource("logInView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("CAR RENTAL SYSTEM");
        stage.setScene(scene);
        stage.show();
        negocioLogIn.cargarClientes();
    }

    public static void main(String[] args) {
        launch();
    }
}