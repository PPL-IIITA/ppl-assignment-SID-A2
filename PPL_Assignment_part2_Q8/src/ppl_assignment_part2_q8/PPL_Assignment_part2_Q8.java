/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment_part2_q8;

import BOYS.BOYS;
import COUPLING.COUPLING;
import GIRL.GIRL;
import GIFTS.GIFTS;
import GIVE_GF_GIFTS.GIVE_GF_GIFTS;
import LoggingUtility.GenerateCsvData;
import MAKE_COUPLE.MAKE_COUPLE;
import K_Most.K_MOST;
import java.util.List;

public class PPL_Assignment_part2_Q8 {

    public static void main(String[] args)throws Exception {
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
        //CalculateHappiness.CalculateHappiness.CalH(boys, girls);
        //K_Most.K_MOST.K_most(boys,girls);
    }
    
}
