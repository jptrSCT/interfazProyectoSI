package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CRMController extends Controller
{

	@ FXML
	void actualizar ( ActionEvent event )
	{
		t.switchScene(event, "/view/CRMView.fxml", "/css/application.css");
	}

}
