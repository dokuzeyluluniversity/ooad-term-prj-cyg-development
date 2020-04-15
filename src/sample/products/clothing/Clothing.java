package sample.products.clothing;

import sample.products.Item;
import sample.company.Manufacturer;

public class Clothing extends Item {
    private String color;
    private String gender;
    public Clothing(String brand, String name, double price, int itemID,
                    Manufacturer manufacturer, String color, String gender) {
        super(brand, name, price, itemID, manufacturer);
        this.color = color;
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
