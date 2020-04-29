/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;

import GameConfig.*;

/**
 *
 * @author theep
 */
public class AudioLevel {
    private int masterVolume;
    private int musicVolume;
    private int SFXVolume;
    private int voiceVolume;
    private int ambientVolume;

    /**
     * @return the masterVolume
     */
    public int getMasterVolume() {
        return masterVolume;
    }

    /**
     * @param masterVolume the masterVolume to set
     */
    public void setMasterVolume(int masterVolume) {
        this.masterVolume = masterVolume;
    }

    /**
     * @return the musicVolume
     */
    public int getMusicVolume() {
        return musicVolume;
    }

    /**
     * @param musicVolume the musicVolume to set
     */
    public void setMusicVolume(int musicVolume) {
        this.musicVolume = musicVolume;
    }

    /**
     * @return the SFXVolume
     */
    public int getSFXVolume() {
        return SFXVolume;
    }

    /**
     * @param SFXVolume the SFXVolume to set
     */
    public void setSFXVolume(int SFXVolume) {
        this.SFXVolume = SFXVolume;
    }

    /**
     * @return the voiceVolume
     */
    public int getVoiceVolume() {
        return voiceVolume;
    }

    /**
     * @param voiceVolume the voiceVolume to set
     */
    public void setVoiceVolume(int voiceVolume) {
        this.voiceVolume = voiceVolume;
    }

    /**
     * @return the ambientVolume
     */
    public int getAmbientVolume() {
        return ambientVolume;
    }

    /**
     * @param ambientVolume the ambientVolume to set
     */
    public void setAmbientVolume(int ambientVolume) {
        this.ambientVolume = ambientVolume;
    }
}
