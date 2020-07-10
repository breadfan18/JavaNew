package newPractice;

import java.util.Scanner;

public class MutiplicationTab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int selectedNum;

        System.out.println("Enter an integer: ");
            selectedNum = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(selectedNum + "x" + i + " = " + selectedNum * i);

            }



    }
}
