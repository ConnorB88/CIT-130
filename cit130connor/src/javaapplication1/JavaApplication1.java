/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author theep
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyScan = new Scanner(System.in); 
     System.out.println("*************************************");
     
     System.out.println("Enter the number of ducks to yaks:");
     int response = keyScan.nextInt();
     int yaksConverted = duckConverter(response);
     System.out.println(response + " ducks equals " + yaksConverted + " yaks");
     System.out.println("*************************************");
     
     System.out.println("Enter the number of yards to covert to miles:");
     double response2 = keyScan.nextDouble();
     double milesConverted = convertYardsToMiles(response2);
     System.out.println(response2 + " yards eqauls " + milesConverted + " miles");
     System.out.println("*************************************");
     
     System.out.println("Enter the number of bangs to covert to bucks:");
     int response3 = keyScan.nextInt();
     int bucksConverted = bangsConverter(response3);
     System.out.println(response3 + " bangs eqauls " + bucksConverted + " bucks");
     System.out.println("*************************************");
    }
    
    public static int duckConverter(int duck){
        int yaks = duck * 3;
        return yaks;
    }
    
    public static double convertYardsToMiles(double yards){
        final double YARDS_PER_MILE = 1760.0;
        double miles = yards / YARDS_PER_MILE;
        return miles;
    }
    public static int bangsConverter(int bang){
        int bucks = bang * 17;
        return bucks;
    }
}
