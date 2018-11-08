import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TranslationDemo extends Application {

	private Circle circle = new Circle(0, 150, 20, Color.RED);
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		TranslateTransition translateTransition = new TranslateTransition(); 
		translateTransition.setDuration(Duration.millis(2000)); 
		translateTransition.setNode(circle); 
		translateTransition.setByX(400); 
		translateTransition.setCycleCount(5); 
		translateTransition.setAutoReverse(true); 
		translateTransition.play();   
		// A Group object has no layout of children easier to use here
		Group root = new Group(circle);
		Scene scene = new Scene(root, 600, 300);
		stage.setScene(scene);
		stage.setTitle("Translation Demo");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
