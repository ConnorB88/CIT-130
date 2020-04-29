/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icon;

/**
 * Class models a 10x10 grid whose cells can be
 * colored or non-colored to represent an icon/image
 * @author connor.britton
 */
public class Icon {
    // mem var to store an array of booleans
    
    int[] firstLine;
    int[][] matrix;
    // ************* Constructor *************************
    // called when the object is created
    public Icon(){
       // Fill in member variables with appropiate values
       System.out.println("Inside constructor not taking any input");
       firstLine = null;
    };
    
    /**
     * Overloaded constructor for creating Icon objects
     * given an initial into the constructor
     * @return 
     */
    
    public Icon(int[] intArray){
        System.out.println("Inside constructor taking an array");
        firstLine = intArray;
    }
    // ********** METHODS **************************
    
    public String displayIcon(){
        StringBuilder ab = new StringBuilder();
        matrix = new int [10] [10];
        matrix[0][0] = 1;
        matrix[1][0] = 1;
        matrix[2][0] = 1;
        matrix[0][1] = 1;
        matrix[5][6] = 1;
        matrix[7][9] = 1;
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
             System.out.print("\n");
        }
     return ab.toString();   
    } // close displayIcon
    /**
     * Takes in a scale factor interpreted as : 1
     * means print only one character for each
     * cell turned "on" in the array. (Default)
     * 
     * A scale factor of 3 for example 
     * @param scaleFactor 
     */
    // method that takes in a scaling factor used by displayIcon
    public void scaleIcon(int scaleFactor){
        
    }
}
