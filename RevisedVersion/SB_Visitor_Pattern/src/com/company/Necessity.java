package com.company;

public class Necessity implements Visitable {
    private double price;
    private String description = "AVAILABLE";

    public Necessity (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}