/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolHiearchy;

import collections.GameItem;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author connor.britton
 */
public class PeopleLand {
    public static LinkedList<Person> vList;
    
    public static void main(String[] args){
     vList = new LinkedList<>();
     generateRandomPerson(3);
    }
    
    public static void generateRandomPerson(int numObs){
        Random rand = new Random();

        for(int i = 0; i < numObs; i++){ 
        Person p = new Person();
        p.setName(generateRandomName());
        p.setAlive(rand.nextBoolean());
        double age = rand.nextDouble() * Person.MAX_AGE;
        System.out.println("Random age: " + age);
        double height = rand.nextDouble() * Person.MAX_HEIGHT;
        System.out.println("Random height: " + height);
        double weight = rand.nextDouble() * Person.MAX_WEIGHT;
        System.out.println("Random weight: " + weight);
        vList.add(p);
       }
      System.out.println("Generated list of size: " + vList.size());
    }
    public static void generateRandomClassedPeople(int numObs){
        Random rand = new Random();
        
        ClassedPerson cp = new ClassedPerson();
    }
    public static void generateRandomStudents(int numObs){
        Random rand = new Random();
        
        Student s = new Student();
    }
    public static String generateRandomName(){
        Random rand = new Random();
        StringBuilder builder = new StringBuilder();
       
        String[] firstNames = {"Warren", "Jamie", "Benjamin", "Violet", "Jake", "Jax"};
        String[] lastNames = {"Ray", "Campbell", "Dunn", "Burke", "Walker", "Edwards"};
        builder.append(firstNames[rand.nextInt(firstNames.length)]);
        builder.append(" ");
        builder.append(lastNames[rand.nextInt(lastNames.length)]);
        return builder.toString();
    }
}
