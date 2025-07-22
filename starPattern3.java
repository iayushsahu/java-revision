
// left half pyramid
import java.util.Scanner;

public class starPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();

        leftHalfPyramid(input);

        sc.close();
    }

    public static void leftHalfPyramid(int N) {
        for (int i = 1; i <= N; i++) {
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