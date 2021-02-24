package com.company.classwork.Day5;

import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
        int atz;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet lūdzu savu atzīmi: ");
        atz = scanner.nextInt();
        scanner.close();
        if (atz >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
