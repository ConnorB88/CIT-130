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
public class CameryCarRadio implements IFACE_carRadio{
    private double frequency;
    private boolean powerOn;
    private double[] presets;
    
    /** 
     * Constructor: special method called AUTOMATICALLY
     * by the JVM when clients create an instance of this class
     */
    public CameryCarRadio(){
        System.out.println("Inside constructor! constructing.....");
        // setup tasks, like create objects for memvars
        presets = new double[5];
        System.out.println("done constructing......");
    }
    
    
    public boolean isPowerOn(){
       return powerOn; 
    }
    @Override
    public void setTunerFrequency(double f){
       
       if (f > 108 || f < 88){
           System.out.println("KABOOM!");
       }else{
           frequency = f;
       }
    }
    public void setDevicePower(boolean powerStatus){
        powerOn = powerStatus;
        if(powerStatus){
            System.out.println("power on");
        }else{
            System.out.println("power off");
        }
    }
    
    private void createPresetArray(){
        presets = new double[6];
    }
    
    public void setTunerPreset(double freq, int preset){
          int idx = preset - 1;
          presets[idx] = freq;
    }
    
    public void visitTunerPreset(int preset){
        int idx = preset - 1;
        frequency = presets[idx];
    }
    
    public double displayCurrentTunerFeq(){
        System.out.println("Freq: " + frequency);
        
        return frequency;
    }
    public String pairBlueToothDevice(String mac){
        System.out.println("Pairing....");
        System.out.println("Paired to" + mac);
        return "Paired";
    }
}
