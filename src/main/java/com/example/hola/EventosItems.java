package com.example.hola;


import com.example.hola.dominio.Item;
import com.example.hola.dominio.Servicio;
import com.example.hola.integracion.IIntegracionFileSystem;
import com.example.hola.integracion.IntegradorFileSystem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class EventosItems {
    private final ObservableList<Servicio> serviciosObservables = FXCollections.observableArrayList();
    private final ObservableList<Item> misItemsObservables = FXCollections.observableArrayList();
    private final IntegradorFileSystem integration = new IntegradorFileSystem();

    final private Constantes constantes =new Constantes();
    Variables vars = Variables.getInstance();
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
        serviciosObservables.setAll(integrador.cargarServicios(Constantes.SERVICIOSJSON));
        cmbServiciosContratados.setItems(misItemsObservables);
        if(vars.getRenta().getItems()!= null){
            misItemsObservables.setAll(vars.getRenta().getItems());
        }
    }
    public void mBtnAgregarServicio(ActionEvent event) throws IOException{
        // Obtener la cantidad de pasajeros desde el campo de texto
        int cantidadPasajeros = Integer.parseInt(txtFieldCantPersonas.getText());

        // Obtener el servicio seleccionado desde el ComboBox
        Servicio servicioSeleccionado = (Servicio) cmbListaServicios.getValue();

        // Crear un nuevo item con la cantidad de pasajeros y el servicio
        Item nuevoItem = new Item(cantidadPasajeros, servicioSeleccionado);

        // Agregar el nuevo item a la lista de items de la renta actual
        boolean bandera=true;
        for (Item item :vars.getRenta().getItems()) {
            if(item.equals(nuevoItem)){
                bandera =false;
                break;
            }
        }
        if(bandera){
            vars.getRenta().getItems().add(nuevoItem);
        }else{
            Stage popupStage = new Stage();
            popupStage.initStyle(StageStyle.UTILITY);
            popupStage.initModality(Modality.APPLICATION_MODAL);
            StackPane stackPane = new StackPane();
            stackPane.setAlignment(Pos.CENTER);
            stackPane.getChildren().add(new Label("Este servicio ya esta contratado, si desea modificarlo lo puede hacer en el lado derecho de la pantalla"));
            Scene popupScene = new Scene(stackPane, 250, 150);
            popupStage.setScene(popupScene);
            popupStage.setTitle("Error");
            popupStage.showAndWait();
        }

        // Limpiar los campos de entrada despues de agregar el servicio
        txtFieldCantPersonas.clear();
        cmbListaServicios.getSelectionModel().clearSelection();

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
