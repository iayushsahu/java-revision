import java.util.Scanner;

public class fahrenheitToCelsius {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = convertToCelsius(fahrenheit);
            System.out.printf("%.2f°F = %.2f°C", fahrenheit, celsius);

            sc.close();
        }

        public static double convertToCelsius(double f) {
            return (f - 32) * 5.0 / 9;
        }
    }
}

// BYJUS