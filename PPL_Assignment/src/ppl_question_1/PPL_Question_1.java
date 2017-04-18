
package ppl_question_1;
import BOYS.BOYS;
import GIRL.GIRL;
import COUPLING.COUPLING;
import LoggingUtility.GenerateCsvData;
import java.util.List;
import MAKE_COUPLE.MAKE_COUPLE;
public class PPL_Question_1 {

    public static void main(String[] args)throws Exception {
        List<GIRL> girls ;
        List<BOYS> boys;
        GenerateCsvData.generateBoys();
        GenerateCsvData.generateGirls();
        boys = COUPLING.readBoyTxt("Boys.txt");
        girls = COUPLING.readGirlTxt("Girls.txt");
        
        MAKE_COUPLE.COUPLE(boys , girls);
    }
}
