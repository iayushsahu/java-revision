public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int start = n - i + 1;

            for (int j = 0; j < i; j++) {
                char ch = (char) ('A' + start + j - 1);
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}

/* 
E
DE
CDE
BCDE
ABCDE
*/