public class Pattern4 {
    public static void main(String[] args) {
        int N = 5;

        for (int i = N; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/* 
12345
1234
123
12
1
*/