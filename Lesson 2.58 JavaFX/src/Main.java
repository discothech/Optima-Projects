import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage){
        Text text = new Text("Hello! My name is Oleksandra.");
        text.setLayoutX(70);
        text.setLayoutY(100);
        Group group = new Group(text);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Task 1");
        stage.setWidth(300);
        stage.setHeight(300);
        stage.show();
    }
}