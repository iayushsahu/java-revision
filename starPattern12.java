
// hollow diamond pattern 
import java.util.Scanner;

public class starPattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();

        hollowDiamondPattern(input);
        sc.close();
    }

    public static void hollowDiamondPattern(int N) {
        // Upper part (including middle line)
        for (int i = 0; i < N; i++) {
            // Leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                // Top point
                System.out.println("*");
            } else {
                // Hollow stars
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        // Lower part
        for (int i = N - 2; i >= 0; i--) {
            // Leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            if (i == 0) {
                // Bottom point
                System.out.println("*");
            } else {
                // Hollow stars
                System.out.print("*");
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
