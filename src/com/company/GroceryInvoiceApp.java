package com.company;

public class GroceryInvoiceApp {

    private String item;
    private double price;
    private int quantity;

    public GroceryInvoiceApp() {
    }

    public GroceryInvoiceApp(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost(){
        double cost = price * quantity;

        return cost;
    }
}
