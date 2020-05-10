package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
    public static Stage appStage;
    private double xOffSet = 0;
    private double yOffSet = 0;

    public static void main(String[] args) {


        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        appStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("gui/fxmls/loginScreen.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();

        // Movable GUI
        root.setOnMousePressed(event -> {
            xOffSet = event.getSceneX();
            yOffSet = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffSet);
            primaryStage.setY(event.getScreenY() - yOffSet);
        });

    }
}
