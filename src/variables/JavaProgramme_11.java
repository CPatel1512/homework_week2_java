package variables;

import java.util.Scanner;

public class JavaProgramme_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = calculateTriangleArea(base, height);

        // Display the area of the triangle
        System.out.println("The area of the triangle is: " + area);
    }

    // Method to calculate the area of a triangle given the base and height
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
