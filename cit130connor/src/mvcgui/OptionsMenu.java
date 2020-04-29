/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;

import GameConfig.*;
import java.util.List;

/**
 *
 * @author theep
 */
public class OptionsMenu {
     private List<AudioLevel> audio;
     private List<Graphics> graphics;

    /**
     * @return the audio
     */
    public List<AudioLevel> getAudio() {
        return audio;
    }

    /**
     * @param audio the audio to set
     */
    public void setAudio(List<AudioLevel> audio) {
        this.audio = audio;
    }

    /**
     * @return the graphics
     */
    public List<Graphics> getGraphics() {
        return graphics;
    }

    /**
     * @param graphics the graphics to set
     */
    public void setGraphics(List<Graphics> graphics) {
        this.graphics = graphics;
    }
}
