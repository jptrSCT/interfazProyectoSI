package controllers;

import java.net.URL;

import java.util.ResourceBundle;

import application.MainSI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import utilities.Tools;

public class LoginController implements Initializable {

	@FXML
	private AnchorPane anchor;

	@FXML
	private Button btIniciar;

	@FXML
	private ImageView img;

	@FXML
	private ImageView img_2;

	@FXML
	private Hyperlink lPassFgn;

	@FXML
	private Hyperlink llink;

	@FXML
	private TextField tfUsuario;

	@FXML
	private PasswordField pfPass;

	@FXML
	private Label lbMensaje;

	@FXML
	private Label lbPass;

//	private MainSI main;

	Tools t = new Tools();

	@FXML
	void iniciarSesion(ActionEvent e) {
		// login();
		if (login() == 1) {
			t.switchScene(e, "/view/AdministradorView.fxml", "/css/application.css");
		}

		if (login() == 2) {
			t.switchScene(e, "/view/ClientesView.fxml", "/css/application.css");
		}
	}

	private int login() {
		String user = tfUsuario.getText();
		String password = pfPass.getText();
		if (user.isEmpty() || password.isEmpty()) {
			showMessage("Notificacion.", "Algun espacio esta vacio.", "Por favor ingrese algo en los capos.",
					AlertType.ERROR);
		} else {
			if (user.equals("Admin") && password.equals("12345")) {
				showMessage("Notificacion", "Bienvenido Admin.", "Sea bienvenido Administrador.",
						AlertType.INFORMATION);
				return 1;
			} else {
				if (user.equals("Cliente") && password.equals("12345")) {

					showMessage("Notificacion", "Bienvenido Cliente.", "Sea bienvenido Cliente.",
							AlertType.INFORMATION);
					return 2;
				} else {
					showMessage("Notificacion", "Datos incorrectos",
							"No se ha encontrado un usuario con esa informacion.", AlertType.ERROR);
				}
			}
		}
		return 0;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		imgSetting();
	}

	private void imgSetting() {
		img.setImage(t.cargarImagen("/rsc/argos_logo_blanco.png"));
		img_2.setImage(t.cargarImagen("/rsc/backg_.jpg"));

		// img_2.setTranslateX(250);
		img_2.setTranslateY(-35);
		img_2.setScaleX(3.5);
		img_2.setScaleY(3.5);
		img_2.setX((anchor.getPrefWidth() / 2) - 145);

	}

	private void showMessage(String titulo, String header, String contenido, AlertType tipoAlerta) {

		Alert alert = new Alert(tipoAlerta);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(contenido);
		alert.showAndWait();

	}

}
