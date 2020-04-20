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
                    Liquor blue = new Liquor(3);
                    Necessity milk = new Necessity(5);
                    Tobacco smoke = new Tobacco(7);

                    System.out.println(blue.accept(taxBreakVisitor));
                    System.out.println(milk.accept(taxBreakVisitor));
                    System.out.println(smoke.accept(taxBreakVisitor));

                    double cart = blue.accept(taxBreakVisitor) + milk.accept(taxBreakVisitor) + smoke.accept(taxBreakVisitor);
                    System.out.println("Total: " + cart);
                } else {
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
        }
        System.out.println("Goodbye... Thank you for using the app.");
    }
}
