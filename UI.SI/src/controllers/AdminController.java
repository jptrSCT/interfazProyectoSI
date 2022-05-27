package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import utilities.Tools;

public class AdminController implements Initializable
{

	@ FXML
	private ImageView img;

	Tools t = new Tools();

	@ FXML
	void actualizarEscena ( ActionEvent e )
	{
		t.switchScene(e, "/view/AdministradorView.fxml", "/css/application.css");
	}

	@ Override
	public void initialize ( URL arg0, ResourceBundle arg1 )
	{
		img.setImage(t.cargarImagen("/rsc/backg_1.jpg"));
	}

}
