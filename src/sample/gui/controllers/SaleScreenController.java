package sample.gui.controllers;

import animatefx.animation.Shake;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.products.BasketItem;
import sample.products.Item;
import sample.products.electronics.Television;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SaleScreenController implements Initializable {

    List<Item> itemList = new ArrayList<>();
    @FXML
    private TextField txtAdd;
    @FXML
    private Button btnAdd;
    @FXML
    private TableView<BasketItem> tableBasket;
    private TableColumn idCol = new TableColumn("ID");
    private TableColumn nameCol = new TableColumn("NAME");
    private TableColumn quantityCol = new TableColumn("QUANTITY");
    private TableColumn priceCol = new TableColumn("PRICE");
    private TableColumn totalCol = new TableColumn("TOTAL");
    @FXML
    private TextArea txtTest;
    private ObservableList<BasketItem> basket = FXCollections.observableArrayList();

    @FXML
    void btnAdd(ActionEvent event) {
        if (!txtAdd.getText().isEmpty()) {


            String id = txtAdd.getText();
            txtAdd.clear();
            Item item = search(Integer.parseInt(id));

            if (item != null) {


                if (containsName(basket, Integer.parseInt(id)))
                    // TODO aynı eleman gelince buluyor, quantity ve totali değiştir.
                    System.out.println("Aynı elemanı koyuyoruz quantity artacak sadece");
                else
                    basket.add(new BasketItem(item.getItemID(), item.getName(), 1, item.getPrice(), item.getPrice()));
                txtTest.setText(item.getName());
            } else
                System.out.println("Item not found!!");
        } else
            new Shake(txtAdd).play();

    }

    public boolean containsName(final ObservableList<BasketItem> list, final int itemID) {
        return list.stream().anyMatch(o -> o.getItemID() == itemID);
    }

    public Item search(int id) {
        Item item = null;
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getItemID() == id) {
                item = itemList.get(i);
            }
        }
        return item;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Testing
        Television tv1 = new Television("1", "tv1", 5, null,
            1, "1", true);
        Television tv2 = new Television("2", "tv2", 5, null,
            2, "2", true);
        itemList.add(tv1);
        itemList.add(tv2);
        Item item = search(Integer.parseInt("1"));
        txtTest.setText(item.getName());
        basket.add(new BasketItem(item.getItemID(), item.getName(), 1, item.getPrice(), item.getPrice()));
        Item item2 = search(Integer.parseInt("2"));
        txtTest.setText(item.getName());
        basket.add(new BasketItem(item2.getItemID(), item2.getName(), 1, item2.getPrice(), item2.getPrice()));

        idCol.setCellValueFactory(
            new PropertyValueFactory<BasketItem,Integer>("itemID"));

        nameCol.setCellValueFactory(
            new PropertyValueFactory<BasketItem,String>("name"));

        quantityCol.setCellValueFactory(
            new PropertyValueFactory<BasketItem,Integer>("quantity"));
        priceCol.setCellValueFactory(
            new PropertyValueFactory<BasketItem,Double>("price"));

        totalCol.setCellValueFactory(
            new PropertyValueFactory<BasketItem,Double>("total"));

        tableBasket.setItems(basket);
        tableBasket.getColumns().addAll(idCol, nameCol, quantityCol, priceCol, totalCol);
    }

}
