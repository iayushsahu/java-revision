public class numberPattern10 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
   1 
  2 2 
 3 3 3 
4 4 4 4 
*/