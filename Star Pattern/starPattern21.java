// K pattern 

public class starPattern21 {
    public static void main(String[] args) {
		int N = 5;

		// Upper part
		for (int i = 0; i < N; i++) {
			System.out.print("*");
			for (int j = 0; j < N - i - 2; j++) System.out.print(" ");
			if (i != N - 1)
				System.out.print("*");
			System.out.println();
		}

		// Lower part
		for (int i = 1; i < N; i++) {
			System.out.print("*");
			for (int j = 0; j < i - 1; j++) System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}
	}
}

/* 

*   *
*  *
* *
**
*
**
* *
*  *
*   *

*/