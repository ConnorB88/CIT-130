/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;

import GameConfig.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author theep
 */
public class GameConfigCLI {
    
      public static SimulationConfig prepareSimulationParams(SimulationConfig config) throws InputMismatchException, SimulationException{
        Scanner scan = new Scanner(System.in); 
        System.out.println("How many option menues do you want to change?");
        config.setOptionsCount(scan.nextInt());
        System.out.println("How many times do you want to change audio levels options?");
        config.setAudioCount(scan.nextInt());
        System.out.println("How many times do you want to change the graphics options?");
        config.setGraphicsCount(scan.nextInt());
        return config;
    }
      
     public void displaySimulationResults(SimulationConfig config){
         //System.out.println("Generated Results:");
         System.out.println("Options Menu:");
         
         for(OptionsMenu menu: config.getOptionsList()){
             System.out.println(" ");
             for(AudioLevel au: menu.getAudio()){
                 System.out.println("***********Generated Audio levels**************");
                 System.out.println("Generated Master volume: " + au.getMasterVolume());
                 System.out.println("Generated Music volume: " + au.getMusicVolume());
                 System.out.println("Generated SFX volume: " + au.getSFXVolume());
                 System.out.println("Generated Voice volume: " + au.getVoiceVolume());
                 System.out.println("Generated Ambient volume: " + au.getAmbientVolume());
             }
            for(Graphics g: menu.getGraphics()){
                System.out.println("***********Generated Graphics Options*************");
               switch(g.getResolultionChosen()){
                   case 0: System.out.println("Generated resoultion: 2560x1600");
                   break;
                   case 1: System.out.println("Generated resolution: 1920x1080");
                   break;
                   case 2: System.out.println("Generated resolution: 1680x1050");
                   break;
                   case 3: System.out.println("Generated resolution: 1600x900");
                   break;
                   case 4: System.out.println("Generated resoultion: Custom");
                   break;
               }
               switch(g.getWindowChosen()){
                   case 0: System.out.println("Generated window: WindowedFullscreen");
                   break;
                   case 1: System.out.println("Generated window: FullScreen");
                   break;
                   case 2: System.out.println("Generated window: Windowed");
                   break;
               }
               switch(g.getGraphicsChosen()){
                   case 0: System.out.println("Generated quality: Epic");
                   break;
                   case 1: System.out.println("Generated quality: High");
                   break;
                   case 2: System.out.println("Generated quality: Medium");
                   break;
                   case 3: System.out.println("Generated quality: Low");
                   break;
               }
                if(g.isMotionBlur()){
                   System.out.println("Generated Motion Blur: ON");
                }else{
                     System.out.println("Generated Motion Blur: OFF");
                }
                 if(g.isFilmGrain()){
                   System.out.println("Generated Film Grain: ON");
                }else{
                     System.out.println("Generated Film Grain: OFF");
                }
                  if(g.isLightShafts()){
                   System.out.println("Generated Light Shafts: ON");
                }else{
                     System.out.println("Generated Light Shafts: OFF");
                }
            }
         }
     }
}
