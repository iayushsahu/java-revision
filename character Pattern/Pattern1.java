public class Pattern1 {
    public static void main(String[] a) {
        int N = 4;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
}

// A B C D 
// A B C D 
// A B C D 
// A B C D 