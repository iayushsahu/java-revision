public class Pattern2 {
    public static void main(String[] args) {
        int N = 5;

        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


/* 
11111
2222
333
44
5
*/