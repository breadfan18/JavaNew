package simpleCalculator;

import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = scan.nextDouble();

        System.out.print("Enter number 2: ");
        double number2 = scan.nextDouble();

        System.out.print("Select calculation: ");
        String operation = scan.next();

        switch (operation){
            case "+":
                System.out.println("The answer is: " + add(number1, number2));
                break;
            case "-":
                System.out.println("The answer is: " + subtract(number1, number2));
                break;
            case "*":
                System.out.println("The answer is: " + multiply(number1, number2));
                break;
            case "/":
                System.out.println("The answer is: " + divide(number1, number2));
            default:
                System.out.println("Not a valid operand");
        }
    }

    private static double add (double a, double b) {
        return a+b;
    }

    private static double subtract (double a, double b) {
        return a-b;
    }

    private static double multiply (double a, double b) {
        return a*b;
    }

    private static double divide (double a, double b) {
        return a/b;
    }


}
