/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;

import gui.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author theep
 */
public class HandleEvent extends JFrame {
    // Step 1: Create sub-objects (i.e constructors)
     private JButton buttonOK = new JButton("Ok");
     private JButton buttonCancel = new JButton("Cancel");
     
     public HandleEvent(){
      
        // Setp 2: Create Panel to hold buttons
        JPanel panel = new JPanel();
        panel.add(buttonCancel);
        panel.add(buttonOK);
        
        // we call the add() method on JFrame
        add(panel);
        
        // Register the listener classes (which implement the listener methods)
        ButtonOkListener bok = new ButtonOkListener();
        ButtonCancelListener bcncl = new ButtonCancelListener();
        // CODE TO INTEREFACES
        // tell the buttons which methods to call when clicked(by giving the class that implements the ActionListener
        // interface)
        buttonOK.addActionListener(bok);
        buttonOK.addActionListener(bcncl);
    }// close constructor
     
     
    public static void main(String[] args){
      JFrame myFrame = new HandleEvent();
      myFrame.setTitle("Practice Swing Stuff");
      myFrame.setSize(500,500);
      myFrame.setLocation(231,411);
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
      myFrame.setVisible(true);
   }
    
    // Ok Button when Clicked
    class ButtonOkListener implements ActionListener {
    private int toggle = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked the OK button!");
        toggle++;
        if(toggle % 2 == 0){
             buttonCancel.setText("Don't Change me!");
        }else{
            buttonCancel.setText("Cancel");
        }
    }
    
}// Close Listener inner Class
    // Cancel Button when clicked
class ButtonCancelListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You canceled me!");
    }
  }// Close Listener inner Class

}// Close class



