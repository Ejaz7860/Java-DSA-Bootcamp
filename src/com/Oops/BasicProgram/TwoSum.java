package com.Oops.BasicProgram;

public class TwoSum {
    public static void main(String[] args) {

        int [] arr = {2,7,11,15};
        int target = 26;
        int [] indices = twoSum(arr,target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
//        int res = twoSum2Targetleet(arr,target);
//        System.out.println(res);



    }
//    static int twoSum2Targetleet(int [] arr, int target){
//        for (int i = 0; i < arr.length; i++)
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] != target) {
//                    continue;
//                }
//                return   target;
//            }
//        return 0;
//    }

//    static int twoSum2Target(int [] arr, int target){
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++)
//            for (int j = i+1; j<arr.length; j++)
//                if (arr[i] + arr[j] == target)
//                return  sum = target;
//    return 0;
//    }


    static int[] twoSum(int [] arr, int target){
        for (int i = 0; i < arr.length; i++)
            for (int j = i+1; j<arr.length; j++)
                if (arr[i] + arr[j] == target)
                 return new int [] {i,j};
        return new int [] {};
    }
}
