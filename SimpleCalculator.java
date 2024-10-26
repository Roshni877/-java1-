 import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get numbers from the user
        System.out.print("Enter the first number (Num1): ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number (Num2): ");
        double num2 = scanner.nextDouble();

        // Calculations
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double div1 = num1 / num2; // Decimal division
        long div2 = (long) num1 / (long) num2; // Quotient (integer division)
        double rem1 = num1 % num2; // Remainder
        double exp1 = Math.pow(num1, num2); // Power

        // Output: Display the results
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Decimal Division = " + div1);
        System.out.println("Quotient = " + div2);
        System.out.println("Remainder = " + rem1);
        System.out.println("Exponentiation = " + exp1);

        // Close scanner
        scanner.close();
    }
}