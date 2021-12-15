package com.Oops.BasicProgram;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //123 ->
        int n = sc.nextInt();
        int ans = reverse(n);
        System.out.println(ans);

        }
    static int reverse(int x) {
        int num = 0;
        while (x != 0){
            int digit = x % 10;
            num = num * 10 + digit;

            x = x / 10;
        }
        return num;
    }
}
