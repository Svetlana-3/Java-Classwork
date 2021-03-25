package com.company.classwork.Day9;

import java.util.Scanner;

public class ForTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        //int i=0;
        for (int i=0;i<text.length();i++)
            System.out.println(Character.toUpperCase(text.charAt(i)));
        }
    }

