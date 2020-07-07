package applePress;

import applePress.appleModel.Apple;
import applePress.appleModel.AppleColor;
import applePress.appleModel.AppleName;

import java.util.ArrayList;
import java.util.List;

public class AppleMain {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(AppleName.FUJI, AppleColor.GREEN, 5));
        apples.add(new Apple(AppleName.FUJI, AppleColor.GREEN, 5));
        apples.add(new Apple(AppleName.FUJI, AppleColor.GREEN, 5));
        apples.add(new Apple(AppleName.FUJI, AppleColor.GREEN, 5));
        apples.add(new Apple(AppleName.RED_DELICIOUS, AppleColor.RED, 9));
        apples.add(new Apple(AppleName.RED_DELICIOUS, AppleColor.RED, 9));
        apples.add(new Apple(AppleName.RED_DELICIOUS, AppleColor.RED, 9));
        apples.add(new Apple(AppleName.RED_DELICIOUS, AppleColor.RED, 9));





    }
}
