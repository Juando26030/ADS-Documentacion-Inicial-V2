package com.example.hola;

import com.example.hola.dominio.Cliente;
import com.example.hola.negocio.NegocioLogIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class EventosLogIn {

    public Button btnCargarClientes;
    private final NegocioLogIn negocioLogIn = new NegocioLogIn();
    public Label lblIngreseUsuario;
    public Button btnLogIn;
    public Label lblUsuario;
    public TextField txtFieldUsuario;
    public Label lblIniciarSesion;

    public void mBtnLogIn(ActionEvent event) throws IOException
    {
        Cliente cliente =negocioLogIn.clienteActual(txtFieldUsuario.getText());
        if(!Objects.equals(cliente.getNombre(), "")){
            Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rentarCarroView.fxml")));
            Scene InicioScene = new Scene(InicioParent);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(InicioScene);
            window.show();
        }else{
            Stage popupStage = new Stage();
            popupStage.initStyle(StageStyle.UTILITY);
            popupStage.initModality(Modality.APPLICATION_MODAL);

            StackPane stackPane = new StackPane();
            stackPane.setAlignment(Pos.CENTER);
            stackPane.getChildren().add(new Label("Usuario no encontrado"));

            Scene popupScene = new Scene(stackPane, 250, 150);
            popupStage.setScene(popupScene);
            popupStage.setTitle("Error");
            popupStage.showAndWait();

        }

    }
    public void mBtnloadCLientes() {
        negocioLogIn.cargarClientes();
    }
}