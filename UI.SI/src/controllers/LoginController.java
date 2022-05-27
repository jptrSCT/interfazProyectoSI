package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import utilities.Tools;

public class LoginController implements Initializable
{

	@ FXML
	private AnchorPane anchor;

	@ FXML
	private Button btIniciar;

	@ FXML
	private ImageView img;

	@ FXML
	private ImageView img_2;

	@ FXML
	private Hyperlink lPassFgn;

	@ FXML
	private Hyperlink llink;

	@ FXML
	private TextField tfUsuario;

	@ FXML
	private PasswordField pfPass;

	@ FXML
	private Label lbMensaje;

	@ FXML
	private Label lbPass;

	Tools t = new Tools();

	@ FXML
	void iniciarSesion ( ActionEvent e )
	{
		t.switchScene(e, "/view/AdministradorView.fxml", "/css/application.css");
	}

	@ Override
	public void initialize ( URL arg0, ResourceBundle arg1 )
	{
		imgSetting();
	}

	private void imgSetting ()
	{
		img.setImage(t.cargarImagen("/rsc/argos_logo_blanco.png"));
		img_2.setImage(t.cargarImagen("/rsc/backg_.jpg"));

		// img_2.setTranslateX(250);
		img_2.setTranslateY(-35);
		img_2.setScaleX(3.5);
		img_2.setScaleY(3.5);
		img_2.setX((anchor.getPrefWidth() / 2) - 145);

	}
}
