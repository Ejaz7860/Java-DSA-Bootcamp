package com.Oops.BasicProgram;

import java.util.Scanner;

public class Porgram2 {
    public static void main(String[] args) {
        String[] c = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i > 9) {
                if (i % 2 == 0) {
                    System.out.println("even");
                } else
                    System.out.println("odd");
            }
            System.out.println(c[i]);
        }
    }
}
