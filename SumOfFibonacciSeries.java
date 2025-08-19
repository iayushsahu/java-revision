public class SumOfFibonacciSeries {
    public static void main(String[] args) {
        int n = 6;
        int a = 0, b = 1;
        int sum = a + b;

        for (int i = 2; i < n; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }

        System.out.println("Sum of first " + n + " Fibonacci numbers = " + sum);
    }
}

// output: Sum of first 6 Fibonacci numbers = 12