package controllers;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
import utilities.Animations;
import utilities.Load;

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
	
    @FXML
    private Hyperlink linkArgos;

	// private MainSI main;

	Load t = new Load();

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
	
	 @FXML
	    void abrirArgosPage(ActionEvent event) throws URISyntaxException, IOException {
		 	Desktop.getDesktop().browse(new URI("https://argos.co"));
	    }

	private int login ()
	{
		String user = tfUsuario.getText();
		String password = pfPass.getText();
		if ( user.isEmpty() || password.isEmpty() )
		{
			lblInfo.setText("!Campos vacios!");
			lblInfo.setStyle("-fx-text-fill: black;");
			tfUsuario.setStyle("-fx-border-color: red");
			pfPass.setStyle("-fx-border-color: red");
			Animations.shakeAnimation(lblInfo);
			Animations.shakeAnimation(tfUsuario);
			Animations.shakeAnimation(pfPass);

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
				lblInfo.setText("Datos Incorrectos!");
				lblInfo.setStyle("-fx-text-fill: black;");
				tfUsuario.setStyle("-fx-border-color: red");
				pfPass.setStyle("-fx-border-color: red");
				Animations.shakeAnimation(lblInfo);
			}
		}
		return 0;
	}

	@ Override
	public void initialize ( URL arg0, ResourceBundle arg1 )
	{
		hide();
		imgSetting();
	}

	@ FXML
	void ini ( ActionEvent event )
	{
		// hide(100);
		btini.setOpacity(0);
		Animations.fadeAnimationIn(rec);
		Animations.fadeAnimationIn(lbUser);
		Animations.fadeAnimationIn(lbPass);
		Animations.fadeAnimationIn(tfUsuario);
		Animations.fadeAnimationIn(pfPass);
		Animations.fadeAnimationIn(btIniciar);
		Animations.fadeAnimationIn(lPassFgn);
		Animations.fadeAnimationIn(txtIni);
		btini.setDisable(true);
	}

	private void imgSetting ()
	{
		img.setImage(t.cargarImagen("/rsc/argos_logo_blanco.png"));
		img_2.setImage(t.cargarImagen("/rsc/backg_.jpg"));
		// img_2.setTranslateX(250);
		img_2.setTranslateY(-35);
		img_2.setScaleX(3.5);
		img_2.setScaleY(3.5);
		img_2.setOpacity(0.9);
		img_2.setX((anchor.getPrefWidth() / 2) - 145);

	}

	private void hide ()
	{
		rec.setOpacity(0);
		lbUser.setOpacity(0);
		lbPass.setOpacity(0);
		txtIni.setOpacity(0);
		tfUsuario.setOpacity(0);
		pfPass.setOpacity(0);
		btIniciar.setOpacity(0);
		lPassFgn.setOpacity(0);
	}

}
