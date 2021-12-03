package com.company;

public class Product {
    private String code;
    private String name;
    private String description;
    private int quantity;
    private double price;
    private String type;


    public Product(String code, String name, String description, int quantity, Double price, String type) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\t" + "Code: " + code + "\t"+ "Name: " +name + "\t"+  "Quantity: "+ quantity +"\t"+ "Price: " + price + "\t"+"Type: " + type + "\t"+ "Description: " + description + "\n";
    }

}


