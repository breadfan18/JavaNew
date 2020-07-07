package olivePress;

import olivePress.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Olive> olives  = new ArrayList<>();

        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);


    }



}
