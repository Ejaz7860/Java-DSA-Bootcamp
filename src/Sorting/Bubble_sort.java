package Sorting;

public class Bubble_sort {

    public static void main(String[] args) {

        //
        Bubble_sort ob = new Bubble_sort();
        int arr [] = {12, 1, 0, 5, 3, 2}; // sorted array { 0, 1, 2, 3, 5, 12 }    Bubble_sort ob = new Bubble_sort();

        func(arr);
        ob.print(arr);

    }

    // print the array

    void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    /* static void swap(int x, int y){
         int temp = x;
         x = y;
         y = temp;
     }*/
    // SELECTION SORT
    // select the Minimum element in array
    static void func(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // function to sort the array using Bubble Sort
    /*static void func(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0 ; j < n-i-1; j++ ){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }*/
}

