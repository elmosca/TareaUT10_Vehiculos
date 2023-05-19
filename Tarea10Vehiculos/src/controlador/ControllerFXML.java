/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import modelo.Turismo;
import modelo.Moto;
import modelo.Industrial;
import modelo.Vehiculo;

/**
 * FXML Controller class
 *
 * @author Jualas
 */
public class ControllerFXML implements Initializable {

    @FXML
    private ComboBox<String> combustibleComboBox;
    @FXML
    private ComboBox<?> carroceriaComboBox;
    @FXML
    private RadioButton industrialRadioButton;
    @FXML
    private RadioButton motoRadioButton;
    @FXML
    private RadioButton turismoRadioButton;
    @FXML
    private ListView<Vehiculo> vehiculosListView;
    @FXML
    private Label lbTipoDeVehiculo;
    @FXML
    private TextField tfmarca;
    @FXML
    private TextField tfmodelo;
    @FXML
    private TextField tfpotencia;
    @FXML
    private TextField tfkm;
    @FXML
    private TextField tfano;
    @FXML
    private TextField tfmedidas;
    @FXML
    private TextField tfprecio;
    @FXML
    private Label lbmarca;
    @FXML
    private Button btteliminarvehiculo;
    @FXML
    private Button bttagregarvehiculo;
    @FXML
    private TextField tfnumruedas;
    @FXML
    private VBox turismoVBox;
    @FXML
    private VBox motoVBox;
    @FXML
    private VBox industrialVBox;
    @FXML
    private ToggleGroup vehiculoGroup;
    @FXML
    private TextField tftamanocaja;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Grupo de los RadioButtons
        final ToggleGroup group = new ToggleGroup();
        turismoRadioButton.setToggleGroup(group);
        motoRadioButton.setToggleGroup(group);
        industrialRadioButton.setToggleGroup(group);

        // Manejador de eventos para Turismo
        turismoRadioButton.setOnAction(event -> {
            if (turismoRadioButton.isSelected()) {
                // Habilitar los campos y opciones específicas para Turismo
                tfmarca.setDisable(false);
                tfmodelo.setDisable(false);
                tfpotencia.setDisable(false);
                tfkm.setDisable(false);
                tfano.setDisable(false);
                tfmedidas.setDisable(false);
                tfprecio.setDisable(false);
                combustibleComboBox.setDisable(false);
                carroceriaComboBox.setDisable(false);

                // Asegurarse de que los elementos específicos de otras subclases estén deshabilitados o invisibles
                tfnumruedas.setDisable(true);
                tftamanocaja.setDisable(true);
                motoVBox.setVisible(false);
                industrialVBox.setVisible(false);
                turismoVBox.setVisible(true);
            }
        });

        // Manejador de eventos para Moto
        motoRadioButton.setOnAction(event -> {
            if (motoRadioButton.isSelected()) {
                // Habilitar los campos y opciones específicas para Moto
                tfmarca.setDisable(false);
                tfmodelo.setDisable(false);
                tfpotencia.setDisable(false);
                tfkm.setDisable(false);
                tfano.setDisable(false);
                tfmedidas.setDisable(false);
                tfprecio.setDisable(false);
                combustibleComboBox.setDisable(false);
                tfnumruedas.setDisable(false);

                // Deshabilitar los campos y opciones no relevantes para Moto
                tftamanocaja.setDisable(true);
                carroceriaComboBox.setDisable(true);

                // Limpiar y establecer las opciones del combobox de combustible
                combustibleComboBox.getItems().clear();
                combustibleComboBox.getItems().addAll("Gasolina", "Eléctrico");
            }
        });

        // Manejador de eventos para Industrial
        industrialRadioButton.setOnAction(event -> {
            if (industrialRadioButton.isSelected()) {
                // Habilitar los campos y opciones específicas para Industrial
                tfmarca.setDisable(false);
                tfmodelo.setDisable(false);
                tfpotencia.setDisable(false);
                tfkm.setDisable(false);
                tfano.setDisable(false);
                tfmedidas.setDisable(false);
                tftamanocaja.setDisable(false);
                tfprecio.setDisable(false);
                combustibleComboBox.getItems().setAll("Diésel");
                combustibleComboBox.setDisable(false);

                // Deshabilitar los campos y opciones no relevantes para Industrial
                tfnumruedas.setDisable(true);
                carroceriaComboBox.setDisable(true);

            }
        });
    }

    @FXML
    private void handleAgregarVehiculo() {
        // Verificar qué tipo de vehículo ha sido seleccionado
        if (turismoRadioButton.isSelected()) {
            agregarTurismo();
        } else if (motoRadioButton.isSelected()) {
            agregarMoto();
        } else if (industrialRadioButton.isSelected()) {
            agregarIndustrial();
        } else {
            // Mostrar un mensaje si no se seleccionó un tipo de vehículo
            System.out.println("Por favor, selecciona un tipo de vehículo.");
        }
    }
    
    //Metodo para agregar Turismo
    private void agregarTurismo() {
    // Verificar que todos los campos requeridos estén llenos
    if (tfmarca.getText().isEmpty() || tfmodelo.getText().isEmpty() || tfpotencia.getText().isEmpty()|| tfkm.getText().isEmpty() || tfano.getText().isEmpty() || tfmedidas.getText().isEmpty() || tftamanocaja.getText().isEmpty() || tfprecio.getText().isEmpty()) {
        System.out.println("Por favor, llena todos los campos requeridos.");
    } else {
        // Crear un nuevo objeto de Turismo con los datos ingresados
        Turismo nuevoTurismo = new Turismo();
        nuevoTurismo.setMarca(tfmarca.getText());
        nuevoTurismo.setModelo(tfmodelo.getText());
        nuevoTurismo.setModelo(tfpotencia.getText());
        nuevoTurismo.setModelo(tfkm.getText());
        nuevoTurismo.setModelo(tfano.getText());
        nuevoTurismo.setModelo(tfmedidas.getText());
        nuevoTurismo.setModelo(tfprecio.getText());
        

        // Agregar el nuevo objeto de Turismo a la lista de vehículos
        vehiculosListView.getItems().add(nuevoTurismo);
    }
}
    //Metodo para agregar Moto
    private void agregarMoto() {
        
    }


}
