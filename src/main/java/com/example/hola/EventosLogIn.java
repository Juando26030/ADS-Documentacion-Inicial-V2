package com.example.hola;

import com.example.hola.negocio.NegocioLogIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EventosLogIn {
    private NegocioLogIn negocioLogIn;
    public Label lblIngreseUsuario;
    public Button btnLogIn;
    public Label lblUsuario;
    public TextField txtFieldUsuario;
    public Label lblIniciarSesion;

    public void mBtnLogIn(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rentarCarroView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
        //negocioLogIn.clienteActual();
    }
}