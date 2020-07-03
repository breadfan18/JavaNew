package newPractice;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        /*byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;
        float f = 1f;
        double d = 1d;


        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);*/

        int  intvalue1 = 56;
        int intValue2 = intvalue1;

        System.out.println("The second value is: " + intValue2);

        long  longValue1  = intvalue1;


        short shortValue = (short) intvalue1;
        System.out.println("Short Value is:  "  +  shortValue);



    }
}
