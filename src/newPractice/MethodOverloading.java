package newPractice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class MethodOverloading {

    public static void main(String[] args) {
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");

        double result = addValues(s1, s2);
        System.out.println("The total is: " + result);
    }

    static String getInput(String inputText){
        System.out.println(inputText);
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    static double addValues(String a, String b){
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);

        return d1+d2;
    }
}
