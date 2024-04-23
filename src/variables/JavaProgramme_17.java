package variables;

import java.util.Scanner;

public class JavaProgramme_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creat the customer to input a decimal number
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        // Convert the decimal number to binary using Integer.toBinaryString() method
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Output the binary representation
        System.out.println("Binary number is: " + binaryNumber);

        scanner.close();}
}
