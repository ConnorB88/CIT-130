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
public class Vehicle {
     public double speed;
     public double length;
     public double width;
     private boolean vehOn;
     
     public void start(){
         System.out.println("Vehicle started!");
     }
     public void stop(){
         System.out.println("Vehicle stopped!");
         vehOn = false;
     }
     
     public String toString(){
         StringBuilder sb = new StringBuilder();
         sb.append("This is a Vehicle \n");
         sb.append("Vehicle status" + vehOn + "\n");
         sb.append("Current speed is " + speed + "\n");
         return sb.toString();
     }
}
