package sample.utility;

public class Address {
    private String city;
    private String town;
    private String street;

    public Address(String city, String town, String street) {
        this.city = city;
        this.town = town;
        this.street = street;
    }

    @Override
    public String toString() {
        return  "city: '" + city + '\'' +
                ", town: '" + town + '\'' +
                ", street: '" + street + '\'';
    }

}
