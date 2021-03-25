package com.company.classwork.Day9;

import java.util.Scanner;

public class ForThree {
    public static void main(String[] args) {
        System.out.println("Ievadiet ciparu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        //int i = 1;
        for (int m = 1; m <= n; m++) {
            System.out.printf("%d * %d = %d\n", n, m, n * m);
            //System.out.println(i++);
        }
    }
}

