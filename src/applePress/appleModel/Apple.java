package applePress.appleModel;

public class Apple {

    private AppleName name;
    private AppleColor color;
    private int yield;


    public Apple(AppleName name, AppleColor color, int yield){
        this.name = name;
        this.color = color;
        this.yield = yield;
    }

    public AppleName getName() {
        return name;
    }

    public void setName(AppleName name) {
        this.name = name;
    }

    public AppleColor getColor() {
        return color;
    }

    public void setColor(AppleColor color) {
        this.color = color;
    }

    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }
}
