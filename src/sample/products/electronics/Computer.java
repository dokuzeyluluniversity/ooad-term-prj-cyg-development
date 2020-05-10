package sample.products.electronics;

import sample.company.Manufacturer;

public class Computer extends Electronics {
    private String processor;
    private String graphicsCard;
    private String graphicsCapacity;
    private String ramType;
    private String ramSpeed;
    private String ramCapacity;
    private String storage;


    public Computer(String brand, String name, double price, Manufacturer manufacturer,
                    double size, String resolution, String processor, String graphicsCard,
                    String graphicsCapacity, String ramType, String ramSpeed, String ramCapacity, String storage) {
        super(brand, name, price, manufacturer, size, resolution);
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.graphicsCapacity = graphicsCapacity;
        this.ramType = ramType;
        this.ramSpeed = ramSpeed;
        this.ramCapacity = ramCapacity;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }


    public void setProcessor(String processor) {
        this.processor = processor;
    }


    public String getGraphicsCard() {
        return graphicsCard;
    }


    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }


    public String getGraphicsCapacity() {
        return graphicsCapacity;
    }


    public void setGraphicsCapacity(String graphicsCapacity) {
        this.graphicsCapacity = graphicsCapacity;
    }


    public String getRamType() {
        return ramType;
    }


    public void setRamType(String ramType) {
        this.ramType = ramType;
    }


    public String getRamSpeed() {
        return ramSpeed;
    }


    public void setRamSpeed(String ramSpeed) {
        this.ramSpeed = ramSpeed;
    }


    public String getRamCapacity() {
        return ramCapacity;
    }


    public void setRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }


    public String getStorage() {
        return storage;
    }


    public void setStorage(String storage) {
        this.storage = storage;
    }
}
