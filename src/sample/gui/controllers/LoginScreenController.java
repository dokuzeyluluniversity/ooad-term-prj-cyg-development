package sample.gui.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginScreenController implements Initializable {

    private HashMap<String,String> accounts = new HashMap<>();
    @FXML
    private JFXTextField txtUsername;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXButton btnSignIn;

    @FXML
    private JFXButton btnCloseImg;

    @FXML
    private JFXButton btnRestoreImg;

    @FXML
    private JFXButton btnMinimizeImg;

    public static String currentUser;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setPasswords();
    }

    public void handleButtonAction(ActionEvent event) {
        Object eventSource = event.getSource();
        if (eventSource == btnCloseImg) {
            Stage s = (Stage) ((Node) eventSource).getScene().getWindow();
            s.close();
        } else if (eventSource == btnRestoreImg) {
            Stage s = (Stage) ((Node) eventSource).getScene().getWindow();
            s.setFullScreen(!s.isFullScreen());
        } else if (eventSource == btnMinimizeImg) {
            Stage s = (Stage) ((Node) eventSource).getScene().getWindow();
            s.setIconified(true);
        }
    }

    public void login(ActionEvent event) {
        Object eventSource = event.getSource();
        if (eventSource == btnSignIn) {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            currentUser = username;

            changeScene("../fxmls/homeScreen.fxml");

            /*if (username.length() > 0 && accounts.get(username) != null && accounts.get(username).equals(password)) {
                System.out.println("Giriş başarılı");
                pnlHome.toFront();
            } else
                System.out.println("şifre yanlış");*/
        }
    }
    private void changeScene(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Scene scene = new Scene(root, 1280, 720);
            Main.appStage.setScene(scene);
        } catch (IOException e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
        }
    }
    public void setPasswords() {
        accounts.put("oktay", "1212");
        accounts.put("goksel", "1326");
        accounts.put("berhan", "01adana01");
        accounts.put("taylan", "2121");
    }


}
