package com.Oops.BasicProgram;

public class ReverseArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Reverse(arr);

    }
    static void Reverse(int [] arr){
        int n = arr.length;
        int [] b = new int[n];
        int j = n;
        for (int i = 0; i <n; i++){
            b[j-1] = arr[i];
            j = j-1;
        }
        for (int i = 0; b.length > i; i++){
            System.out.print( " " + b[i]);
        }
    }
}
