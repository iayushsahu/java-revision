
// reverse left half pyramid
import java.util.Scanner;

public class starPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();

        reverseLeftHalfPyramid(input);

        sc.close();
    }

    public static void reverseLeftHalfPyramid(int N) {
        for (int i = N; i >= 0; i--) {

            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}