/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;

import GameConfig.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author theep
 */
public class GameConfigController {

    private static GameConfigModel model;

    private static GameConfigCLI view;

    private  CustomGUI mainGUIFrame;
    
    private static GameConfigController controller;
    
    public static void main(String[] args) throws InputMismatchException, SimulationException {
        model = new GameConfigModel();
        view = new GameConfigCLI();
        controller = new GameConfigController();
        controller.initGUI();
    }

    public void initGUI() {
      mainGUIFrame = new CustomGUI();
      mainGUIFrame.setController(controller);
      mainGUIFrame.setTitle("Options Menu");
      mainGUIFrame.setSize(1000,1000);
      mainGUIFrame.setLocation(500,0);
      mainGUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainGUIFrame.setVisible(true);
     }
    
    
  
    public SimulationConfig initSimulation() {
        SimulationConfig config = null;
        boolean configInComplete = true;
        // while() only after everything is complete
        while (configInComplete) {
           // System.out.println("Value of config incomplete: " + configInComplete);
            try {
                config = view.prepareSimulationParams(new SimulationConfig());
                if (config.getAudioCount() < 1) {
                    throw new SimulationException();
                }
                if (config.getAudioCount() > 5) {
                    throw new SimulationException();
                }
                if (config.getGraphicsCount() < 1) {
                    throw new SimulationException();
                }
                if (config.getGraphicsCount() > 5) {
                    throw new SimulationException();
                }
                if (config.getOptionsCount() > 1) {
                    throw new SimulationException();
                }
                if (config.getOptionsCount() < 1) {
                    throw new SimulationException();
                }
                configInComplete = false;
            } catch (InputMismatchException | SimulationException ex) {
                System.out.println("Invalid Input!");
                //System.exit(0);
            } // close try catch()
            //System.out.println("Value of config incomplete: " + configInComplete);
        } // close while()
        runSim(config);
        view.displaySimulationResults(config);
        return config;
    }
  
   public SimulationConfig runSim(SimulationConfig config) {
        List<OptionsMenu> menuList = new ArrayList<>();
        //config.setOptionsCount(1);
        config.setAudioCount(1);
        config.setGraphicsCount(1);
        menuList.add(model.generateOptionsMenu(config.getAudioCount(), config.getGraphicsCount()));
        config.setOptionsList(menuList);
        return config;
    }
}
