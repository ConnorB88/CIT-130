/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FedEx;

import java.util.List;

/**
 *
 * @author theep
 */
public class SimulationConfig {
    private int crewSize;
    private int parcelCount;
    private int planeCount;
    
    private List<CargoPlane> planeList;

    /**
     * @return the crewSize
     */
    public int getCrewSize() {
        return crewSize;
    }

    /**
     * @param crewSize the crewSize to set
     */
    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    /**
     * @return the parcelCount
     */
    public int getParcelCount() {
        return parcelCount;
    }

    /**
     * @param parcelCount the parcelCount to set
     */
    public void setParcelCount(int parcelCount) {
        this.parcelCount = parcelCount;
    }

    /**
     * @return the planeCount
     */
    public int getPlaneCount() {
        return planeCount;
    }

    /**
     * @param planeCount the planeCount to set
     */
    public void setPlaneCount(int planeCount) {
        this.planeCount = planeCount;
    }

    /**
     * @return the planeList
     */
    public List<CargoPlane> getPlaneList() {
        return planeList;
    }

    /**
     * @param planeList the planeList to set
     */
    public void setPlaneList(List<CargoPlane> planeList) {
        this.planeList = planeList;
    }
}
