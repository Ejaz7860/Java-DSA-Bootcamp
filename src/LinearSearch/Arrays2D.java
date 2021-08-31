package LinearSearch;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int [][]  arr = {
                {23,58,12},
                {1,2,5,9},
                {18,34},
                {25,555,35}
        };
        int target = 9;

        int [] ans = search(arr, target); //format of return value row and col.
        System.out.println(Arrays.toString(ans));

        System.out.println("Maximum in the 2D Array is : "+ Max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int Max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    static int[] search(int [][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
