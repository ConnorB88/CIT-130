/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FedEx;

import java.util.Scanner;

/**
 * Drives the command line interface for simulating a FedEx plane crashing
 * into the ocean
 * @author theep
 */
public class FedExCLI {
    
    public SimulationConfig prepareSimulationParams(SimulationConfig config){
        Scanner scan = new Scanner(System.in);  
        System.out.println("Welcome to the most horrifix fedex crash in history");
        System.out.println("How many crew on each plane?");
        config.setCrewSize(scan.nextInt());
        System.out.println("How many parcels on each plane?");
        config.setParcelCount(scan.nextInt());
        System.out.println("How many planes?");
        config.setPlaneCount(scan.nextInt());
        return config;
        
    }
    
    public void displaySimutlationResults(SimulationConfig config){
        System.out.println("Simulation Results");
        for(CargoPlane plane: config.getPlaneList()){
           System.out.println("******** Plane results ********");
              int numDead = 0;
            for(CrewMember cr: plane.getCrew()){
               System.out.println("Crew member age: " + cr.getAge());
         
                if(!cr.isSurvived()){
                    numDead++;
                }
            }
            System.out.println("Out of a crew size of " + plane.getCrew().size());
            System.out.println(" " + numDead + " did not survive!");
            int numRecovered = 0;
            for(Parcel p: plane.getParcels()){
                 System.out.println("Parcel recovered? " + p.isRecovered());
                if(p.isRecovered()){
                    numRecovered++;
                }
            }
                System.out.println("Of the " + plane.getParcels() + " parcels on board, ");
                System.out.println(" " + numRecovered + " were recovered");
             
          }
        }
    }

