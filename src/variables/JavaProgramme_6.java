package variables;

import java.util.Scanner;

public class JavaProgramme_6 {
            public static void main(String[] args) {
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the radius of the circle
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            // Calculate the area of the circle using the formula A = π * r * r
            double area = Math.PI * radius * radius;

            // Print the area of the circle
            System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);

            // Close the scanner
            scanner.close();
        }
    }


