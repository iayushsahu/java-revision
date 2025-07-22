public class SumOfEvenNumberTillN {
    public static void main(String[] args) {
        int number = 8;
        int result = returnSum(number);
        System.out.println("result: " + result);
    }

    public static int returnSum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

// NOTE: Accenture, Transunion, Wipro, Maersk