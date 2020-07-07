package olivePress;

import olivePress.model.Olive;

import java.util.List;

public class OlivePress implements Press {
    private int currentOil;

    public int getOil(List<Olive> olives){

        int totalOil = 0;
        for (Olive o: olives){
            System.out.println(o.getName() + ": " + o.crush() + " units") ;
            totalOil+= o.crush();
        }

        return totalOil;
    }

    @Override
    public void setOil(int oil) {
        currentOil = oil;
    }
}
