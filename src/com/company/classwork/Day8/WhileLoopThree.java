package com.company.classwork.Day8;

import java.util.Scanner;

public class WhileLoopThree {
    public static void main(String[] args){
        System.out.println("Ievadiet ciparu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int i = 1;
        while (i<=n){
            System.out.printf("%d * %d = %d\n", n, i, n*i++);
            //System.out.println(i++);
        }


    }


}
