
package ppl_assignment_part2_q5;

import BOYS.BOYS;
import COUPLING.COUPLING;
import GIRL.GIRL;
import GIFTS.GIFTS;
import GIVE_GF_GIFTS.GIVE_GF_GIFTS;
import LoggingUtility.GenerateCsvData;
import MAKE_COUPLE.MAKE_COUPLE;
import K_Most.K_MOST;
import java.util.List;

public class PPL_Assignment_part2_Q5 {

    public static void main(String[] args) {
        List<GIRL> girls ;
        List<BOYS> boys;
        List<GIFTS> gifts;
        GenerateCsvData.generateBoys();
        GenerateCsvData.generateGirls();
        GenerateCsvData.generateGifts();
        boys = COUPLING.readBoyTxt("Boys.txt");
        girls = COUPLING.readGirlTxt("Girls.txt");
        gifts = COUPLING.readGiftTxt("Gifts.txt");
        
        MAKE_COUPLE.COUPLE(boys , girls);
        GIVE_GF_GIFTS.GIVE_GF_GIFTS(gifts,boys);
        CalculateHappiness.CalculateHappiness.CalH(boys, girls);
        K_Most.K_MOST.K_most(boys,girls);
    }
    
}
