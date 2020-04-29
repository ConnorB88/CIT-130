/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifaces;

/**
 *
 * @author connor.britton
 */
public interface IFACE_carRadio {
    // you could define constants
    
    // write method contracts ONLY, no guts
    /**
     * Specifies the tuner frequency in megahertz
     * If the user attempt to set freq outside FM band,
     * device should immediately explode
     * @param freq the frequency to which the tuner should listen
     */
    public void setTunerFrequency(double freq); // ; only no guts!
    
    public void setDevicePower(boolean powerStatus);
    
    public void setTunerPreset(double freq, int preset);
    
    public void visitTunerPreset(int preset);
    
    public double displayCurrentTunerFeq();
}
