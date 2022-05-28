package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AdministracionController extends Controller
{

	@ FXML
	void actualizar ( ActionEvent e )
	{
		t.switchScene(e, "/view/AdministracionView.fxml", "/css/application.css");
	}
}
