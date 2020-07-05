package newPractice.loops;

import java.awt.*;

public class LoopingLikeABoss {

    static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug",
            "Sept", "Oct", "Nov", "Dec"};

    public static void main(String[] args) {



//        for (int i = months.length-1; i >=0; i--) {
//            System.out.println(months[i]);
//        }

//        for (String month : months) {
//            System.out.println(month);
//        }


//        while (counter  < months.length) {
//            System.out.println(months[counter]);
//            counter++;
//        }

        loopIt("This is the label");
        loopIt("Second Run");
        loopIt("Third run");


    }

    static void loopIt(String label){
        int counter = 0;
        System.out.println(label);
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
        }
        System.out.println();

        do {
            System.out.println(months[counter]);
            counter++;
        } while (counter  < months.length) ;
    }
}
