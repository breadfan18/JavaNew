package newPractice;

import java.text.NumberFormat;

public class MathPractice {

    public static void main(String[] args) {

        double doubleValue   = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: " + rounded);

        int intValue = 42;
        String fromInt = Integer.toString(intValue);

        System.out.println(fromInt);

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);


    }
}
