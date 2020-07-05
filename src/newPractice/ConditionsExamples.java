package newPractice;

import java.util.Scanner;

public class ConditionsExamples {

    public static void main(String[] args) {

        int monthNumber  =  8;

        if (monthNumber >= 1 && monthNumber <= 3) {
            System.out.println("You're in Quarter1");
        } else if (monthNumber >= 4 && monthNumber <= 6) {
            System.out.println("You're in Quarter2");
        } else if (monthNumber >= 7 && monthNumber <= 9) {
            System.out.println("You're in Quarter3");
        } else if (monthNumber >= 9 && monthNumber <= 12) {
            System.out.println("You're in Quarter4");
        } else {
            System.out.println("Unknown month!");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        String input = sc.nextLine();
        int monthNum = Integer.parseInt(input);

        switch (monthNum) {
            case 1:
                System.out.println("This month is Jan");
                break;
            case 2:
                System.out.println("This month is Feb");
                break;
            case 3:
                System.out.println("This month is March");
                break;
            default:
                System.out.println("You suck");
        }

    }
}
