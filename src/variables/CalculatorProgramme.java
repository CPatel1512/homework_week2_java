package variables;

import java.util.Scanner;

public class CalculatorProgramme


 {
    // Static method
    public static String add(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public static String subtract(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    // Instance methods
    public static String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public static String divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
        return "cannot divide by zero!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // static method  calls
        System.out.println(" static method");
        System.out.println(add(5,3));
        System.out.println(subtract(10,4));
        System.out.println("Static Methods:");
        System.out.print("Enter first number: ");
        int staticNum1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int staticNum2 = scanner.nextInt();
        System.out.println(add(staticNum1, staticNum2));
        System.out.println(subtract(staticNum1, staticNum2));

        // Instance method calls
        CalculatorProgramme javaFile= new CalculatorProgramme();
        System.out.println("\nInstance Methods:");
        System.out.print("Enter first number: ");
        int instanceNum1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int instanceNum2 = scanner.nextInt();
        System.out.println(CalculatorProgramme.multiply(instanceNum1, instanceNum2));
        System.out.println(CalculatorProgramme.divide(instanceNum1, instanceNum2));
        scanner.close();}}
