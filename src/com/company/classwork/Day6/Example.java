package com.company.classwork.Day6;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();

        if (password.length() >=10) {
            System.out.println("Safe");
        } else {
            System.out.println("Not safe");
        }
    }
}
