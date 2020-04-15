package sample.company;

import sample.Interfaces.InventoryManager;
import sample.Interfaces.StaffManager;
import sample.products.Item;
import sample.utility.Address;

import java.util.ArrayList;

public class Shop implements StaffManager, InventoryManager {
    private ArrayList<Employee> employees;
    private ArrayList<Item> products;
    private int phoneNumber;
    private String emailAddress;
    private Address address;
    private static int _ShopID = 1;
    private int shopID;


    public Shop(int phoneNumber, String emailAddress, Address address) {
        this.shopID = _ShopID++;
        this.employees = new ArrayList<>();
        this.products = new ArrayList<>();
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public static int get_ShopID() {
        return _ShopID;
    }

    public static void set_ShopID(int _ShopID) {
        Shop._ShopID = _ShopID;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public ArrayList<Item> getProducts() {
        return products;
    }


    public void setProducts(ArrayList<Item> products) {
        this.products = products;
    }


    public ArrayList<Employee> getEmployees() {
        return employees;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }


    public String getEmailAddress() {
        return emailAddress;
    }


    public Address getAddress() {
        return address;
    }


    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public void addEmployee​(Employee employee) {

    }

    @Override
    public void removeEmployee​(Employee employee) {

    }

    @Override
    public void editEmployee​(Employee employee) {

    }

    @Override
    public Employee searchEmployee​(int employeeID) {
        return null;
    }

    @Override
    public void addItemToShop(Item item, Shop shopToAdd, int quantity) {

    }

    @Override
    public void removeItemFromShop(Item item, Shop shopToAdd, int quantity) {

    }

    @Override
    public void addNewItem(Item item) {

    }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public void transferBetweenBranches(Shop originShop, Shop destinationShop, Item transferredItem, int quantity) {

    }

    @Override
    public void orderItem(Item item, int quantity) {

    }

    @Override
    public Item searchItem(int ItemID) {
        return null;
    }
}
