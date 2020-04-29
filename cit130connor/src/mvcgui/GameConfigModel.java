/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;
import GameConfig.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author theep
 */
public class GameConfigModel {
     final static int MAX_MASTER_VOLUME = 21;
     final static int MAX_MUSIC_VOLUME = 21;
     final static int MAX_SFX_VOLUME = 21;
     final static int MAX_VOICE_VOLUME = 21;
     final static int MAX_AMBIENT_VOLUME = 21;   
     
     final static int MIN_MASTER_VOLUME = 0;
     final static int MIN_MUSIC_VOLUME = 0;
     final static int MIN_SFX_VOLUME = 0;
     final static int MIN_VOICE_VOLUME = 0;
     final static int MIN_AMBIENT_VOLUME = 0;
     
     public OptionsMenu generateOptionsMenu(int audioNum, int graphicNum){
             OptionsMenu menu = new OptionsMenu();
             menu.setAudio(generateAudioList(audioNum));
             menu.setGraphics(generateGraphicsList(graphicNum));
             return menu;
     }
     
    private List<AudioLevel> generateAudioList(int numAudio){
        List<AudioLevel> audioList = new ArrayList<>();
        Random rand = new Random();
        // generate random audio levels
        for(int c = 0; c < numAudio; c++){
            int b = rand.nextInt(MAX_MASTER_VOLUME);
            int l = rand.nextInt(MAX_MUSIC_VOLUME);
            int d = rand.nextInt(MAX_SFX_VOLUME);
            int e = rand.nextInt(MAX_VOICE_VOLUME);
            int f = rand.nextInt(MAX_AMBIENT_VOLUME);
             AudioLevel audio= new AudioLevel();
            if(b >= MIN_MASTER_VOLUME){
                audio.setMasterVolume(b);
            }else{
                audio.setMasterVolume(b + MIN_MASTER_VOLUME);
            }
            if(l >= MIN_MUSIC_VOLUME){
                audio.setMusicVolume(l);
            }else{
                audio.setMusicVolume(l + MIN_MUSIC_VOLUME);
            }
            if(d >= MIN_SFX_VOLUME){
                audio.setSFXVolume(d);
            }else{
                audio.setSFXVolume(d + MIN_SFX_VOLUME);
            }
            if(e >= MIN_VOICE_VOLUME){
                audio.setVoiceVolume(e);
            }else{
                audio.setVoiceVolume(e + MIN_VOICE_VOLUME);
            }
            if(f >= MIN_AMBIENT_VOLUME){
                audio.setAmbientVolume(f);
            }else{
                audio.setAmbientVolume(f + MIN_AMBIENT_VOLUME);
            }
            audioList.add(audio);
        }
        return audioList;
    }
     private List<Graphics> generateGraphicsList(int numGraphic){
        List<Graphics> graphicsList = new ArrayList<>();
         Random rand = new Random();
         // generate random strings / booleans
          for (int i = 0; i < numGraphic; i++){
           Graphics g = new Graphics();
           g.setGraphicsChosen(rand.nextInt(Graphics.getGraphicsQuality().length));
           g.setResolultionChosen(rand.nextInt(Graphics.getResoultion().length));
           g.setWindowChosen(rand.nextInt(Graphics.getWindowMode().length));
           
           g.setFilmGrain(rand.nextBoolean());
           g.setLightShafts(rand.nextBoolean());
           g.setMotionBlur(rand.nextBoolean());
           graphicsList.add(g);
          }
        return graphicsList;
    }
}
