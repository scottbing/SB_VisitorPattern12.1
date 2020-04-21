package com.company;

public interface Visitor {
    public double visit(Liquor liquorItem);
    public double visit(Necessity necessaryItem);
    public double visit(Tobacco tobaccoItem);
}
