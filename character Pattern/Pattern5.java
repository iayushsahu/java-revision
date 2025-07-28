public class Pattern5 {
    public static void main(String[] a) {
        int N = 4;

        for (int i = 1; i <= N; i++) {
            int p = i;
            for (int j = N; j >= i; j--) {
                System.out.print((char) ('A' + p - 1) + " ");
                p++;
            }
            System.out.println();
        }
    }
}

// A B C D 
// B C D 
// C D 
// D 