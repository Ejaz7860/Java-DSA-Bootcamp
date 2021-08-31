package com.Oops.BasicProgram;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        // take two number input from the user
        // swap two number without using third variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping value of a is " + a + " and b is " + b);

        // applying swapping
        a = b;
        b = a;
        System.out.println("After swapping value of a is " + a + " and b is " + b);


    }
}
