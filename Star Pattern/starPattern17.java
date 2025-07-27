// butterfly pattern

public class starPattern17 {
    public static void main(String[] args) {
        int N = 5;

        // Upper half
        for (int i = 1; i <= N; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) System.out.print("*");
            // Spaces
            for (int j = 1; j <= 2 * (N - i); j++) System.out.print(" ");
            // Right stars
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // Lower half
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (N - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}

/* 

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/