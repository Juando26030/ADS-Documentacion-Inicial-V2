package com.example.hola;

import com.example.hola.negocio.INegocioRentarCarro;
import com.example.hola.negocio.NegocioRentarCarro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EventosRentarCarro {
    private NegocioRentarCarro negocioRentarCarro;
    public Label lblElejirCarro;
    public ComboBox cmbBoxCarros;
    public Button btnServicios;
    public Label lblRentarCarro;
    public Button btnPagar;

    @FXML
    //protected void mBtnPagar() {
       // lblRentarCarro.setText("Rentó el carro...");
   // }
    public void mBtnServicios(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("itemsView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }
    public void mBtnPagar(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("pagarView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }


}
