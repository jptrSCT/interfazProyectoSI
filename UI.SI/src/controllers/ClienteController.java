package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import utilities.Load;

public class ClienteController {
	
	@FXML
    private Button clienteCRMbtn;
	
	Load t = new Load();
	
	  @FXML
	    void actualizarEscenaCliente(ActionEvent e) {
			t.switchScene(e, "/view/ClientesView.fxml", "/css/application.css");
	    }

    @FXML
    void clienteOpenCRM(ActionEvent event) {

    }
    
    @FXML
    void cerrarCliente(ActionEvent event) {
		t.switchScene(event, "/view/LoginView.fxml", "/css/application.css");
    }

}
