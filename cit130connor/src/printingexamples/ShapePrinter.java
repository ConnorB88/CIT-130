/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingexamples;

/**
 *
 * @author connor.britton
 */
public class ShapePrinter {
    public final String PRINTCHAR = "&";
    public final String PRINTCHAR2 = "@";
    public final String PRINTCHAR3 = "*";
     /**
      * Prints to console a square of characters
      * of an inputted side length.
      * Example: printBox(3) would result in<br>
      * &&&<br>
      * &&&<br>
      * &&&
      * 
      * @param sideLength 
      */
    public void printBox(int sideLength, int rowLength){
        System.out.println("Inside printBox, printing box of sideLength: " + sideLength);
        // use a for loop to make a row of size sideLength
      for(int i = 0; i < rowLength; i++){
   
       for(int j = 0; j < sideLength; j++){
            System.out.print(PRINTCHAR);
        }
         System.out.print("\n");
       }
    }
    public void printPyramid(int rowLength){
      for(int i = 0; i < rowLength; i++){
          
         for(int j = 0; j < i; j++){  
             
         System.out.print(PRINTCHAR2);
        }
         System.out.print("\n");
       }
    }
     public void printSymmetricPyramid(int rowLength){
      for(int i = 0; i < rowLength; i++){
          
         for(int j = 0; j < i; j++){
             
          if(i % 2 == 0){
           System.out.print(PRINTCHAR3);
          }
    
        }
        System.out.print("\n");
       }
    }
}
