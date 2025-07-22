// left-aligned solid rhombus

public class starPattern15 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i < N; i++) {
            // Leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 0; k < N; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
