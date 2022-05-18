package com.example.akfood1.models;

public class Dishes {
    private int dish_id;
    private String name;
    private double price;
    private String type;

    public int getDish_id() {
        return dish_id;
    }
    public void setDish_id(int dish_id) {
        this.dish_id = dish_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dishes() {
    }

    public Dishes(int dish_id, String name, double price, String type) {
        this.dish_id = dish_id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\n\ndish_id: " + dish_id +
                "\nname: " + name +
                "\nprice: " + price +
                "\ntype: " + type;
    }
}
