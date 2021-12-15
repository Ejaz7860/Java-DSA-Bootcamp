package com.Oops.BasicProgram;

public class SumRecur {
    public static void main(String[] args) {

        int result = power(3,4);
        System.out.println(result);
    }

    // SUM of Natural Number
 /*   static int SumRecur(int n){
        if(n == 0){
            return 1;
        }
        else {
            return SumRecur(n-1) + n;
        }
    }
*/
    // Factorial using Recursion
    /*static int Factorial(int n){
        if (n == 0){
            return 1;
        }
        else {
            return Factorial(n - 1) * n;
        }
    }*/

    // power using recursion formula (base * power(base, a-1))

    static int power(int base, int a){
        if ( a != 0 ){
            return (base * power(base, a-1));
        }else {
            return 1;
        }
    }

}
