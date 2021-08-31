package LinearSearch;

public class WealthOfRichestPerson {
    public static void main(String[] args) {
        int [][] arr = { { 1, 2, 3, 4 },
                { 25, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int sumOfElements = MaxWealth(arr);
        System.out.println(sumOfElements);
    }

    static int MaxWealth(int[][] arr)
    {
        int Max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > Max) {
                Max = sum;
            }
        }
        return Max;
    }
}
