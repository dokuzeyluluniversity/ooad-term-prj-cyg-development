package sample.products;

import sample.company.Manufacturer;

public class OtherProducts extends Item {
    private String categoryName;

    public OtherProducts(String brand, String name, double price, int itemID,
                         Manufacturer manufacturer, String categoryName) {
        super(brand, name, price, itemID, manufacturer);
        this.categoryName = categoryName;
    }
}