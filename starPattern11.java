
// diamond pattern 
import java.util.Scanner;

public class starPattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();

        diamondPattern(input);
        sc.close();
    }

    public static void diamondPattern(int N) {
        // Upper half including middle line
        for (int i = 0; i < N; i++) {
            // Print spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = N - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
