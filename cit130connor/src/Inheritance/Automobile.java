/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author connor.britton
 */
public class Automobile extends Vehicle {
    public double engineSize;
    public int numWheels;
    
    private int wheelAngle = 0;
    
    public int turnWheel(int degrees){
        wheelAngle = wheelAngle + degrees;
        return wheelAngle;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
         sb.append("This is a automobile \n");
         sb.append("Vehicle wheels " + numWheels + "\n");
         sb.append("Current engine size is " + engineSize + "\n");
         sb.append("Current wheel angle is " + wheelAngle + "\n");
         return sb.toString();
    }
}
