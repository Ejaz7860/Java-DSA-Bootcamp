package BinarySearch;
/*
 Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
 It picks an element as pivot and partitions the given array around the picked pivot.
  There are many versions of quickSort that pick pivot in different ways.

    1. Always pick first element as pivot.
    2. Always pick last element as pivot (implemented below)
    3. Pick a random element as pivot.
    4. Pick median as pivot.

low --> starting index
high ----> Ending index
quickSort(arr[], low, high)
{
    if(low < high)
    {
    pi = partition(arr, low, high)
    quicksort(arr, low, pi-1) --> Before Pi
    quicksort(arr, pi+1, high)    ----> after pi

    Pseudo Code for Partition
    This function takes last element as pivot, places
   the pivot element at its correct position in sorted
    array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot
   partition (arr[], low, high)
{
    // pivot (Element to be placed at right position)
    pivot = arr[high];

    i = (low - 1)  // Index of smaller element and indicates the
                   // right position of pivot found so far

    for (j = low; j <= high- 1; j++)
    {
        // If current element is smaller than the pivot
        if (arr[j] < pivot)
        {
            i++;    // increment index of smaller element
            swap arr[i] and arr[j]
        }
    }
    swap arr[i + 1] and arr[high])
    return (i + 1)
}
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);


    }
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    // apply quickSort
    static void quickSort(int[] arr, int low, int high){
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        // assume last element is a pivot
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j <= high-1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    //swap
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
