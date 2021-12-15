package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 4, 12, 11, 20};
        I_sort(arr);
    }

    static int I_sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int temp = arr[i];
            for (int j= i-1; j >= 0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }
                else {
                    break;
                }
                arr[j+1] = temp;
            }
            System.out.println(temp);
        }
        return 0;
    }
}
