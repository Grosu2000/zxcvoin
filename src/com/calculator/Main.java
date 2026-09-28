package com.calculator;

import com.calculator.operations.AddSub;
import com.calculator.operations.MulDiv;
import com.calculator.operations.PowMod;
import com.calculator.operations.AdvancedMath;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Laboratory work #2: Java Calculator");

        while (running) {
            Menu.show();
            System.out.print("Your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: invalid choice.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye!");
                running = false;
                continue;
            }

            if (choice < 1 || choice > 8) {
                System.out.println("Error: invalid choice.");
                continue;
            }

            System.out.print("Enter first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Error: invalid number.");
                scanner.next();
                continue;
            }
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Error: invalid number.");
                scanner.next();
                continue;
            }
            double b = scanner.nextDouble();

            try {
                double result;
                switch (choice) {
                    case 1:
                        result = AddSub.add(a, b);
                        break;
                    case 2:
                        result = AddSub.subtract(a, b);
                        break;
                    case 3:
                        result = MulDiv.multiply(a, b);
                        break;
                    case 4:
                        result = MulDiv.divide(a, b);
                        break;
                    case 5:
                        result = PowMod.power(a, b);
                        break;
                    case 7:
                        result = AdvancedMath.sqrt(a);
                        break;
                    case 6:
                        result = PowMod.modulus(a, b);
                        break;
                    case 8:
                        result = AdvancedMath.log(a);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown operation");
                }
                System.out.printf("Result: %.6f%n", result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
