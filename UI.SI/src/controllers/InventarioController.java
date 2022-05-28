package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class InventarioController extends Controller
{

	@ FXML
	void actualizar ( ActionEvent e )
	{
		t.switchScene(e, "/view/InventarioView.fxml", "/css/application.css");
	}
}
