
package ppl_assignment_part2_q7;
import BOYS.BOYS;
import COUPLING.COUPLING;
import FindCouple.FindCouple;
import GIRL.GIRL;
import LoggingUtility.GenerateCsvData;
import MAKE_COUPLE.MAKE_COUPLE;
import java.util.List;

public class PPL_Assignment_part2_Q7 {
    
    public static void main(String[] args) {
        List<GIRL> girls;
        List<BOYS> boys;
        GenerateCsvData.generateBoys();
        GenerateCsvData.generateGirls();
        boys = COUPLING.readBoyTxt("Boys.txt");
        girls = COUPLING.readGirlTxt("Girls.txt");
        
        MAKE_COUPLE.COUPLE(boys , girls);
        FindCouple.Couple(boys,girls);
        
    }
    
}
