package simpleCalculator.utilities;

import java.util.Scanner;

public class MathHelper {

    public static double add(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1+d2;
    }

    public static double subtract(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1-d2;    }

    public static double multiply(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1*d2;    }

    public static double divide(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return d1/d2;    }



}
