package utilities;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Load
{

	// Cambiar de escena, carga un nuevo documento fxml
	public void switchScene ( ActionEvent e, String fxml, String css )
	{
		try
		{
			Parent root;
			root = FXMLLoader.load(getClass().getResource(fxml));
			Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			String cssfile = getClass().getResource(css).toExternalForm();
			scene.getStylesheets().add(cssfile);
			stage.setScene(scene);
			stage.show();
		} catch ( IOException e1 )
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public Image cargarImagen ( String ruta )
	{
		return new Image(getClass().getResourceAsStream(ruta));
	}

}
