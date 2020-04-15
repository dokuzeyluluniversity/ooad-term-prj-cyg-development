package sample.products.electronics;

import sample.company.Manufacturer;

public class Television extends Electronics {
    private boolean smart;

    public Television(String brand, String name, double price, int itemID, Manufacturer manufacturer,
                      double size, String resolution, boolean smart) {
        super(brand, name, price, itemID, manufacturer, size, resolution);
        this.smart = smart;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Television{" +
                "smart=" + smart +
                '}' + super.toString();
    }
}
