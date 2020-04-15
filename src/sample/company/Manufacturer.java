package sample.company;

import sample.Interfaces.InventoryManager;
import sample.products.Item;
import sample.utility.Address;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer implements InventoryManager {
    private String name;
    private int manufacturerID;
    private Address address;
    private String phoneNumber;
    private List<Item> soldItemList;


    public Manufacturer(String name, int manufacturerID, Address address, String phoneNumber) {
        this.name = name;
        this.manufacturerID = manufacturerID;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.soldItemList = new ArrayList<>();
    }


    public void addItem(Item item) {
        soldItemList.add(item);
    }
   /* public void removeItem(Item item){
        soldItemList.remove(item);
    }*/


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getManufacturerID() {
        return manufacturerID;
    }


    public void setManufacturerID(int manufacturerID) {
        this.manufacturerID = manufacturerID;
    }


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public List<Item> getSoldItemList() {
        return soldItemList;
    }


    public void setSoldItemList(List<Item> soldItemList) {
        this.soldItemList = soldItemList;
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
