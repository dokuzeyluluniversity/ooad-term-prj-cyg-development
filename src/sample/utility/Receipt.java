package sample.utility;

import sample.company.Employee;
import sample.products.Item;

import java.util.List;

public class Receipt {
    private Date date;
    private double totalPrice;
    private Employee cashier;
    private List<Item> cart;
    private int receiptID;

    public Receipt(Date date, double totalPrice, Employee cashier, List<Item> cart, int receiptID) {
        this.date = date;
        this.totalPrice = totalPrice;
        this.cashier = cashier;
        this.cart = cart;
        this.receiptID = receiptID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Employee getCashier() {
        return cashier;
    }

    public void setCashier(Employee cashier) {
        this.cashier = cashier;
    }

    public List<Item> getCart() {
        return cart;
    }

    public void setCart(List<Item> cart) {
        this.cart = cart;
    }

    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }
}
