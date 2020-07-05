package newPractice.strings;

public class CompareStrings {

    public static void main(String[] args) {


        String s1 = "Hello";
        String s2 = "Hello";

        if (s1 == s2){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }


        String s3 = "hello";


        if (s1 == s3){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }

        String part1 = "Hello ";
        String part2 = "WORLD";
        String str4 = part1 + part2;
        String str5 = "Hello World";

        if (str4.equalsIgnoreCase(str5)){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }
    }
}
