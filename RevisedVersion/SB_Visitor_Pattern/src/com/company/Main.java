package com.company;

import java.util.Scanner;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        // write your code here

        String answer;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nTax Break? (Y/y|N/n) or Quit 'Q/q");
            answer = scan.next();
            if (answer.equalsIgnoreCase("q")) {
                break;
            } else {
                if (answer.equalsIgnoreCase("y")) {
                    TaxBreakVisitor taxBreakVisitor = new TaxBreakVisitor();
                    visit(taxBreakVisitor);
                } else {
                    TaxVisitor taxVisitor = new TaxVisitor();
                    visit(taxVisitor);
                }
            }
        }
        System.out.println("Goodbye... Thank you for using the app.");
    }

    public static void visit(Visitor visitor) {
        Liquor blue = new Liquor(3);
        Necessity milk = new Necessity(5);
        Tobacco smoke = new Tobacco(7);

        System.out.println(blue.accept(visitor));
        System.out.println(milk.accept(visitor));
        System.out.println(smoke.accept(visitor));

        double cart = blue.accept(visitor) + milk.accept(visitor) + smoke.accept(visitor);
        System.out.println("Total: " + cart);
    }
}
