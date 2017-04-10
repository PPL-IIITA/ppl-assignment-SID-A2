
package GIVE_GF_GIFTS;

import BOYS.BOYS;
import GIFTS.GIFTS;
import LoggingUtility.GenerateCsvData;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class GIVE_GF_GIFTS {
       public static void GIVE_GF_GIFTS(List<GIFTS> gifts , List<BOYS> boys){
           Collections.sort(gifts,new GiftComp());
           int c = 0;
           for(BOYS boy : boys){
               if(boy.Status == "Commited"){
                   if(boy.type == 1){
                       c = 0;
                       while(boy.moneySpend <= boy.girlfriend.maintenanceBudget){
                           GenerateCsvData.generateGiftLog(boy,gifts.get(c));
                           boy.moneySpend += gifts.get(c).price;
                           c++;
                       }
                   }
                   else if(boy.type == 2){
                       c = 0;
                       while(boy.moneySpend <= boy.budget){
                           GenerateCsvData.generateGiftLog(boy,gifts.get(c));
                           boy.moneySpend += gifts.get(c).price;
                           c++;
                       }
                       if(c==0){
                           boy.budget = gifts.get(0).price;
                           boy.moneySpend = gifts.get(0).price;
                       }
                       if(c!=0){
                            c--;
                            boy.moneySpend-=gifts.get(c).price;
                       }
                   }
                   else if(boy.type == 3){
                       c = 0;
                       while(boy.moneySpend <= boy.girlfriend.maintenanceBudget){
                           GenerateCsvData.generateGiftLog(boy,gifts.get(c));
                           boy.moneySpend += gifts.get(c).price;
                           c++;
                       }
                       if(c==0){
                           boy.budget = gifts.get(0).price;
                           boy.moneySpend = gifts.get(0).price;
                       }
                       if( (boy.budget - boy.moneySpend) >= gifts.get(c).price){
                           int n = gifts.size();
                           for(int i=c;i<n;i++){
                               if(gifts.get(i).price <= (boy.budget - boy.moneySpend) ){
                                   boy.moneySpend += gifts.get(i).price;
                                   GenerateCsvData.generateGiftLog(boy,gifts.get(i));
                                   break;
                               }
                           }
                       }
                   }
               }
           }
       }
}
class GiftComp implements Comparator<GIFTS>{
    @Override
    public int compare(GIFTS g1, GIFTS g2) {
        if(g1.price < g2.price){
            return 1;
        } else {
            return -1;
        }
    }
}

