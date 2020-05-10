package sample.gui.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeScreenController implements Initializable {

    @FXML
    private JFXButton btnSale;
    @FXML
    private JFXButton btnReports;
    @FXML
    private JFXButton btnCompany;
    @FXML
    private JFXButton btnProduct;
    @FXML
    private JFXButton btnCloseImg;
    @FXML
    private JFXButton btnRestoreImg;
    @FXML
    private JFXButton btnMinimizeImg;
    @FXML
    private AnchorPane pnlSaleScreen;
    @FXML
    private AnchorPane pnlCompanyScreen;
    @FXML
    private AnchorPane pnlReportsScreen;
    @FXML
    private AnchorPane pnlProductScreen;

    @FXML
    private MenuButton menuBtnUser;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        menuBtnUser.setText(LoginScreenController.currentUser);

    }

    public void handleButtonAction(ActionEvent event) {
        Object eventSource = event.getSource();
        if (eventSource == btnSale) {
            pnlSaleScreen.toFront();
        } else if (eventSource == btnCompany) {
            pnlCompanyScreen.toFront();
        } else if (eventSource == btnReports) {
            pnlReportsScreen.toFront();

        } else if (eventSource == btnProduct) {
            pnlProductScreen.toFront();

        } else if (eventSource == btnCloseImg) {
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
}
