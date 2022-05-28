package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.ImageView;
import utilities.Animations;
import utilities.Load;

public class AdminController implements Initializable
{

	@ FXML
	private ImageView img;

	@ FXML
	private ImageView img_1;

	Load t = new Load();

	@ FXML
	void actualizarEscena ( ActionEvent e )
	{
		t.switchScene(e, "/view/AdministradorView.fxml", "/css/application.css");
	}

	@ FXML
	void Produccion ( ActionEvent event )
	{
		Animations.shakeAnimation(img);
		t.switchScene(event, "/view/ProduccionView.fxml", "/css/application.css");
	}

	@ FXML
	void administracion ( ActionEvent event )
	{
		Animations.shakeAnimation(img);
		t.switchScene(event, "/view/AdministracionView.fxml", "/css/application.css");
	}

	@ FXML
	void comercial ( ActionEvent event )
	{
		Animations.shakeAnimation(img);
		t.switchScene(event, "/view/ComercialView.fxml", "/css/application.css");
	}

	@ FXML
	void crm ( ActionEvent event )
	{
		Animations.shakeAnimation(img);
		t.switchScene(event, "/view/CRMView.fxml", "/css/application.css");
	}

	@ FXML
	void financiacion ( ActionEvent event )
	{
		Animations.shakeAnimation(img);
		t.switchScene(event, "/view/FinancieraView.fxml", "/css/application.css");
	}

	@ FXML
	void inventario ( ActionEvent event )
	{
		Animations.shakeAnimation(img);
		t.switchScene(event, "/view/InventarioView.fxml", "/css/application.css");
	}

	@ FXML
	void recursosHumanos ( ActionEvent event )
	{
		Animations.shakeAnimation(img);
		t.switchScene(event, "/view/RecursosHumanosView.fxml", "/css/application.css");
	}

	@ FXML
	void ti ( ActionEvent event )
	{
		Animations.shakeAnimation(img);
		t.switchScene(event, "/view/TIView.fxml", "/css/application.css");
	}

	@ FXML
	void cerrar ( ActionEvent event )
	{
		t.switchScene(event, "/view/LoginView.fxml", "/css/application.css");
	}

	@ Override
	public void initialize ( URL arg0, ResourceBundle arg1 )
	{
		imgSetting();
		animations();
	}

	private void imgSetting ()
	{

		img.setImage(t.cargarImagen("/rsc/backg_1.jpg"));
		img_1.setImage(t.cargarImagen("/rsc/argos_logo_blanco.png"));
		img.setTranslateX(150);
		img.setTranslateY(250);
		// img.setOpacity(0.25);
		img.blendModeProperty().set(BlendMode.DARKEN);
		img.setScaleX(8);
		img.setScaleY(8);
		// img_1.setX((anchor.getPrefWidth() / 2) - 145);
	}

	private void animations ()
	{
		Animations.fadeAnimationIn(img, 0, 0.25);
	}
}
