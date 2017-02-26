package BOYS;
import GIRL.GIRL;
public class BOYS {
    public String name ;
    public int attractiveness ;
    public int intelligence ;
    public int budget ;
    public int minAttractionRqd;
    public String girlfriendName = "" ;
    public GIRL girlfriend;
    public String Status = "single" ;
    public int happiness = 0;
    public int moneySpend = 0;
    public int type ;
    public int totalValueAndCostOfGiftForGf;
    
    public BOYS(String name, int attractiveness, int iq ,int budget,int Attr_required,int type) { 
       this.type = type;
       this.name = name;
       this.attractiveness = attractiveness; 
       this.budget=budget;
       this.intelligence = iq; 
       this.minAttractionRqd =Attr_required;
    }
}
