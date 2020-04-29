/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FedEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *Controller object for fed-ex plane crash simulator using the
 * MVC design pattern a la the gang of four
 * @author theep
 */
public class FedExController {
    private static  FedExPlaneModel model;
    
    private static FedExCLI view;
    
    public static void main(String[] args) {
        model = new FedExPlaneModel();
        view = new FedExCLI();
        // setup config with help from view
       SimulationConfig config = initSimulation();
       // run sim
       config = runSim(config);
       view.displaySimutlationResults(config);
    }
    
    
    private static SimulationConfig initSimulation(){
        SimulationConfig config = view.prepareSimulationParams(new SimulationConfig());
        if(config.getCrewSize() < 1){
            config.setCrewSize(10);
        }
        if(config.getParcelCount() < 1){
            config.setParcelCount(1000);
        }
        if(config.getPlaneCount() < 1){
            config.setPlaneCount(5);
        }
        return config;
    }
    
    private static SimulationConfig runSim(SimulationConfig config){
        List<CargoPlane> planeList = new ArrayList<>();
        // based on inputted params, ask model for objects
        for(int i = 0; i < config.getPlaneCount(); i++){
            // each plane in this sim has the same number of crew and parcels
            planeList.add(model.generateCargoPlane(config.getCrewSize(), config.getParcelCount()));
        }
        for(CargoPlane pl: planeList){
            pl.setCrew(simulateCrewSurvival(pl.getCrew()));
            pl.setParcels(simulateParcelRecovery(pl.getParcels()));
        }
      config.setPlaneList(planeList);
      return config;
    }
     private static List<CrewMember> simulateCrewSurvival(List<CrewMember> crewList){
         Random r = new Random();
           for(CrewMember cr: crewList){
               if(cr.getAge() > 50){
                 cr.setSurvived(r.nextBoolean());
               }else{
                   if(r.nextDouble() > .75){
                       cr.setSurvived(false);
                   }else{
                       cr.setSurvived(true);
                   }
               }
           }
           return crewList;
     }
     
     private static List<Parcel> simulateParcelRecovery(List<Parcel> pList){
        for(Parcel p: pList){
            double parcelDensity = p.getWeightGrams() / p.getSizeCubeInches();
            System.out.println("Parcel density: " + parcelDensity);
            if(parcelDensity > FedExPlaneModel.WEIGHT_H20_GRAMPERINCH3){
                p.setRecovered(false);
            } else {
                p.setRecovered(true);
            }
        }
        return pList;
       }
     
}
