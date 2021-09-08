package com.Oops.BasicProgram;

public class factorial {
    public static void main(String[] args) {
        System.out.println("hi");
        int n = 5;
        int res1 = whileFact(n);
        System.out.println(res1);

    }
    static int whileFact(int m)
    {
        int fact = 1;
        while (m > 1){
            fact = fact * m;
            m--;
        }
        return fact;
    }

}
