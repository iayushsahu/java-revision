public class Pattern14 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = N - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



/*
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
*/