package sample.products.clothing;

import sample.company.Manufacturer;

public class Pants extends Clothing {
    private int sizeWidth;
    private int sizeLength;

    public Pants(String brand, String name, double price, int itemID, Manufacturer manufacturer,
                 String color, String gender, int sizeWidth, int sizeLength) {
        super(brand, name, price, itemID, manufacturer, color, gender);
        this.sizeWidth = sizeWidth;
        this.sizeLength = sizeLength;
    }

    public int getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(int sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public int getSizeLength() {
        return sizeLength;
    }

    public void setSizeLength(int sizeLength) {
        this.sizeLength = sizeLength;
    }
}
