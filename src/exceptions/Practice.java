package exceptions;

public class Practice {

    public static void main(String[] args) {
        Testing testing = new Testing();

        int totalInt = testing.getString(4, 2);

        System.out.println(totalInt);

        try {
            System.out.println(testing.getList().get(9));
        } catch (Exception e) {
            System.out.println("That list doesnt have that many values");
        }

        System.out.println("Code moves on");
        System.out.println("Cmd  d is pretty  cool");

    }



}
