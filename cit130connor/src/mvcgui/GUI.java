/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcgui;

import gui.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author connor.britton
 */
public class GUI {
     private static Frame mainFrame;
     private static Panel topPanel;
     private static Panel bottomPanel;
     private static Button button1;
     private static Button button2;
     private static Label instructionLabel;
     private static Label pushedButton1;
     private static Label pushedButton2;
     private static FlowLayout centeredText;
     private static Font labelFont;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIMaker();
        eventHandlers();
    }
    
    public static void GUIMaker(){
        // create project Frame(title)
        mainFrame = new Frame("AWT Simple Demo");
        
        // Set mainFrame layout
        mainFrame.setLayout(new GridLayout(1,2));
        
        // Set mainFrame size
        mainFrame.setSize(500,250);
        
        // Set the mainFrame as visible
        mainFrame.setVisible(true);
        
        // Program the exit Button
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }// Close windowClosing()
        }); // Close windowListener
        // create top & bottom Panels
        centeredText = new FlowLayout(FlowLayout.CENTER,35,35);
        topPanel = new Panel(centeredText);
        bottomPanel = new Panel(centeredText);
        // add Panels to mainFrame
        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.add(bottomPanel,BorderLayout.SOUTH);
        
        //create Buttons
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");
        button1.setForeground(Color.BLUE);
        button2.setForeground(Color.ORANGE);
        //add Button to topPanel
        topPanel.add(button1);
        topPanel.add(button2);
        
        //adjust the size of the Buttons
        Dimension buttonSize = new Dimension(175,55);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        
        //create Labels
        instructionLabel = new Label("Push A Button");
        pushedButton1 = new Label("You pushed Button 1");
        pushedButton2 = new Label("You pushed Button 2");
        
        //add instructionLabel to bottomPanel
        bottomPanel.add(instructionLabel);
        
        //create and set Label Font
        labelFont = new Font("",Font.PLAIN,25);
        instructionLabel.setFont(labelFont);
        pushedButton1.setFont(labelFont);
        pushedButton2.setFont(labelFont);
        
        pushedButton1.setForeground(Color.GREEN);
        pushedButton2.setForeground(Color.GREEN);
        
    }// Close GUIMaker
    
        public static void eventHandlers(){
        //EventHandler Button 1
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                System.out.println("Action: " + ae.getActionCommand());
                System.out.println("Source: " + ae.getSource());
                System.out.println("ModKeys:" + ae.getModifiers());
                bottomPanel.removeAll();
                bottomPanel.add(pushedButton1);
                mainFrame.setVisible(true);
            }// close actionPerformed
           }); // close button1.addActionListener
           
        //EventHandler Button 2
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                bottomPanel.removeAll();
                bottomPanel.add(pushedButton2);
                mainFrame.setVisible(true);
            }// close actionPerformed
          }); // close button2.addActionListener
       }
}// Close Class
