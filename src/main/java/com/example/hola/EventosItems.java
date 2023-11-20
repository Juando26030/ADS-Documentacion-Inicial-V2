package com.example.hola;

import com.example.hola.negocio.NegocioItems;
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
    private NegocioItems negocioItems;
    public Label lblServiciosDisponibles;
    public ComboBox cmbListaServicios;
    public Label lblPrecioPorPersona;
    public Button btnAgregarServicio;
    public Label txtValorUnitario;
    public Label lblCantPersonas;
    public TextField txtFieldCantPersonas;
    public Label lblPrecioTotal;
    public Label txtPrecioTotal;
    public Button btnVolverRenta;
    public Label lblElejirServicios;

    public void mBtnVolverRenta(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rentarCarroView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
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

}
