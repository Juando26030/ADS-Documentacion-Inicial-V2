package com.example.hola;

import com.example.hola.dominio.Carro;
import com.example.hola.integracion.IIntegracionFileSystem;
import com.example.hola.integracion.IntegradorFileSystem;
import com.example.hola.negocio.NegocioRentarCarro;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.collections.ObservableList;


import java.io.IOException;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class EventosRentarCarro {
    private final ObservableList<Carro> carrosObservables = FXCollections.observableArrayList();
    public Button btmRefresh;
    public TextArea txtareaoprueba;
    private NegocioRentarCarro negocioRentarCarro;
    private final IntegradorFileSystem integration = new IntegradorFileSystem();
    public Label lblElejirCarro;
    public ComboBox cmbBoxCarros;
    public Button btnServicios;
    public Label lblRentarCarro;
    public Button btnPagar;

    @FXML
    //protected void mBtnPagar() {
       // lblRentarCarro.setText("Rentó el carro...");
   // }


    private void loadCarros(IIntegracionFileSystem integrador) {
        List<Carro> array= integrador.cargarCarros("C:/Users/elice/ADS/ArchivosJson/carros.json");
        cmbBoxCarros.setItems(carrosObservables);
        carrosObservables.setAll(integrador.cargarCarros("C:/Users/elice/ADS/ArchivosJson/carros.json"));
        IntStream.range(0, array.size()).forEach(i -> txtareaoprueba.setText(txtareaoprueba.getText() + array.get(i).toString()));

    }
    private Carro getCarroSeleccionado(){
        return (Carro) this.cmbBoxCarros.getValue();
    }
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


    public void mBtnloadCarros(ActionEvent actionEvent) {
        loadCarros(integration);
    }
}
