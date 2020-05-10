package sample.company;

import sample.Interfaces.InventoryManager;
import sample.Interfaces.SalesManager;
import sample.products.BasketItem;
import sample.products.Item;
import sample.utility.Address;
import sample.utility.Receipt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;


public class Shop implements InventoryManager, SalesManager {
    private static int _ShopID = 1;
    private ArrayList<Employee> employeeList;
    private int phoneNumber;
    private String emailAddress;
    private Address address;
    private int shopID;
    private HashMap<Integer,Integer> itemQuantity; //<item id, quantity>
    private HashMap<Integer,Item> itemBag;
    private HashMap<Integer,Receipt> receiptHashMap;


    public Shop(int phoneNumber, String emailAddress, Address address) {
        this.shopID = _ShopID++;
        this.employeeList = new ArrayList<>();
        this.itemQuantity = new HashMap<>();
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.itemBag = new HashMap<>();
        this.receiptHashMap = new HashMap<>();

    }

    public static int get_ShopID() {
        return _ShopID;
    }

    public static void set_ShopID(int _ShopID) {
        Shop._ShopID = _ShopID;
    }

    public int getQuantityOfItem(int itemId) {
        return itemQuantity.get(itemId);
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public ArrayList<Employee> getEmployees() {
        return employeeList;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employeeList = employees;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HashMap<Integer,Receipt> getReceiptHashMap() {
        return receiptHashMap;
    }

    public void setReceiptHashMap(HashMap<Integer,Receipt> receiptHashMap) {
        this.receiptHashMap = receiptHashMap;
    }

    @Override
    public void updateItem(Item item, int updateQuantity) {
        itemQuantity.replace(item.getItemID(), itemQuantity.get(item.getItemID()) + updateQuantity);
    }

    @Override
    public void addNewItem(Item item, int quantity) {
        itemQuantity.put(item.getItemID(), quantity);
    }

    @Override
    public void transferItem(Shop destinationShop, Item transferredItem, int quantity) {
        //TODO -quantity changed with itemQuantity.get(transferredItem.getItemID())-quantity
        itemQuantity.replace(transferredItem.getItemID(), itemQuantity.get(transferredItem.getItemID()) - quantity);
        if (destinationShop.itemQuantity.get(transferredItem.getItemID()) == null) {
            destinationShop.addNewItem(transferredItem, quantity);
        } else {
            destinationShop.updateItem(transferredItem, quantity);
        }
    }

    @Override
    public Item searchItem(int itemID) {
        return itemBag.get(itemID);
    }


    //TODO this methods implements by oktay turkdagli
    @Override
    public void sellItem(ArrayList<BasketItem> items, Employee employee) {
        double totalPrice = 0;
        for (BasketItem item : items) {
            //TODO Will Report
            updateItem(itemBag.get(item.getItemID()), -item.getQuantity());
            totalPrice = totalPrice + item.getTotal();
        }

        generateReceipt(items, totalPrice, employee);
    }

    @Override
    public void generateReceipt(ArrayList<BasketItem> items, double totalPrice, Employee employee) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String date = formatter.format(System.currentTimeMillis());

        Receipt receipt = new Receipt(date, totalPrice, employee, items);
        receiptHashMap.put(receipt.getReceiptID(), receipt);
    }

    @Override
    public Receipt searchReceipt(int receiptID) {
        return receiptHashMap.get(receiptID);
    }

    @Override
    public void returnItem(Item item, int receiptID, int quantity, Employee employee) {
        Receipt receipt = searchReceipt(receiptID);
        ArrayList<BasketItem> cart = receipt.getCart();
        double totalPrice = receipt.getTotalPrice();

        updateItem(item, quantity);
        //Taken item id removed from cart
        cart.removeIf(itemID -> itemID.equals(item.getItemID()));

        receiptHashMap.remove(receiptID);
        generateReceipt(cart, totalPrice, employee);

    }
}
