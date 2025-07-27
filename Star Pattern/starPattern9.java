
// hollow right triangle pattern
import java.util.Scanner;

public class starPattern9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();
        hollowRightTrianglePattern(input);

        sc.close();
    }

    public static void hollowRightTrianglePattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == N || j == i) {
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

* 
* * 
*   * 
*     * 
* * * * * 

*/