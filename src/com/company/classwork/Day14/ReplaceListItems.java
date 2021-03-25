package com.company.classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ReplaceListItems {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = random.nextInt(16) + 5;
        //max-min+1 +min
        for (int i=0; i<n; i++) {
            int m = random.nextInt(101) + 0;
            numberList.add(m);
            System.out.println(m);
        }

    }
}
