package newPractice.strings;

import java.util.Scanner;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello")
            .append(", ")
            .append("World")
            .append("!");

        System.out.println(sb);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");

        String input = scan.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        System.out.println(sb);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter value " + i);
            input = scan.nextLine();
            sb.append(input + "\n");
        }
    }
}
