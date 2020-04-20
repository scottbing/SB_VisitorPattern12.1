package com.company;

public class Liquor implements Visitable {
    private double price;
    private String description = "AVAILABLE";

    public Liquor (double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}