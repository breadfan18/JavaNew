package newPractice.strings;

public class StringBuilderTest {

    public static void main(String[] args) {


        String s1 = "Hello";
        String s2 = "World";

        StringBuilder sb = new StringBuilder("Hello")
            .append(", ")
            .append("World")
            .append("!");

        System.out.println(sb);

    }
}
