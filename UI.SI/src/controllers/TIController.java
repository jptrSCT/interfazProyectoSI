package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TIController extends Controller
{

	@ FXML
	void actualizar ( ActionEvent e )
	{
		t.switchScene(e, "/view/TIView.fxml", "/css/application.css");
	}
}
