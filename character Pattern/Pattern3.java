public class Pattern3 {
    public static void main(String []a) {
		int N = 4;

		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((char)('A'+j-1)+" ");
			}
			System.out.println();
		}
	}
}

// A 
// A B 
// A B C 
// A B C D 