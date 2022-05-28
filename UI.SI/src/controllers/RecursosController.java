package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class RecursosController extends Controller

{

	@ FXML
	void actualizar ( ActionEvent event )
	{
		t.switchScene(event, "/view/RecursosHumanosView.fxml", "/css/application.css");
	}

}
