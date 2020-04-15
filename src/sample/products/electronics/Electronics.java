package sample.products.electronics;

import sample.products.Item;
import sample.company.Manufacturer;

public class Electronics extends Item {
    private double size;
    private String resolution;

    public Electronics(String brand, String name, double price, int itemID,
                       Manufacturer manufacturer, double size, String resolution) {
        super(brand, name, price, itemID, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "size=" + size +
                ", resolution='" + resolution + '\'' +
                '}' + super.toString();
    }
}
