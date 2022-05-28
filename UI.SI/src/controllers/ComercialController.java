package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ComercialController extends Controller
{

	@ FXML
	void actualizar ( ActionEvent e )
	{
		t.switchScene(e, "/view/ComercialView.fxml", "/css/application.css");
	}
}
