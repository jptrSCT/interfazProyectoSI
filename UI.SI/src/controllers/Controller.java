package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import utilities.Animations;
import utilities.Load;

public abstract class Controller implements Initializable

{

	@ FXML
	protected AnchorPane anchorPane;

	protected Load t = new Load();

	@ FXML
	void volver ( ActionEvent event )
	{
		t.switchScene(event, "/view/AdministradorView.fxml", "/css/application.css");
	}

	@ FXML
	void actualizar ( ActionEvent event )
	{
		// t.switchScene(event, "/view/CRMView.fxml", "/css/application.css");
	}

	@ Override
	public void initialize ( URL arg0, ResourceBundle arg1 )
	{
		Animations.fadeAnimationIn(anchorPane);
	}
}
