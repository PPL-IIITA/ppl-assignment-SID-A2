
package MAKE_COUPLE;
import BOYS.BOYS;
import COUPLING.COUPLING;
import GIRL.GIRL;
import LoggingUtility.GenerateCsvData;
import java.util.List;
public class MAKE_COUPLE {
    
    public static void COUPLE(List<BOYS> boys , List<GIRL> girls)throws Exception{
        for(GIRL girl : girls){
            for(BOYS boy : boys){
                if(boy.Status == "single" && girl.Status == "single" && boy.budget >= girl.maintenanceBudget && boy.minAttractionRqd <= girl.attractiveness){
                    boy.girlfriendName = girl.name;
                    girl.boyfriendName = boy.name;
                    boy.Status = "Commited";
                    girl.Status = "Commited";
                    boy.girlfriend = girl;
                    girl.boyfriend = boy;
                    String s = boy.name+" committed to "+girl.name;
                    System.out.println(s);
                    GenerateCsvData.generateCoupleFormedLog("coupleLog.txt", s);
                }
            }
         }
    } 
}
