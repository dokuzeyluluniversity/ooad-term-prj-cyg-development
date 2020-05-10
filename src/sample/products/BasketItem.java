package sample.products;


public class BasketItem {
    private int itemID;
    private String name;
    private int quantity;
    private double price;
    private double total;

    public BasketItem(int itemID, String name, int quantity, double price, double total) {
        this.itemID = itemID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
