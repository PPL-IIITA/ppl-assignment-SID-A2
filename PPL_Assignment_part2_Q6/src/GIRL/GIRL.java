package GIRL;
import BOYS.BOYS;
import HUMAN.HUMAN;
public class GIRL extends HUMAN{
    
    public int maintenanceBudget ;
    public String boyfriendName = "" ;
    public BOYS boyfriend;
    public String Status = "single" ;
    public int happiness = 0;
    
    public GIRL(String name, int attractiveness, int iq ,int maint_budget,int type) { 
       
       super(name,attractiveness,iq,type);
       this.maintenanceBudget=maint_budget;
        
    } 
}
