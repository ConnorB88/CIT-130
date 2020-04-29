/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameConfig;
import java.util.Random;
/**
 *
 * @author theep
 */
public class Graphics {
    private static String[] resoultion = {"2560x1600", "1920x1080", "1680x1050", "1600x900", "Custom"};
    private static String[] windowMode = {"WindowedFullscreen", "FullScreen", "Windowed"};
    private static String[] graphicsQuality = {"Epic", "High", "Medium", "Low" };
    private int resolultionChosen;
    private int windowChosen;
    private int graphicsChosen;
    private boolean motionBlur;
    private boolean filmGrain;
    private boolean lightShafts;

    /**
     * @return the resoultion
     */
    public static String[] getResoultion() {
        return resoultion;
    }

    /**
     * @param aResoultion the resoultion to set
     */
    public static void setResoultion(String[] aResoultion) {
        resoultion = aResoultion;
    }

    /**
     * @return the windowMode
     */
    public static String[] getWindowMode() {
        return windowMode;
    }

    /**
     * @param aWindowMode the windowMode to set
     */
    public static void setWindowMode(String[] aWindowMode) {
        windowMode = aWindowMode;
    }

    /**
     * @return the graphicsQuality
     */
    public static String[] getGraphicsQuality() {
        return graphicsQuality;
    }

    /**
     * @param aGraphicsQuality the graphicsQuality to set
     */
    public static void setGraphicsQuality(String[] aGraphicsQuality) {
        graphicsQuality = aGraphicsQuality;
    }

    /**
     * @return the motionBlur
     */
    public boolean isMotionBlur() {
        return motionBlur;
    }

    /**
     * @param motionBlur the motionBlur to set
     */
    public void setMotionBlur(boolean motionBlur) {
        this.motionBlur = motionBlur;
    }

    /**
     * @return the filmGrain
     */
    public boolean isFilmGrain() {
        return filmGrain;
    }

    /**
     * @param filmGrain the filmGrain to set
     */
    public void setFilmGrain(boolean filmGrain) {
        this.filmGrain = filmGrain;
    }

    /**
     * @return the lightShafts
     */
    public boolean isLightShafts() {
        return lightShafts;
    }

    /**
     * @param lightShafts the lightShafts to set
     */
    public void setLightShafts(boolean lightShafts) {
        this.lightShafts = lightShafts;
    }

    /**
     * @return the resolultionChosen
     */
    public int getResolultionChosen() {

        return resolultionChosen;
    }

    /**
     * @param resolultionChosen the resolultionChosen to set
     */
    public void setResolultionChosen(int resolultionChosen) {
        this.resolultionChosen = resolultionChosen;
    }

    /**
     * @return the windowChosen
     */
    public int getWindowChosen() {
        return windowChosen;
    }

    /**
     * @param windowChosen the windowChosen to set
     */
    public void setWindowChosen(int windowChosen) {
        this.windowChosen = windowChosen;
    }

    /**
     * @return the graphicsChosen
     */
    public int getGraphicsChosen() {
        return graphicsChosen;
    }

    /**
     * @param graphicsChosen the graphicsChosen to set
     */
    public void setGraphicsChosen(int graphicsChosen) {
        this.graphicsChosen = graphicsChosen;
    }
}
