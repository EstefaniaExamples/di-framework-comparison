package org.cdi.example.model;

public class Car {
    private String brand;
    private String model;
    private String colour;
    private String serialNumber;

    public Car() {
    }

    public Car(final String brand, final String model, final String colour) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
