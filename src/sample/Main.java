package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
    private double xOffSet = 0;
    private double yOffSet = 0;
    public static Stage appStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
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

        // TODO bunu çalıştır outputa bak, öyle bir ayarlaki şu electronics item yazmasın tüm parametreler
        // TODO güzel bir şekilde display edilsin. Bunu yeni eklediğimiz her class için yap.
    }


    public static void main(String[] args) {
        launch(args);
    }
}
