package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        // Select en element and put it at right position
        // select an element put it correct index
        // select the largest or smallest element
        // n-1 comparison bcz in every comparison the largest or smallest element is put at correct position


        int[] arr = {3, 1, 5, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

//    static int largest(int [] arr)
//    {
//        int i;
//
//        // Initialize maximum element
//        int max = arr[0];

    // Traverse array elements from second and
    // compare every element with current max
//        for (i = 1; i < arr.length; i++)
//            if (arr[i] > max)
//                max = arr[i];
//
//        return max;
//    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remainig array and swap with correct index;
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr, maxIndex, last);
        }


    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int end) {
        //  {3, 1, 5, 4, 2};
        int max = 0;

        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}