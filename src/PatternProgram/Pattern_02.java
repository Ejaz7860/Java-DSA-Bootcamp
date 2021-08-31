package PatternProgram;

public class Pattern_02 {
    public static void main(String[] args) {
        for(int col = 1; col <= 5 ; col++) {
            for (int row = 1; row <= 5; row++) {
                if (row == 1 || row ==2 ) {
                    System.out.print("+");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
