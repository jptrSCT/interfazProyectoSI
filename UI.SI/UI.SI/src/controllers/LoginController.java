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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
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
	private Label lbPass;

	@ FXML
	private Label lbUser;

	@ FXML
	private Label lblInfo;

	@ FXML
	private Button btini;

	@ FXML
	private Text txtIni;

	@ FXML
	private Rectangle rec;

	// private MainSI main;

	Tools t = new Tools();

	@ FXML
	void iniciarSesion ( ActionEvent e )
	{
		// login();
		if ( login() == 1 )
		{
			t.switchScene(e, "/view/AdministradorView.fxml", "/css/application.css");
		}

		if ( login() == 2 )
		{
			t.switchScene(e, "/view/ClientesView.fxml", "/css/application.css");
		}
	}

	private int login ()
	{
		String user = tfUsuario.getText();
		String password = pfPass.getText();
		if ( user.isEmpty() || password.isEmpty() )
		{
			lblInfo.setText("¡Campos vacíos!");
			tfUsuario.setStyle("-fx-border-color: red");
			pfPass.setStyle("-fx-border-color: red");

		} else
		{
			if ( user.equals("Admin") && password.equals("12345") )
			{
				return 1;

			} else if ( user.equals("Cliente") && password.equals("12345") )
			{
				return 2;

			} else
			{
				lblInfo.setText("¡Datos Incorrectos!");
				tfUsuario.setStyle("-fx-border-color: red");
				pfPass.setStyle("-fx-border-color: red");
			}
		}
		return 0;
	}

	@ Override
	public void initialize ( URL arg0, ResourceBundle arg1 )
	{
		hide(0);
		imgSetting();
	}

	@ FXML
	void ini ( ActionEvent event )
	{
		hide(100);
		btini.setOpacity(0);
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

	private void hide ( int i )
	{
		rec.setOpacity(i);
		lbUser.setOpacity(i);
		lbPass.setOpacity(i);
		txtIni.setOpacity(i);
		tfUsuario.setOpacity(i);
		pfPass.setOpacity(i);
		btIniciar.setOpacity(i);
		lPassFgn.setOpacity(i);
	}

}
