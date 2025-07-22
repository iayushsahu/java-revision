public class numberPattern12 {
    public static void main(String[] args) {
        int N = 5;

        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int s = 1; s <= N - i; s++) {
                System.out.print("  ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print ascending numbers starting from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

/* 
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
*/