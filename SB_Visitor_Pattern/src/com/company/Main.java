package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TaxVisitor taxVisitor = new TaxVisitor();

        Liquor blue = new Liquor(3);
        Necessity milk = new Necessity(5);
        Tobacco smoke = new Tobacco(7);

        System.out.println(blue.accept(taxVisitor));
        System.out.println(milk.accept(taxVisitor));
        System.out.println(smoke.accept(taxVisitor));

        double cart = blue.accept(taxVisitor) + milk.accept(taxVisitor) + smoke.accept(taxVisitor);
        System.out.println("Total: " + cart);
    }
}
