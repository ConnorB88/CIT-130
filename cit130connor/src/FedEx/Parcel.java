/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FedEx;

/**
 * Models a fed-ex package
 * @author theep
 */
public class Parcel {
    private int sizeCubeInches;
    private double weightGrams;
    private boolean recovered;
    /**
     * @return the sizeCubeInches
     */
    public int getSizeCubeInches() {
        return sizeCubeInches;
    }

    /**
     * @param sizeCubeInches the sizeCubeInches to set
     */
    public void setSizeCubeInches(int sizeCubeInches) {
        this.sizeCubeInches = sizeCubeInches;
    }

    /**
     * @return the weightGrams
     */
    public double getWeightGrams() {
        return weightGrams;
    }

    /**
     * @param weightGrams the weightGrams to set
     */
    public void setWeightGrams(double weightGrams) {
        this.weightGrams = weightGrams;
    }

    /**
     * @return the recovered
     */
    public boolean isRecovered() {
        return recovered;
    }

    /**
     * @param recovered the recovered to set
     */
    public void setRecovered(boolean recovered) {
        this.recovered = recovered;
    }
}
