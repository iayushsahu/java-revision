// right-aligned solid rhombus

public class starPattern13 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i < N; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < N; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
