package com.company;

public class Tobacco implements Visitable{
    private double price;

    public Tobacco (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
        /*double tax = 0.8;
        return price + (price * tax);*/
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}