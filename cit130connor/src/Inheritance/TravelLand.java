/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 * Client class to demo our Vehicle hierarchy
 * @author connor.britton
 */
public class TravelLand {
    public static void main(String[] args){
        Vehicle veh1 = new Vehicle();
        
        
        Automobile auto1 = new Automobile();
        // memvars specfic to subclass
        auto1.engineSize = 1.8;
        auto1.numWheels = 16;
        // memvars coming from parent Vehicle
        auto1.speed = 45;
        
        Balloon bal = new Balloon();
        bal.burnerOn = true;
        bal.elevation = 120;
        bal.length = 6;
        bal.width = 6;
        
        System.out.println("Vehicle: " + veh1);
        System.out.println("Automobile: " + auto1);
        System.out.println("Balloon: " + bal);
        
        
        // I can store references to subclasses in
        // variable typed to a parent
        Vehicle v = new Balloon();
        v.length = 6000;
        v.width = 4;
        // I cannt store a reference to a parent objects
        // in a variable typed to the subclass
        // Balloon b = new Vehicle();
        
        // If I have a reference to a subtype in a parent-typed var
        // i need to type cast the reference back to subtype
        // to access the subtype methods
        
        // Check to see if v stores a reference to a Balloon object
        if(v instanceof Balloon){
        Balloon recoveredBalloon = (Balloon) v;
        }
    }
}
