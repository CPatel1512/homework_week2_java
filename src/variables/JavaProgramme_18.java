package variables;

import java.util.Scanner;

public class JavaProgramme_18 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Creat the cutomer to enter the first number
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        // Creat the customer to enter the second number
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        // Calculate the sum
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        // Calculate the difference (subtraction)
        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);

        // Calculate the product (multiplication)
        int product = firstNumber * secondNumber;
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);

        // Calculate the quotient (division)
        int quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

        // Calculate the remainder (modulo)
        int remainder = firstNumber % secondNumber;
        System.out.println(firstNumber + " mod " + secondNumber + " = " + remainder);
    }
}
