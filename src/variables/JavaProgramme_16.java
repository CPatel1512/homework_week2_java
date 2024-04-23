package variables;

import java.util.Scanner;

public class JavaProgramme_16 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Creat the Customer to input the first binary number
        System.out.print("Input first binary number: ");
        String binary1 = scanner.nextLine();

        // Creat the Customer to input the second binary number
        System.out.print("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert the binary numbers to integers
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Add the two decimal numbers
        int sumDecimal = decimal1 + decimal2;

        // Convert the sum back to a binary string
        String sumBinary = Integer.toBinaryString(sumDecimal);

        // Display the sum of the binary numbers
        System.out.println("Sum of two binary numbers: " + sumBinary);

        // Close the scanner
        scanner.close();
    }
}
