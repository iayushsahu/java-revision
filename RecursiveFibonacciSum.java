// with for loop 
public class RecursiveFibonacciSum {
    public static void main(String[] args) {
        int n = 6;

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += fibonacci(i);
        }

        System.out.println("Sum of first " + n + " Fibonacci numbers = " + sum);
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// output: Sum of first 6 Fibonacci numbers = 20

/*
 * public class RecursiveFibonacciSum {
 * public static void main(String[] args) {
 * int n = 6;
 * 
 * int sum = fibonacciSum(n);
 * System.out.println("Sum of first " + n + " Fibonacci numbers = " + sum);
 * }
 * 
 * public static int fibonacci(int n) {
 * if (n == 0)
 * return 0;
 * else if (n == 1)
 * return 1;
 * else
 * return fibonacci(n - 1) + fibonacci(n - 2);
 * }
 * 
 * public static int fibonacciSum(int n) {
 * if (n == 0)
 * return 0;
 * else
 * return fibonacci(n) + fibonacciSum(n - 1);
 * }
 * }
 * 
 */