package simpleCalculator;

import simpleCalculator.utilities.MathHelper;

import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {
        Calc calc =  new Calc();
        calc.calculate();
    }

    protected void calculate() {
        InputHelper helper = new InputHelper();
        String number1 =  helper.getInput("Enter number 1: ");
        String number2 =  helper.getInput("Enter number 2: ");
        String operation = helper.getInput("Choose an operation  (+ -  * /): ");

        double result = 0;

        try {
            switch (operation) {
                case "+":
                    result = MathHelper.add(number1, number2);
                    break;
                case "-":
                    result = MathHelper.subtract(number1, number2);
                    break;
                case "*":
                    result = MathHelper.multiply(number1, number2);
                    break;
                case "/":
                    result = MathHelper.divide(number1, number2);
                    break;
                default:
                    System.out.println("Unrecognized operation");
            }

            System.out.println("The answer is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Number Formatting Exception " + e.getMessage());
        }
    }

    private class InputHelper {
        private String getInput(String prompt){
            Scanner scan = new Scanner(System.in);
            System.out.print(prompt);
            return scan.next();
        }

    }




}
