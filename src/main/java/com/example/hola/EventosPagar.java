package com.example.hola;

import com.example.hola.negocio.NegocioRentarCarro;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EventosPagar{
    private NegocioRentarCarro negocioPagar;
    public Label lblMomentoPagar;
    public Label lblSaldoAPagar;
    public Label lblSaldoPorPagar;
    public Label lblIngresarMoneda;
    public TextField txtFieldMoneda;
    public Label txtSaldoAPagar;
    public Label txtSaldoPorPagar;
    public Button btnTerminarRenta;


    public Label txtMonedaValidada;
    public Label lblResumen;
    public Label lblUsuarioResumen;
    public Label lblCarroResumen;
    public Label lblItemsResumen;
    public Button btnVolverRenta;
    public Label txtUsuarioResumen;
    public Label txtCarroResumen;
    public ListView tableItems;

    public void mBtnVolverRenta(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("rentarCarroView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }
    public void mBtnTerminarRenta(ActionEvent event) throws IOException{
        // TODO: Verificar pago y guardar renta en mBtnTerminarRenta
    }
}
