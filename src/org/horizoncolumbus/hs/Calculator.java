package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which operation do you want to use? ");
        String operation = input.next().toLowerCase();
        System.out.println("Please put in number 1");
        double number1 = input.nextDouble();
        System.out.println("Please enter the second number");
        double number2 = input.nextDouble();
        switch (operation) {
            case "add":
                System.out.println(number1 + number2);
                break;
            case "sub":
                System.out.println(number1-number2);
                break;
            case "mul":
                System.out.println(number1 * number2);
                break;
            case "div":
                System.out.println(number1/number2);
                break;
            default:
                System.out.println("Please choose a valid operation");
        }


    }
}
