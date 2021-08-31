package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int [] arr = {12,345,2,6,7896};
        System.out.println(EvenDigit(541));
        System.out.println(findNumberOfDigits(arr));
    }

    static int findNumberOfDigits(int[] num)
    {
        int count = 0;
        for(int nums : num){
            if (even(nums)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = EvenDigit(num);
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int EvenDigit(int nums)
    {
        int count= 0;
        while (nums > 0){
            nums = nums / 10; // num /= 10
            count++;
        }
        return count;
    }
}
