package sample.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.products.Item;
import sample.products.electronics.Television;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SaleScreenController implements Initializable {

    @FXML
    private TextField txtAdd;

    @FXML
    private Button btnAdd;

    @FXML
    private TextArea txtTest;

    List<Item> itemList = new ArrayList<>();


    @FXML
    void btnAdd(ActionEvent event) {
        String id = txtAdd.getText();

        // Testing
        Television tv1 = new Television("1", "tv1", 5, 1, null,
            1, "1", true);
        Television tv2 = new Television("2", "tv2", 5, 2, null,
            2, "2", true);
        itemList.add(tv1);
        itemList.add(tv2);
        String item = search(Integer.parseInt(id));
        txtTest.setText(item);


    }

    public String search(int id) {
        String item = "Item not found";
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getItemID() == id) {
                item = "";
                item = itemList.get(i).toString();
            }
        }
        return item;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
