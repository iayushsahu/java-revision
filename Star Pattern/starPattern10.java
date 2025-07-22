
// hollow reverse triangle pattern
import java.util.Scanner;

public class starPattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();

        hollowReverseTrianglePattern(input);

        sc.close();
    }

    public static void hollowReverseTrianglePattern(int N) {
        for (int i = 0; i < N; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                // Top row: full stars
                for (int k = 0; k < N; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else if (i == N - 1) {
                // Last row: single star
                System.out.println("*");
            } else {
                // Middle rows: star, spaces, star
                System.out.print("*");
                for (int k = 0; k < 2 * (N - i - 1) - 1; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
