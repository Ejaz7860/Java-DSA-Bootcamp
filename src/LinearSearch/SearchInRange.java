package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        // How do we search in a particular range
        // arr = [18, 12, -7, 3, 14, 28] Q: Search for 3 in the range of index [1, 4]
        int [] nums = {18, 12, -7, 3, 14, 28};
        int target = 14;
        int result = LinearSearching(nums, target, 1, 4);
        System.out.println("Return the index of the target : " + result);



    }

    static int LinearSearching(int arr[], int target, int start, int end){

        for (int index = start ; index<=end; index++)
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
