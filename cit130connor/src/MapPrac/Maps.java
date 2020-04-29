/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author connor.britton
 */
public class Maps {
    public static void main(String[] args) {
        // Create a map object that associates a String-type
        // key with a String type value
        HashMap<String, String> expedMap = new HashMap<>();
        expedMap.put("Country","Austrilia");
        expedMap.put("Field","DataBase");
        expedMap.put("Language","English");
        expedMap.put("Duration","1 Month");
        expedMap.put("Risk","Spiders");
        expedMap.put("Logding","Hotel");
        
        //System.out.println("Map Status: " + expedMap.isEmpty());
        //System.out.println("Value of lodging key: " + expedMap.get("Logding"));
       // System.out.println("Is there a k-v pair keyed to duration? " + expedMap.containsKey("Duration"));
        printMapContents(expedMap);
        expedMap.put("Country", "South Africa");
        printMapContents(expedMap);
        expedMap.putIfAbsent("Country", "UAE");
        printMapContents(expedMap);
    }// close main
    
    public static void printMapContents(Map<String, String> mp){
        System.out.println("********* Printing map ********");
        // Step 1: Make sure the map is not empty
        if(!mp.isEmpty()){
            // Step 2: extract all the keys as a set (unordered)
           Set<String> keySet = mp.keySet();
           // so now we have a set of values: "country", "duration"....
           // use the advanced for loop to iterate over elements
           for(String s: keySet){
               System.out.print("Key: " + s);
               System.out.print(" | ");
               System.out.println("Value: " + mp.get(s) );
           }
        }
        
        
        // Step 3: Use the set of keys to look up their associated values for display
    }
}
