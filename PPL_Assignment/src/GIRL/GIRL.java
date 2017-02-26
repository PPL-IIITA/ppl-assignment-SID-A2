package GIRL;
import BOYS.BOYS;
public class GIRL {
    public String name ;
    public int attractiveness ;
    public int intelligence ;
    public int maintenanceBudget ;
    public String boyfriendName = "" ;
    public BOYS boyfriend;
    public String Status = "single" ;
    public int happiness = 0;
    public int type ;
    
    public GIRL(String name, int attractiveness, int iq ,int maint_budget,int type) { 
       this.type = type;
       this.name = name;
       this.attractiveness = attractiveness; 
       this.maintenanceBudget=maint_budget;
       this.intelligence = iq; 
    } 
}
