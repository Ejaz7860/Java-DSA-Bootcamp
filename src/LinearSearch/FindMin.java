package LinearSearch;

public class FindMin {
    public static void main(String[] args) {

        // Find the minimum element in the array
        // let's assume arr.length != 0 that means not empty

        int [] nums = {18, 12, -7, 3, 14, 28};
        int result = Min(nums);
        System.out.println(result);
    }

    static int Min(int [] arr){
        int min = arr[0];

        for (int i = 1; i<=5; i++){
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}
