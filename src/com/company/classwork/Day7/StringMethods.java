package com.company.classwork.Day7;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        scanner.close();

        // .length() / .toUpperCase()
        // Īsākais+garākais+īsākais
        // ja text1 un text2 garumi sakrīt, tad pieņemt,
        // ka text1 ir garākais

        String output = text1.length() >= text2.length() ?
                text2 + text1.toUpperCase() + text2 :
                text1 + text2.toUpperCase() + text1;

        System.out.println(output);
    }
}
