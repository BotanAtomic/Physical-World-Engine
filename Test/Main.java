import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.apollon.core.World;
import org.apollon.object.Circle;

public class Main extends Application {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;


    private final World world = World.new2D(WIDTH, HEIGHT);


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        world.setOutEventHandler(entity -> {
            System.err.println(entity.getName() + " : OUT");
        });

        world.addEntity(new Circle(WIDTH / 2, HEIGHT / 2, 1, 20));

        Pane root = new Pane();

        ImageView imageView = new ImageView();

        imageView.setFitHeight(WIDTH);
        imageView.setFitWidth(HEIGHT);

        imageView.setLayoutX(0);
        imageView.setLayoutY(0);

        root.getChildren().add(imageView);

        Scene scene = new Scene(root);

        primaryStage.setTitle("PWE");
        primaryStage.setScene(scene);
        primaryStage.show();

        imageView.setImage(SwingFXUtils.toFXImage(world.preview(), null));
    }
}
