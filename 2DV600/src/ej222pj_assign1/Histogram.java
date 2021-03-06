/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Histogram.java
 */
package ej222pj_assign1;

import java.io.File;
import java.util.Scanner;

/**
 * @author Eric
 *
 * @date 5 sep 2016 : @time 21:53:11
 *
 */
public class Histogram {

	public static void main(String[] args) throws Exception{
		int toTen = 0;
        int toTwenty = 0;
        int toThirty = 0;
        int toFourty = 0;
        int toFifty = 0;
        int toSixty = 0;
        int toSeventy = 0;
        int toEighty = 0;
        int toNinety = 0;
        int toHundred = 0;
        int toTwoHundred = 0;

        try{
            String path = "";

            if (args[0] != null){
                path = args[0].toString();
            }
            else{
            	throw new Exception("No Path!");
            }
            File numbersFile = new File(path);
            Scanner ScannerInput = new Scanner(numbersFile);

            while(ScannerInput.hasNext()){
                if(ScannerInput.hasNextInt()){
                    int currentNumber = ScannerInput.nextInt();

                    if(currentNumber >= 1 && currentNumber <= 200){
                        if(currentNumber <= 10) toTen++;
                        else if(currentNumber <= 20) toTwenty++;
                        else if(currentNumber <= 30) toThirty++;
                        else if(currentNumber <= 40) toFourty++;
                        else if(currentNumber <= 50) toFifty++;
                        else if(currentNumber <= 60) toSixty++;
                        else if(currentNumber <= 70) toSeventy++;
                        else if(currentNumber <= 80) toEighty++;
                        else if(currentNumber <= 90) toNinety++;
                        else if(currentNumber <= 100) toHundred++;
                        else if(currentNumber <= 200) toTwoHundred++;
                    }
                }
                else{
                	ScannerInput.next();
                }
            }
            ScannerInput.close();
            printOut("1-10    | ", toTen);
            printOut("11-20   | ", toTwenty);
            printOut("21-30   | ", toThirty);
            printOut("31-40   | ", toFourty);
            printOut("41-50   | ", toFifty);
            printOut("51-60   | ", toSixty);
            printOut("61-70   | ", toSeventy);
            printOut("71-80   | ", toEighty);
            printOut("81-90   | ", toNinety);
            printOut("91-100  | ", toHundred);
            printOut("101-200 | ", toTwoHundred);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
	}
	
	public static void printOut(String interval, int howMany){
		System.out.print(interval);
    	System.out.println(String.format("%1$0"+howMany+"d", 0, 0).replace("0", "*"));
	}
}
