
package LoggingUtility;

import BOYS.BOYS;
//import GIFTS.GIFTS;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class GenerateCsvData {    
    public static void generateBoys()throws Exception{
        String FILENAME = "Boys.txt";
        for(int i=1 ; i<=10 ; i++){
            String s = "B" + i + "," + ThreadLocalRandom.current().nextInt(4, 11) + "," + ThreadLocalRandom.current().nextInt(105,130) + "," + ThreadLocalRandom.current().nextInt(2000,3000) + "," + ThreadLocalRandom.current().nextInt(3,10) + "," + ThreadLocalRandom.current().nextInt(1,4);
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))){
                bw.write(s);
                bw.newLine();
            }catch (IOException e) {
		e.printStackTrace();
            }
        }
    }
    public static void generateGirls()throws Exception{
        String FILENAME = "Girls.txt";
        for(int i=1 ; i<=5 ; i++){
            String s = "G" + i + "," + ThreadLocalRandom.current().nextInt(4, 11) + "," + ThreadLocalRandom.current().nextInt(105,130) + "," + ThreadLocalRandom.current().nextInt(2000,3000) + "," + ThreadLocalRandom.current().nextInt(1,4);
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))){
                bw.write(s);
                bw.newLine();
            }catch (IOException e) {
		e.printStackTrace();
            }
        }
    }
    public static void generateGifts()throws Exception{
        String FILENAME = "Gifts.txt";
        for(int i=1 ; i<=20 ; i++){
            String s = "G" + i + "," + ThreadLocalRandom.current().nextInt(500,2500) + "," + ThreadLocalRandom.current().nextInt(1000,2000) + "," + ThreadLocalRandom.current().nextInt(1,4);
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))){
                bw.write(s);
                bw.newLine();
            }catch (IOException e) {
		e.printStackTrace();
            }
        }
    }
    public static void generateCoupleFormedLog(String FILENAME,String s)throws Exception{
                    DateFormat dateF = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Date date = new Date();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
			s += " at time instance: " + dateF.format(date);
			bw.write(s);
                        bw.newLine();
                        } catch (IOException e) {
			e.printStackTrace();
                    }
    }
    /*
    public static void generateGiftLog(BOYS b, GIFTS gift){
        String FILENAME = "GiftsLog.txt";
            String s =b.name + " gifted his girlfriend" + b.girlfriend.name + " " + gift.name ;     
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))){
                bw.write(s);
                bw.newLine();
            }catch (IOException e) {
		e.printStackTrace();
            }
    }
     */
}
