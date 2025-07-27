
// square fill pattern
import java.util.Scanner;

public class starPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();

        squarFillPattern(input);

        sc.close();
    }

    public static void squarFillPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

/*

****
****
****
****

*/