package com.company;

public class TaxVisitor implements Visitor {
    @Override
    public double visit(Liquor liquorItem) {
        double taxAmount = 0.0538;
        System.out.println(liquorItem.getDescription());
        System.out.println("Liquor item price with tax ");
        double basePrice = liquorItem.getPrice();
        return basePrice + (taxAmount*basePrice);
    }

    @Override
    public double visit(Necessity necessaryItem) {
        double taxAmount = 0.01;
        System.out.println(necessaryItem.getDescription());
        System.out.println("Necessity item price with tax ");
        double basePrice = necessaryItem.getPrice();
        return basePrice + (taxAmount*basePrice);
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        double taxAmount = 0.0621;
        System.out.println(tobaccoItem.getDescription());
        System.out.println("Tobacco item price with tax ");
        double basePrice = tobaccoItem.getPrice();
        return basePrice + (taxAmount*basePrice);
    }
}