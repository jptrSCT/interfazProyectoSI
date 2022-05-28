package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class FinancieraController extends Controller
{

	@ FXML
	void actualizar ( ActionEvent event )
	{
		t.switchScene(event, "/view/FinancieraView.fxml", "/css/application.css");
	}

}
