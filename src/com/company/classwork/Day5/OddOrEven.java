package com.company.classwork.Day5;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet lūdzu skaitli no 1 līdz 10: ");
        number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.println("Jums ir nepāra skaitlis.");
        } else {
            System.out.println("Jums ir pāra skaitlis.");
        }
    }
}

