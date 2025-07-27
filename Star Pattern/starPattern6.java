
// triangle star pattern
import java.util.Scanner;

public class starPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for pattern: ");
        int input = sc.nextInt();

        trianglePattern(input);

        sc.close();
    }

    public static void trianglePattern(int N) {
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/* 

    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/