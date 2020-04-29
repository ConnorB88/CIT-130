/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameConfig;

import java.util.List;

/**
 *
 * @author theep
 */
public class SimulationConfig {
    private int audioCount;
    private int graphicsCount;
    private int optionsCount;
    private List<OptionsMenu> optionsList;

    /**
     * @return the audioCount
     */
    public int getAudioCount() {
        return audioCount;
    }

    /**
     * @param audioCount the audioCount to set
     */
    public void setAudioCount(int audioCount) {
        this.audioCount = audioCount;
    }

    /**
     * @return the graphicsCount
     */
    public int getGraphicsCount() {
        return graphicsCount;
    }

    /**
     * @param graphicsCount the graphicsCount to set
     */
    public void setGraphicsCount(int graphicsCount) {
        this.graphicsCount = graphicsCount;
    }

    /**
     * @return the optionsList
     */
    public List<OptionsMenu> getOptionsList() {
        return optionsList;
    }

    /**
     * @param optionsList the optionsList to set
     */
    public void setOptionsList(List<OptionsMenu> optionsList) {
        this.optionsList = optionsList;
    }

    /**
     * @return the optionsCount
     */
    public int getOptionsCount() {
        return optionsCount;
    }

    /**
     * @param optionsCount the optionsCount to set
     */
    public void setOptionsCount(int optionsCount) {
        this.optionsCount = optionsCount;
    }

    boolean setOptionsCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
