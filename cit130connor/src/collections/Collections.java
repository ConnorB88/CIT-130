/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author connor.britton
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        useArrays();
        useCollections();
    } // close main
    
    public static void useArrays(){
        String[] GameItems = {"Brawlhalla", "Smite", "Darkest Dungeon", "Minecraft", "Dauntless", "Dark Souls"};
        
        //System.out.println("Array implementation:");
        // display size:
        //System.out.println("Size of array: " + GameItems.length);
        //System.out.println("Third item: " + GameItems[2]);
        //System.out.println("Last item: " + GameItems[GameItems.length - 1]);
        //printArrayContents(GameItems);
        //System.out.println("Trying to remove Minecraft");
        //GameItems[1] = null;
        //System.out.println("Made minecraft null");
       // printArrayContents(GameItems);
    } // close useArrays
    
    private static void printArrayContents(String[] arr){
        // print me with a for() loop
        //String[] GameItems = {"Brawlhalla", "Smite", "Darkest Dungeon", "Minecraft", "Dauntless", "Dark Souls"};
        //for(int i = 0; i < arr.length; i++){
           // System.out.println(arr[i]);
       // }
    }
    
    public static void useCollections(){
        LinkedList<String> gameList = new LinkedList<>();
        //original list strucuture
        gameList.add("Brawlhalla");
        gameList.add("Smite");
        gameList.add("Darkest Dungeon");
        gameList.add("Minecraft");
        gameList.add("Dauntless");
        gameList.add("Dark Souls");
        //end original list structure
        
        // get minecraft to top
        // remove index and then push 
        gameList.remove("Dark Souls");
        gameList.push("Dark Souls");
        gameList.remove("Smite");
        gameList.push("Smite");
       gameList.remove("Minecraft");
       gameList.push("Minecraft");
        gameList.remove("Dauntless");
        gameList.remove("Darkest Dungeon");
        
        
        
        printListContents(gameList);
        
        
        
        //System.out.println("*****************************");
        //System.out.println("Collections implementation: ");
        //System.out.println("List Length: " + gameList.size());
        //System.out.println("Third Item: " + gameList.get(2));
        //System.out.println("Third Item: " + gameList.getLast());
        //printListContents(gameList);
        //gameList.remove();
        //System.out.println("****** Called remove() ******");
        //printListContents(gameList);
        //gameList.remove("Minecraft");
        //System.out.println("****** Called remove('Minecraft;) ******");
        //printListContents(gameList);
        
    }
    
    private static void printListContents(LinkedList<String> lst){
        // extract an iterator from the List
        ListIterator iter = lst.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
}// close class
