public class numberPattern8 {
    public static void main(String[] args) {
		int N = 5;

		for (int i = 1; i <= N; i++) {
			int k = (i % 2 == 0) ? 0 : 1;

			for (int j = 1; j <= i; j++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}


/* 
1
00
111
0000
11111
*/