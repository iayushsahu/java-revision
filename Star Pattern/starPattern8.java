
// square hollow pattern
import java.util.Scanner;

public class starPattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();
        squareHollowPattern(input);

        sc.close();
    }

    public static void squareHollowPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || j == 1 || i == N || j == N) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/* 

* * * * * 
*       * 
*       * 
*       * 
* * * * * 

*/