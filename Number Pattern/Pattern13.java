public class Pattern13 {
    public static void main(String []a){
        int N = 4;
        for(int i = 1; i <= N; i++){
            int ctn = i;
            for(int j = 1; j <= i; j++){
                System.out.print(ctn + " ");
                ctn++;
            }
            System.out.println();
        }
    }
}

/* 

1
2 3
3 4 5
4 5 6 7

*/