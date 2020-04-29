/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;

/**
 *
 * @author connor.britton
 */
public class CustomeObjectCollection {
    public static double totalPlayTime = 50;
    
    public static void main(String[] args) {
       LinkedList<GameItem> returnedList = createObjectList();
       if(returnedList != null){
           System.out.println("List size: " + returnedList.size());
           GameItem tempItem =  returnedList.get(0);
           System.out.println("Get the first item in list: " + tempItem.gameName);
           recordTime(tempItem);
       }
    }
    
    public static LinkedList<GameItem> createObjectList(){
        LinkedList<GameItem> lst = new LinkedList<>();
        GameItem item = new GameItem();
        item.gameName = "Brawlhalla";
        item.cost = 30.0;
        item.isHard = true;
        item.isPlaying = false;  
        
        lst.add(item);
        
        return lst;
    } // close createObejctMethod
    public static void recordTime(GameItem game){
       totalPlayTime = totalPlayTime + game.cost;
       System.out.println("Current play time with cost: " + totalPlayTime);
    }
} // close class

