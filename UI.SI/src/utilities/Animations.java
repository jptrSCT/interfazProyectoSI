package utilities;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Animations
{

	public static void fadeAnimationIn ( Node node )
	{
		FadeTransition fade = new FadeTransition();
		fade.setNode(node);
		// fade.setAutoReverse(true);
		fade.setDuration(Duration.millis(1000));
		// fade.setCycleCount(TranslateTransition.INDEFINITE);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
	}

	public static void fadeAnimationIn ( Node node, double from, double to )
	{
		FadeTransition fade = new FadeTransition();
		fade.setNode(node);
		// fade.setAutoReverse(true);
		fade.setDuration(Duration.millis(1000));
		// fade.setCycleCount(TranslateTransition.INDEFINITE);
		fade.setFromValue(from);
		fade.setToValue(to);
		fade.play();
	}

	public static void shakeAnimation ( Node node )
	{
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(node);
		translate.setDuration(Duration.millis(100));
		translate.setCycleCount(4);
		translate.setByX(6);
		translate.setByY(0);
		translate.setAutoReverse(true);
		translate.play();
	}
}
