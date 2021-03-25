package com.company.classwork.Day10;

import java.util.Locale;
import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String[] names = {  "Kristaps", "Kristīne", "Līga",
                "Matīss", "Martiņš", "Jānis",
                "Ilze", "Sanita", "Sandijs" };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Meklēt: ");
        String searchBy = scanner.next();
        scanner.close();

        //Atrodam visus vārdus, kuri sākās ar searchBy
        //* cikliski ejam cauri masīva "names" elementiem
        //* izvadam uz ekrāna tos elementus, kuri sākās ar searchBy
        // cikls 1. => for(int i=0; i<array.length; i++)
        // array [i]
        // Cikls 2. (Enhanced For loop)
        // for (String name : array)

      /*String sampleName = "Kristaps";
        String search = "Kri";
        System.out.println(sampleName.toLowerCase().startsWith(search.toLowerCase()));*/

    }
}
