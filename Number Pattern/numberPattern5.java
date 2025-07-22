public class numberPattern5 {
    public static void main(String[] args) {
        int N = 5;

        for (int i = N; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/* 
55555
4444
333
22
1
*/