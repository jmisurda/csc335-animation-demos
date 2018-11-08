import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTranslationDemo extends Application {
	private Circle circle = new Circle(0, 150, 20, Color.RED);
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
	    Path path = new Path();
	    path.getElements().add(new MoveTo(50, 50));
	    path.getElements().add(new LineTo(300, 50));
	    path.getElements().add(new LineTo(300, 100));
	    path.getElements().add(new LineTo(250, 100));
	    
	    PathTransition pathTransition = new PathTransition();
	    pathTransition.setDuration(Duration.millis(5000));
	    pathTransition.setNode(circle); // Circle is built above
	    pathTransition.setPath(path);
	    pathTransition.play();

	    Group root = new Group(circle);
	    Scene scene = new Scene(root, 600, 300);
		stage.setScene(scene);
		stage.setTitle("Path Translation Demo");
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
