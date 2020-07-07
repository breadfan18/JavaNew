package applePress;

import applePress.appleModel.Apple;

import java.util.List;

public class AppleWinePress {

    public int getWineFromApple(List<Apple> apples){

        int totalYield = 0;
        for (Apple a: apples) {
            totalYield  += a.getYield();
            System.out.println(a.getName() + ": " + a.getYield() + " ltr");
        }
        return totalYield;
    }
}
