package sample.company;

import sample.utility.Address;
import sample.utility.Position;

public class Employee {

    private String name;
    private Address address;
    private int phoneNumber;
    private int weeklyWorkHours;
    private Position position;
    private int shopID;
    private int employeeID;
    private String password;
    private int weeklyWageBonus;

    // TODO String Position yolla İçeride Position oluştur
    public Employee(String name, Address address, int phoneNumber, int weeklyWorkHours,
                    Position position, int shopID, int employeeID, String password, int weeklyWageBonus) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.weeklyWorkHours = weeklyWorkHours;
        this.position = position;
        this.shopID = shopID;
        this.employeeID = employeeID;
        this.password = password;
        this.weeklyWageBonus = weeklyWageBonus;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getWeeklyWorkHours() {
        return weeklyWorkHours;
    }

    public void setWeeklyWorkHours(int weeklyWorkHours) {
        this.weeklyWorkHours = weeklyWorkHours;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getWeeklyWageBonus() {
        return weeklyWageBonus;
    }

    public void setWeeklyWageBonus(int weeklyWageBonus) {
        this.weeklyWageBonus = weeklyWageBonus;
    }
}
