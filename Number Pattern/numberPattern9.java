public class numberPattern9 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print(" ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

/* 
   1 
  1 1 
 1 2 1 
1 3 3 1 
*/