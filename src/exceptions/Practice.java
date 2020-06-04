package exceptions;

public class Practice {
    public static void main(String[] args) {
        String totalString = getString("Hello", "Team");

        System.out.println(totalString);

    }

    public static String getString (String a, String b) {
     return a+b;
    }


}
