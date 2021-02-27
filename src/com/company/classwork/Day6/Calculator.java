package com.company.classwork.Day6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet a: ");
        float a = scanner.nextFloat();
        System.out.println("Ievadiet b: ");
        float b = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ievadiet darbību (+,-,*,/): ");
        String action = scanner.nextLine();
        //System.out.println(action);
        //switch

        switch (action){
            case "+":
                    System.out.println(a+b);
            break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                    System.out.println(a*b);
                break;

        }

    }
}
