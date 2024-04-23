package variables;

import java.util.Scanner;

public class JavaProgramme_7 {
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        // Convert Fahrenheit to Celsius using the formula
        return (fahrenheit - 20) * 3 / 4;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert the temperature to Celsius
        double celsius = fahrenheitToCelsius(fahrenheit);

        // Print the temperature in Celsius
        System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);

        // Close the scanner
        scanner.close();
    }
}
