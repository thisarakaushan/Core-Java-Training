package com.highradius.product.management.entities;

public class Product {
    private int pId;
    private String pName;
    private int price;
    private String brand;

    // Constructor (optional)
    public Product(int pId, String pName, int price, String brand) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

    // Getters and setters
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Id = " + pId + ", Name = " + pName + ", Brand = " + brand + ", Price = " + price;
    }
}
