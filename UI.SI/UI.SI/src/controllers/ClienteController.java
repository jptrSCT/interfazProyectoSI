package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import utilities.Tools;

public class ClienteController {
	
	@FXML
    private Button clienteCRMbtn;
	
	Tools t = new Tools();
	
	  @FXML
	    void actualizarEscenaCliente(ActionEvent e) {
			t.switchScene(e, "/view/ClientesView.fxml", "/css/application.css");
	    }

    @FXML
    void clienteOpenCRM(ActionEvent event) {

    }

}
