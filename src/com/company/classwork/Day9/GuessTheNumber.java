package com.company.classwork.Day9;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        //1. uzgeneret Random skaitli
        //2. lietotajs ievada savu minejumu
        //3. cikliski parbaudam vai ir lietotajs min velreiz..

        System.out.println("Uzmini ciparu [0..10] par kuru es domāju:...");
        Scanner scanner = new Scanner(System.in);
        int number = new Random().nextInt(10);
        int guess = scanner.nextInt();
        while (guess != number) ;
        System.out.print("Nepareizi, mini vēlreiz...");
        scanner.close();

        System.out.println("Pareizi, Tu uzmnijēji: " + number);
    }
}