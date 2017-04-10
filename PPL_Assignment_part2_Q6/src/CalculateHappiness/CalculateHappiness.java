package CalculateHappiness;

import BOYS.BOYS;
import GIRL.GIRL;
import static java.lang.Math.exp;
import static java.lang.Math.log;
import java.util.List;


public class CalculateHappiness {
    public static void CalH(List<BOYS> boys , List<GIRL> girls){
        double ratio ;
        for(GIRL g : girls){
            if(g.Status == "Commited"){
                ratio = ( g.boyfriend.moneySpend / g.maintenanceBudget );
                if(g.type == 1)
                    g.happiness = (int) log(ratio);
                if(g.type == 2)
                    g.happiness = (int)ratio;
                if(g.type == 1)
                    g.happiness = (int) exp(ratio);
            }
        }
        for(BOYS b : boys){
            if(b.Status == "Commited"){
                if(b.type == 1)
                    b.happiness = b.budget - b.moneySpend;
                else if(b.type == 2)
                    b.happiness = b.girlfriend.happiness;
                else if(b.type == 3)
                    b.happiness = b.girlfriend.intelligence;
            }   
        }
    }
}
