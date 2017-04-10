
package MAKE_COUPLE;
import BOYS.BOYS;
import COUPLING.COUPLING;
import GIRL.GIRL;
import LoggingUtility.GenerateCsvData;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MAKE_COUPLE {
    
    public static void COUPLE(List<BOYS> boys , List<GIRL> girls){
        Collections.sort(boys,new Hcomp() );
        Collections.sort(girls,new GGcomp() );
        int i = 1;
        for(GIRL girl : girls){
            for(BOYS boy : boys){
                if(boy.Status == "single" && girl.Status == "single" && boy.budget >= girl.maintenanceBudget && boy.minAttractionRqd <= girl.attractiveness){
                    boy.girlfriendName = girl.name;
                    girl.boyfriendName = boy.name;
                    boy.Status = "Commited";
                    girl.Status = "Commited";
                    boy.girlfriend = girl;
                    girl.boyfriend = boy;
                    String s;
                    if(i==0){
                        s = boy.name+" selected and got committed to "+girl.name;
                        i=1;
                    }
                    else{
                        s = girl.name+" selected and got committed to "+boy.name;
                        i=0;
                    }
                    System.out.println(s);
                    GenerateCsvData.generateCoupleFormedLog("coupleLog.txt", s);
                }
            }
         }
    } 
}
class Hcomp implements Comparator<BOYS>{
    @Override
    public int compare(BOYS b1, BOYS b2) {
        if(b1.attractiveness < b2.attractiveness){
            return 1;
        } else {
            return -1;
        }
    }
}
class GGcomp implements Comparator<GIRL>{
    @Override
    public int compare(GIRL g1, GIRL g2) {
        if(g1.maintenanceBudget < g2.maintenanceBudget){
            return 1;
        } else {
            return -1;
        }
    }
}

