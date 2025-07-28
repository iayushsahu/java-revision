public class Pattern2 {
    public static void main(String[] a) {
        int N = 4;

        for (int i = 1; i <= N; i++) {
            int ctn = i;
            for (int j = 1; j <= N; j++) {
                System.out.print((char) ('A' + ctn - 1) + " ");
                ctn++;
            }
            System.out.println();
        }
    }
}

// A B C D 
// B C D E 
// C D E F 
// D E F G 