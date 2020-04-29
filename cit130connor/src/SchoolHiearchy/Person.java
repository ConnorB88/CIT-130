/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolHiearchy;

/**
 *
 * @author connor.britton
 */
public class Person {
    final static double MAX_AGE = 90;
    final static double MAX_HEIGHT = 7;
    final static double MIN_HEIGHT = 4;
    final static double MAX_WEIGHT = 250;
    //final static boolean DEFAULT_LIFE = false;
    
    private String name;
    private double age;
    private double height;
    private double weight;
    private boolean isAlive;
    
     public void setName(String m){
        System.out.println(m);
    }
    public String getName(){
        return name;
    } 
    public void setAge(double m){  
        this.age = m;
    }
    public double getAge(){
        return age;
    } 
    public void setHeight(double m){
        this.height = m;
    }
    public double getHeight(){
        return height;
    } 
    public void setWeight(double m){
        
    }
    public double getWeight(){
        return weight;
    }
     public void setAlive(boolean m){
        System.out.println("Is alive: " + m);
    }
    public boolean getAlive(){
        return isAlive;
    }

    void getName(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
