// X pattern 

public class starPattern22 {
    public static void main(String[] args) {
        int N = 5;  // Must be odd for symmetrical X

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j || i + j == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
