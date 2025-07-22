public class numberPattern11 {
    public static void main(String[] args) {
        int N = 4;

        for (int i = 1; i <= N; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j <= N; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}

/* 
1 1 1 1 
 2 2 2 
  3 3 
   4 
*/