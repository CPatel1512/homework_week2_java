package variables;

import java.util.Scanner;

public class JavaProgramme_9 {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Print the multiplication table for the given number
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}
