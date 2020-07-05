package simpleCalculator;

import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {

            String number1 =  getInput("Enter number 1: ");
            String number2 =  getInput("Enter number 2: ");
            String operation = getInput("Choose an operation  (+ -  * /): ");

            double result = 0;

        try {
            switch (operation) {
                case "+":
                    result =  add(number1, number2);
                    break;
                case "-":
                    result = subtract(number1, number2);
                    break;
                case "*":
                    result = multiply(number1, number2);
                    break;
                case "/":
                    result = divide(number1, number2);
                    break;
                default:
                    System.out.println("Unrecognized operation");
            }

            System.out.println("The answer is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Number Formatting Exception " + e.getMessage());
        }
    }

    private static double add (String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1+d2;
    }

    private static double subtract (String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1-d2;    }

    private static double multiply (String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1*d2;    }

    private static double divide (String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1/d2;    }

    private static String getInput(String prompt){
            Scanner scan = new Scanner(System.in);
            System.out.print(prompt);
            return scan.next();
    }


}
