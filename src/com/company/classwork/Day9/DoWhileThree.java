package com.company.classwork.Day9;

import java.util.Scanner;

public class DoWhileThree {
    public static void main(String[] args) {
        System.out.println("Ievadiet ciparu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int i = 1;
        do {
            System.out.printf("%d * %d = %d\n", n, i, n * i++);
        }
        while (i <= n);
    }
}
