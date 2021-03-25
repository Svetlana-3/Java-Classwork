package com.company.classwork.Day9;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        do {
            sum += i;
            System.out.println(i++);
        }
        while (i <= 10);
            System.out.println("Summa: " + sum);
    }
}
