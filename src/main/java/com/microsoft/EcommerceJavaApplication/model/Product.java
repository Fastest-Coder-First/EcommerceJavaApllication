package com.microsoft.EcommerceJavaApplication.model;

public class Product {
    
    //create field as id, name, category, quantity, price, description
    private int id;
    //add other fields
    private String name;
    private String category;
    private int quantity;
    private double price;
    private String description;
    //create constructor
    public Product(int id) {
        this.id = id;

    }


    @Override
    public String toString() {
        return "Product [category=" + category + ", description=" + description + ", id=" + id + ", name=" + name
                + ", price=" + price + ", quantity=" + quantity + "]";
    }
    //create getter and setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //add other getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //add other getter and setter
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    //add other getter and setter
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //add other getter and setter
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    //add other getter and setter
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
