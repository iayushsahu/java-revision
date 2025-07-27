// left-aligned Hollow rhombus

public class starPattern16 {
    public static void main(String[] args) {
        int N = 5;

        for (int i = 0; i < N; i++) {
            // Leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Stars and spaces for hollow
            for (int k = 0; k < N; k++) {
                if (i == 0 || i == N - 1 || k == 0 || k == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

/* 

    *****
   *   *
  *   *
 *   *
*****

*/