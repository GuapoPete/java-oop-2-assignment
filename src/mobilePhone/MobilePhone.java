package mobilePhone;

public class MobilePhone {
    // Instance variables
    private String brand;
    private String model;
    private String phoneNumber;
    private int storageCapacity;

    // Constructor
    public MobilePhone(String brand, String model, String phoneNumber, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.storageCapacity = storageCapacity;
    }

    // Getter and setter methods for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and setter methods for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter methods for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter methods for storageCapacity
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // Custom phone-related methods
    public void makeCall(String phoneNumber) {
        System.out.println("We are calling " + phoneNumber + " from our " + brand + " " + model + " phone!");
    }

    public void installApp(String appName) {
        System.out.println("Installing " + appName + " on our " + brand + " " + model + " phone!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }


}
