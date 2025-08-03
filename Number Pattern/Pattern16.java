public class Pattern16 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            int p = i;
            for(int j = 1; j <= i; j++){
                System.out.print(p+" ");
                p++;
            }
            int t = p-2;
            for(int j = 1; j <= i-1; j++){
                System.out.print(t+" ");
                t--;
            }
            System.out.println();
        }
    }
}

/*
      1 
    2 3 2 
  3 4 5 4 3 
4 5 6 7 6 5 4 
*/