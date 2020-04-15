package sample.company;

import sample.Interfaces.ReportsManager;
import sample.Interfaces.StaffManager;
import sample.products.Item;
import sample.utility.Address;

import java.util.ArrayList;

public class Company implements ReportsManager,StaffManager {
    private ArrayList<Shop> shops;
    private ArrayList<Item> products;
    private int phoneNumber;
    private String emailAddress;
    private Address address;


    public Company(int phoneNumber, String emailAddress, Address address) {
        this.shops = new ArrayList<>();
        this.products = new ArrayList<>();
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public ArrayList<Item> getProducts() {
        return products;
    }


    public void setProducts(ArrayList<Item> products) {
        this.products = products;
    }

    public ArrayList<Shop> getShops() {
        return shops;
    }

    public void setShops(ArrayList<Shop> shops) {
        this.shops = shops;
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

    @Override
    public void displayReports(int chosenReport) {

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
}
