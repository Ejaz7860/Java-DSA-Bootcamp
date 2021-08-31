package LinearSearch;

import org.jetbrains.annotations.Contract;

public class LinearSearch {
    public static void main(String[] args) {
        int [] nums = {12,25,2,3,5,255};
        int target = 5;
        int result = LinearSearching(nums, target);
        System.out.println("Return the index of the target : " + result);

        int target2 = LinearSearching2(nums, target);
        System.out.println("Return target: " + target2);

        boolean bt = LinearSearching3(nums, target);
        System.out.println("If the element is present then return True if not then false: " + bt);

    }


    // return true or false if the element is present or not in the array
    static boolean LinearSearching3(int arr[], int target){

        for (int element : arr)
        {
            if (element == target)
            {
                return true;
            }
        }
        return false;

    }


    // return the target
    static int LinearSearching2(int arr[], int target){

        for (int element : arr)
        {
            if (element == target)
            {
                return element;
            }
        }
        return -1;

    }


    @Contract(pure = true)
    static int LinearSearching(int arr[], int target){

        for (int index = 0 ; index<=arr.length; index++)
        {
            if (arr.length == 0)
            {
                return -1;
            }
            int element = arr[index];


            if (element == target)
            {
                return index;
            }
        }
        return -1;

    }
}
