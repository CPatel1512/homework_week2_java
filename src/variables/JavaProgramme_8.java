package variables;

import java.util.Scanner;

public class JavaProgramme_8 {


public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter an uppercase string
    System.out.print("Enter an uppercase string: ");
    String uppercaseString = scanner.nextLine();

    // Convert the string to lowercase using the toLowerCase() method
    String lowercaseString = uppercaseString.toLowerCase();

    // Display the original and converted strings
    System.out.println("Original (uppercase) string: " + uppercaseString);
    System.out.println("Converted (lowercase) string: " + lowercaseString);

    // Close the scanner
    scanner.close();
}
}