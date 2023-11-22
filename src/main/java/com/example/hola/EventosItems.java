package com.example.hola;


import com.example.hola.dominio.Servicio;
import com.example.hola.integracion.IIntegracionFileSystem;
import com.example.hola.integracion.IntegradorFileSystem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EventosItems {
    private final ObservableList<Servicio> serviciosObservables = FXCollections.observableArrayList();
    private final IntegradorFileSystem integration = new IntegradorFileSystem();

    public Label lblServiciosDisponibles;
    public ComboBox cmbListaServicios;
    public Label lblPrecioPorPersona;
    public Button btnAgregarServicio;
    public Label txtValorUnitario;
    public Label lblCantPersonas;
    public TextField txtFieldCantPersonas;
    public Label txtPrecioTotal;
    public Button btnPagar;
    public Label lblElejirServicios;
    public Label lblMisServicios;
    public Label lblServiciosContratados;
    public ComboBox cmbServiciosContratados;
    public Button btnModificarServicio;
    public Button btnEliminarServicio;
    public Label lblCantPersonasXServicio;
    public TextField txtFieldCantXServicio;
    public Label lblConsejo;
    public Button btnVolverRenta;
    public Label lblPrecioTotal;

    public void mBtnVolverRenta(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rentarCarroView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }
    public void mBtnPagar (ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("pagarView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }
    private void loadServicios(IIntegracionFileSystem integrador) {
        cmbListaServicios.setItems(serviciosObservables);
        serviciosObservables.setAll(integrador.cargarServicios("C:/Users/elice/ADS/ArchivosJson/servicios.json"));

    }
    public void mBtnAgregarServicio(ActionEvent event) throws IOException{
        //Agregar item en mBtnAgregarServicio
    }
    public void mBtnModificarServicio(ActionEvent event) throws IOException{
        //Modificar item en mBtnAgregarServicio
    }
    public void mBtnEliminarServicio(ActionEvent event) throws IOException{
        //Eliminar item en mBtnAgregarServicio
    }

    public void mloadServicios(ActionEvent actionEvent) {
        loadServicios(integration);
    }
}
