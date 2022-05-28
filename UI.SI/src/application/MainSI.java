package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainSI extends Application
{

	@ Override
	public void start ( Stage stage )
	{
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource("/view/LoginView.fxml"));

			Scene scene = new Scene(root, Color.PURPLE);

			String css = this.getClass().getResource("/css/application.css").toExternalForm();
			scene.getStylesheets().add(css);

			Image icon = new Image("/rsc/argos_logo.png");
			stage.getIcons().add(icon);
			stage.setTitle("Cementos Argos");
			stage.setScene(scene);
			stage.setResizable(false);

			stage.show();
		} catch ( IOException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main ( String[] args )
	{
		launch(args);
	}
}
