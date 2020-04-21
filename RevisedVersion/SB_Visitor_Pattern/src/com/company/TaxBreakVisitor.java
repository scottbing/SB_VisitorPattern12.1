package com.company;

public class TaxBreakVisitor implements Visitor {
    @Override
    public double visit(Liquor liquorItem) {
        double taxAmount = 0.0367;
        System.out.println(liquorItem.getDescription());
        System.out.println("Liquor item price with tax ");
        double basePrice = liquorItem.getPrice();
        return basePrice + (taxAmount*basePrice);
    }

    @Override
    public double visit(Necessity necessaryItem) {
        System.out.println(necessaryItem.getDescription());
        System.out.println("Necessity item price with tax ");
        return necessaryItem.getPrice();
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        double taxAmount = 0.0034;
        System.out.println(tobaccoItem.getDescription());
        System.out.println("Tobacco item price with tax ");
        double basePrice = tobaccoItem.getPrice();
        return basePrice + (taxAmount*basePrice);
    }
}