package lk.ijse.dep11;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane splashRoot = FXMLLoader.load(getClass().getResource("/view/Splash.fxml"));
        Scene splashScene = new Scene(splashRoot);
        primaryStage.setScene(splashScene);
        primaryStage.setTitle("Splash Screen");

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        splashRoot.setBackground(Background.fill(Color.TRANSPARENT));
        splashScene.setFill(Color.TRANSPARENT);

        primaryStage.centerOnScreen();
        primaryStage.show();

        // Pause for 2 seconds (adjust duration as needed)
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(event -> {
            try {
                // Load SimpleTextEditor screen
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SimpleTextEditor.fxml"));
                AnchorPane editorRoot = loader.load();
                Scene editorScene = new Scene(editorRoot);

                // Get the controller from the loader
                SimpleTextEditorController controller = loader.getController();

                // Initialize the controller if needed
                // controller.initialize();

                Stage editorStage = new Stage();
                editorStage.setScene(editorScene);
                editorStage.setTitle("Simple Text Editor");

                // Set stage properties for the editor
                editorStage.initStyle(StageStyle.DECORATED);

                // Show the editor stage
                editorStage.show();

                // Close the splash stage
                primaryStage.close();


            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        pause.play();


    }

}
