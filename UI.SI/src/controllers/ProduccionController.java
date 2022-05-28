package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ProduccionController extends Controller
{

	@ FXML
	void actualizar ( ActionEvent event )
	{
		t.switchScene(event, "/view/ProduccionView.fxml", "/css/application.css");
	}

}
