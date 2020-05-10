package sample.gui.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.util.StringConverter;
import sample.company.Shop;
import sample.utility.Address;

import java.net.URL;
import java.util.ResourceBundle;

public class ReportsScreenController implements Initializable {

    public static int totalCam;
    public static int totalShops;
    private ObservableList<Shop> Shops = null;
    @FXML
    private ComboBox<Shop> cbShopList;
    @FXML
    private Text txtShops;
    @FXML
    private Text txtTotalIncome;
    @FXML
    private Text txtDays;
    @FXML
    private Text txtCname;
    @FXML
    private HBox lblShopInfo;
    @FXML
    private HBox lblCharts;
    @FXML
    private PieChart chartSale;
    @FXML
    private PieChart chartEmployee;
    @FXML
    private LineChart<?,?> chartTotalIncome;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();
        refreshData();
    }


    private void loadData() {
        // Add companies
        Shops = FXCollections.observableArrayList(
            new Shop(541, "Buca", new Address("İzmir", "Buca", "Dokuzçeşmeler")),
            new Shop(542, "Konak", new Address("İzmir", "Konak", "Alsancak")),
            new Shop(543, "Bornova", new Address("İzmir", "Bornova", "Metro"))
        );
        // Set Companies
        if (Shops != null) {
            cbShopList.setItems(Shops);  // set companies
        }

        cbShopList.setConverter(new StringConverter<Shop>() {
            @Override
            public String toString(Shop object) {
                return object.getEmailAddress();
            }

            @Override
            public Shop fromString(String string) {
                return null;
            }
        });

        cbShopList.valueProperty().addListener((obs, oldVal, newVal) -> {
            ////////  labels visiable
            lblShopInfo.setVisible(true);
            lblCharts.setVisible(true);

            /////////////// set infos
            txtCname.setText(newVal.getEmailAddress() + " INFOS:");
            txtShops.setText(String.valueOf(newVal.getShopID()));
            txtTotalIncome.setText(String.valueOf(newVal.getPhoneNumber()));
            txtDays.setText("100");

            ////////////// set graphs
            ObservableList<PieChart.Data> employeeData = FXCollections.observableArrayList(
                new PieChart.Data("Göksel", 50),
                new PieChart.Data("Oktay", 60),
                new PieChart.Data("Taylan", 20),
                new PieChart.Data("Berhan", 90)
            );
            ObservableList<PieChart.Data> incomeData = FXCollections.observableArrayList(
                new PieChart.Data("Television", 10),
                new PieChart.Data("Phone", 30),
                new PieChart.Data("Tshirt", 50),
                new PieChart.Data("Footwear", 80)
            );

            chartSale.setData(incomeData);
            chartEmployee.setData(employeeData);

            XYChart.Series series = new XYChart.Series();
            series.getData().add(new XYChart.Data("1", 23));
            series.getData().add(new XYChart.Data("2", 25));
            series.getData().add(new XYChart.Data("3", 43));
            series.getData().add(new XYChart.Data("4", 32));
            series.getData().add(new XYChart.Data("5", 52));
            series.getData().add(new XYChart.Data("6", 15));
            series.getData().add(new XYChart.Data("7", 64));
            chartTotalIncome.getData().addAll(series);

            //////////////////////////////

        });
    }

    private void refreshData() {
        totalShops = Shops.size();
        for (int i = 0; i < totalShops; i++) { //get total shops
            totalCam += Shops.get(i).getShopID();
        }


    }

}
