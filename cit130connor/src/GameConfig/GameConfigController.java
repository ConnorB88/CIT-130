/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameConfig;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author theep
 */
public class GameConfigController {

    private static GameConfigModel model;

    private static GameConfigCLI view;

    public static void main(String[] args) throws InputMismatchException, SimulationException {
        model = new GameConfigModel();
        view = new GameConfigCLI();
        SimulationConfig config = initSimulation();
        config = runSim(config);
        view.displaySimulationResults(config);
    }

    private static SimulationConfig initSimulation() {
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
                if (config.getGraphicsCount() > 6) {
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
        return config;
    }

    private static SimulationConfig runSim(SimulationConfig config) {
        List<OptionsMenu> menuList = new ArrayList<>();

        for (int i = 0; i < config.getOptionsCount(); i++) {
            menuList.add(model.generateOptionsMenu(config.getAudioCount(), config.getGraphicsCount()));
        }
        config.setOptionsList(menuList);
        return config;
    }
}
