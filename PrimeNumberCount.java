import java.util.Scanner;

public class PrimeNumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        System.out.println("Number of primes up to " + N + " = " + numCount(N));
    }

    public static int numCount(int N) {
        int cnt = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println();
        return cnt;
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

/*
 * input: 11
 * output: 2 3 5 7 11
 *         Number of primes up to 11 = 5
 */