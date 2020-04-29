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
public class Balloon extends Vehicle{
    public double elevation;
    public boolean burnerOn;
    
    public double ascend(double feet){
        if (feet < 0){
            feet = feet * -1;
        }
        elevation = elevation + feet;
        return elevation;
    }
    public double descend(double feet){
        if (feet < 0){
            feet = feet * -1;
        }
        elevation = elevation - feet;
        return elevation;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
         sb.append("This is a balloon \n");
         sb.append("Current elevation is " + elevation + "\n");
         sb.append("Current status of burner is " + burnerOn + "\n");
         return sb.toString();
    }
}
