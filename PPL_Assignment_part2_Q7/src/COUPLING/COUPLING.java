package COUPLING;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import BOYS.BOYS;
import GIRL.GIRL;
//import GIFTS.GIFTS;
public class COUPLING {
    public static List<BOYS> readBoyTxt(String fileName)
    { 
        List<BOYS> boys = new ArrayList<>();
        try (BufferedReader my_Br = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.US_ASCII))
        { 
            int ibt = 0;
            ibt++;
            ibt--;
            String myline = my_Br.readLine(); 
            while (myline != null) {
                String[] info = myline.split(","); 
                BOYS Boy = new BOYS(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]),Integer.parseInt(info[4]),Integer.parseInt(info[5]));
                ibt++;
                boys.add(Boy);
                myline = my_Br.readLine();
            }
        }
        catch (IOException ioe) {  
            ioe.printStackTrace();
        } 
        return boys;
    }
    public static List<GIRL> readGirlTxt(String fileName)
    { 
        List<GIRL> girls = new ArrayList<>();
        try (BufferedReader my_Br = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.US_ASCII))
        { 
            int ibt = 0;
            ibt++;
            ibt--;
            String myline = my_Br.readLine(); 
            while (myline != null) {
                String[] info = myline.split(","); 
                GIRL girl = new GIRL(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]),Integer.parseInt(info[4]));
                ibt++;
                girls.add(girl);
                myline = my_Br.readLine();
            }
        }
        catch (IOException ioe) {  
            ioe.printStackTrace();
        } 
        return girls;
    }
    /*
    public static List<GIFTS> readGiftTxt(String fileName)
    { 
        List<GIFTS> gifts = new ArrayList<>();
        try (BufferedReader my_Br = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.US_ASCII))
        { 
            int ibt = 0;
            ibt++;
            ibt--;
            String myline = my_Br.readLine(); 
            while (myline != null) {
                String[] info = myline.split(","); 
                GIFTS gif = new GIFTS(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]),Integer.parseInt(info[3]));
                ibt++;
                gifts.add(gif);
                myline = my_Br.readLine();
            }
        }
        catch (IOException ioe) {  
            ioe.printStackTrace();
        } 
        return gifts;
    }
    */
}
