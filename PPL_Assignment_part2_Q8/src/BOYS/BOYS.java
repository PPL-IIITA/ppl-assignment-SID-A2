package BOYS;
import GIRL.GIRL;
import HUMAN.HUMAN;
public class BOYS extends HUMAN{
   
    public int budget ;
    public int minAttractionRqd;
    public String girlfriendName = "" ;
    public GIRL girlfriend;
    public String Status = "single" ;
    public int happiness = 0;
    public int moneySpend = 0;
    public int totalValueAndCostOfGiftForGf;
    
    public BOYS(String name, int attractiveness, int iq ,int budget,int Attr_required,int type) { 
     
       super(name,attractiveness,iq,type);
       this.budget=budget; 
       this.minAttractionRqd =Attr_required;
    }
}
