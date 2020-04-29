/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Exception Text Class
 * @author theep
 */
public class ExceptionSandbox {
    private static List<Vector> vectList;
    
    public static void main(String[] args) {
        createVectorModel();
    }// close main
    private static void createVectorModel(){
        int userVal = 0;
        try{
             userVal = gatherUserInput();
        }catch(InputMismatchException | SimulationException ex){
            System.out.println("Exception caught: " + ex.getClass().getName());
            System.out.println("Wacko answers result in override to 10");
            userVal = 10;
        }
       if(userVal <= 0){
           System.out.println("Cannont simulate nothin'.. overide to 10");
           userVal = 10;
       }
       createVectorList(userVal);
       displayVectorList();
    }
    private static int gatherUserInput() throws InputMismatchException, SimulationException{
        Scanner s = new Scanner(System.in);
        System.out.println("How many Vectors shall I assemble?");
        int numVectors = 0;
        numVectors = s.nextInt();
      if(numVectors <= 0){
          throw new  SimulationException();
      }
        return numVectors;
    }
   
    
    private static void displayVectorList(){
        try{
        for (Vector v: vectList){
            System.out.println("Vector risk: " + v.transmissionRisk);
        }
        }catch(InputMismatchException npe){
            System.out.println("I cannot print a null list!!");
        }
    }

    private static void createVectorList(int n) {
        vectList = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < n; i++){
            Vector v = new Vector();
            v.transmissionRisk = r.nextDouble();
            vectList.add(v);
        }
    }
     static class Vector{
        double transmissionRisk;
    }
    
}
