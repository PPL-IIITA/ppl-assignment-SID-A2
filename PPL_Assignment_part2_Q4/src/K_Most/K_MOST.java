
package K_Most;

import BOYS.BOYS;
import GIRL.GIRL;
import LoggingUtility.GenerateCsvData;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class K_MOST {
    public static void K_most(List<BOYS> boys, List<GIRL> girls){
        
        List<CC> couple = new ArrayList<>();
        CC c;
        for(BOYS b : boys){
            if(b.Status == "Commited"){
                c = new CC(b.girlfriend,b,b.happiness+b.girlfriend.happiness,b.budget - b.girlfriend.maintenanceBudget + abs(b.attractiveness - b.girlfriend.attractiveness) + abs(b.intelligence - b.girlfriend.intelligence) );
                couple.add(c);
            }
        }
        Collections.sort(couple,new Hcomp() );
        System.out.println("Least 2 happiest Couple who will breakup are:");
        int i =1;
        for(CC cc : couple){
            System.out.println(i + ":" + cc.boy.name + " and " + cc.girl.name);
            cc.boy.Status = "single" ;
            cc.girl.Status = "single" ;
            i++;
            String s = cc.boy.name+ "  Breakup with  " +cc.girl.name;
            System.out.println(s);
            GenerateCsvData.generateCoupleFormedLog("coupleLog.txt", s);
            for(GIRL girl : girls){
                for(BOYS boy : boys){
                    if(boy.name!=cc.boy.name && boy.Status == "single" && girl.Status == "single" && boy.budget >= girl.maintenanceBudget && boy.minAttractionRqd <= girl.attractiveness){
                        boy.girlfriendName = girl.name;
                        girl.boyfriendName = boy.name;
                        boy.Status = "Commited";
                        girl.Status = "Commited";
                        boy.girlfriend = girl;
                        girl.boyfriend = boy;
                        String s1 = boy.name+" committed to "+girl.name;
                        System.out.println(s1);
                        GenerateCsvData.generateCoupleFormedLog("coupleLog.txt", s1);
                    }
                }
            }
            if(i>2)
                break;
        }
        /*
        i=1;
        Collections.sort(couple,new Ccomp() );
        System.out.println("Order Of Compatability of Couple is as follows :");
        for(CC cc : couple){
            System.out.println(i + ":" + cc.boy.name + " and " + cc.girl.name);
            i++;
        }
        */
        
    }
}
class Hcomp implements Comparator<CC>{
    @Override
    public int compare(CC c1, CC c2) {
        if(c1.happinessC < c2.happinessC){
            return 1;
        } else {
            return -1;
        }
    }
}
class Ccomp implements Comparator<CC>{
    @Override
    public int compare(CC c1,CC c2) {
        if( c1.compatabilityC < c2.compatabilityC ){
            return 1;
        } else {
            return -1;
        }
    }
}
class CC {
    public GIRL girl ;
    public BOYS boy;
    public int happinessC;
    public int compatabilityC;
    public CC(GIRL g,BOYS b,int h,int c){
        this.girl = g;
        this.boy = b;
        this.happinessC = h;
        this.compatabilityC =c;
    }
}