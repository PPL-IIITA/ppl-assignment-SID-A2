package FindCouple;

import BOYS.BOYS;
import GIRL.GIRL;
import LoggingUtility.GenerateCsvData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindCouple {
  public static void Couple(List<BOYS> boys , List<GIRL> girls){
    List<CC2> couple = new ArrayList<>();
        CC2 c;
        for(BOYS b : boys){
            if(b.Status == "Commited"){
                c = new CC2(b.girlfriend,b);
                couple.add(c);
            }
        }
        String s = "Commited Boys Are :  ";
        System.out.println(s);
        GenerateCsvData.generateCoupleFormedLog("coupleLog.txt", s);
        int i = 1;
        for(CC2 b : couple){
                s = i + ". :" + b.boy.name;
                System.out.println(s);
                GenerateCsvData.generateCoupleFormedLog("coupleLog.txt", s);
                i++;
        }
    }
}
class CC2 {
    public GIRL girl ;
    public BOYS boy;
    public CC2(GIRL g,BOYS b){
        this.girl = g;
        this.boy = b;
    }
}

