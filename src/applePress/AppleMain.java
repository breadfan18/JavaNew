package applePress;

import applePress.appleModel.*;

import java.util.ArrayList;
import java.util.List;

public class AppleMain {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Fuji());
        apples.add(new Fuji());
        apples.add(new Fuji());
        apples.add(new Fuji());
        apples.add(new Fuji());
        apples.add(new RedDelicious());
        apples.add(new RedDelicious());
        apples.add(new RedDelicious());
        apples.add(new RedDelicious());

        AppleWinePress winePress = new AppleWinePress();
        int wineYield =  winePress.getWineFromApple(apples);
        System.out.println("Total wine we got is " + wineYield + " ltr");

    }
}
