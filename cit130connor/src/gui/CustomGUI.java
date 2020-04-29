/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ComboBox;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import static sun.security.krb5.KrbException.errorMessage;
/**
 *
 * @author theep
 */
public class CustomGUI extends JFrame{
        private static JPanel Panel1;
        private static JPanel Panel2;
        private static JPanel Panel3;
        private static JPanel Panel4;
        private static JPanel Panel5;
        private static JPanel Panel6;
        private static JPanel Panel7;
        private static JPanel Panel8;
        private static JPanel Panel9;
        private static JPanel Panel10;
        private static JPanel Panel11;
        private static JPanel Panel12;
        private static JPanel Panel13;
        private static JPanel Panel14;
        private static JPanel Panel15;
        private static JPanel Panel16;
        private static JSlider masterVolume;
        private static JSlider SFXVolume;
        private static JSlider voiceVolume;
        private static JSlider ambientVolume;
        private static JLabel slideMaster;
        private static JLabel Line;
        private static JLabel Line2;
        private static JSlider musicVolume;
        private static JLabel slideMusic;
        private static JLabel slideSFX;
        private static JLabel slideVoice;
        private static JLabel slideAmbient;
        private static JLabel options;
        private static JLabel motion;
        private static JLabel film;
        private static JLabel shafts;
        private static Font Font1;
        private static Font Font2;
        private static Font Font3;
        private static JLabel audio;
        private static JLabel graphics;
        private static JComboBox resoultion;
        private static JComboBox window;
        private static JLabel resoultionText;
        private static String[] messageStrings = {"2560x1600", "1920x1080", "1680x1050", "1600x900", "Custom"};
        private static JTextField resolutionTextField1;
        private static JTextField resolutionTextField2;
        private static JLabel X;
        private static String[] windowMode = {"WindowedFullscreen", "FullScreen", "Windowed"};
        private static JLabel windowModeText;
        private static JLabel graphicsText;
        private static String[] graphicsQuality = {"Epic", "High", "Medium", "Low" };
        private static JComboBox quality;
        private static JCheckBox checkBox1;
        private static JCheckBox checkBox2;
        private static JCheckBox checkBox3;
        private static JButton apply;
        int value;
        int value2;
        int value3;
        int value4;
        int value5;
        
    public CustomGUI(){
        setLayout(new GridLayout(17,1));
   
        Font1 = new Font("",Font.BOLD,50);
        Font2 = new Font("serif",Font.PLAIN,20);
        Font3 = new Font("serif",Font.BOLD,30);
          options = new JLabel("Options");
          options.setFont(Font1);
          options.setForeground(Color.BLUE);
          add(options);
          
           slideMaster = new JLabel("Master Volume: 0");
           slideMaster.setFont(Font2);
      
           masterVolume = new JSlider(JSlider.HORIZONTAL,0,20,0);
           masterVolume.setMajorTickSpacing(5);
           masterVolume.setPaintTicks(true);
           
           slideMusic = new JLabel("Music Volume: 0");
           slideMusic.setFont(Font2);
           
           musicVolume = new JSlider(JSlider.HORIZONTAL,0,20,0);
           musicVolume.setMajorTickSpacing(5);
           musicVolume.setPaintTicks(true);
          
           slideSFX = new JLabel("SFX Volume: 0");
           slideSFX.setFont(Font2);
           
           SFXVolume = new JSlider(JSlider.HORIZONTAL,0,20,0);
           SFXVolume.setMajorTickSpacing(5);
           SFXVolume.setPaintTicks(true);
           
           slideVoice = new JLabel("Voice Volume: 0");
           slideVoice.setFont(Font2);
           
           voiceVolume = new JSlider(JSlider.HORIZONTAL,0,20,0);
           voiceVolume.setMajorTickSpacing(5);
           voiceVolume.setPaintTicks(true);
           
           slideAmbient = new JLabel("Ambient Volume: 0");
           slideAmbient.setFont(Font2);
           
           ambientVolume = new JSlider(JSlider.HORIZONTAL,0,20,0);
           ambientVolume.setMajorTickSpacing(5);
           ambientVolume.setPaintTicks(true);
           
           resoultionText = new JLabel("Resoultion: ");
           resoultionText.setFont(Font2);
           
           resoultion = new JComboBox(messageStrings);
           resoultion.setSelectedIndex(0);
           resoultion.setFont(Font2);

           
          resolutionTextField1 = new JTextField(4);
          
           X = new JLabel(" X ");
           X.setFont(Font2);
           
           resolutionTextField2 = new JTextField(4);
           
           window = new JComboBox(windowMode);
           window.setSelectedIndex(0);
           window.setFont(Font2);
           
           windowModeText = new JLabel("Window Mode: ");
           windowModeText.setFont(Font2);
           
          
           graphicsText = new JLabel("Graphic Quality: ");
           graphicsText.setFont(Font2);
           
           quality = new JComboBox(graphicsQuality);
           quality.setSelectedIndex(0);
           quality.setFont(Font2);
           
           motion = new JLabel("Motion Blur: ");
           motion.setFont(Font2);
          
           
           film = new JLabel("Film Grain: ");
           film.setFont(Font2);
           
           shafts = new JLabel("Light Shafts: ");
           shafts.setFont(Font2);
           
           checkBox1 = new JCheckBox();
           checkBox2 = new JCheckBox();
           checkBox3 = new JCheckBox();
            
           Dimension buttonSize = new Dimension(175,55);
           apply = new JButton("Apply");
           apply.setPreferredSize(buttonSize);
           apply.setFont(Font2);
           
           audio = new JLabel("Audio");
           audio.setFont(Font3);
           audio.setForeground(Color.CYAN);
           
           graphics = new JLabel("Graphics");
           graphics.setFont(Font3);
           graphics.setForeground(Color.CYAN);
           
           Line = new JLabel("------------------------------------------------");
           Line.setFont(Font2);
           
           Line2 = new JLabel("------------------------------------------------");
           Line2.setFont(Font2);
          
           
           Panel4 = new JPanel();
           Panel4.add(audio);
           add(Panel4);
           
           Panel3 = new JPanel();
           Panel3.add(Line);
           add(Panel3);
           
          Panel1 = new JPanel();
          Panel1.add(slideMaster);
          Panel1.add(masterVolume);
          add(Panel1);
  
           Panel2 = new JPanel();
           Panel2.add(slideMusic);
           Panel2.add(musicVolume);
           add(Panel2);
           
           Panel5 = new JPanel();
           Panel5.add(slideSFX);
           Panel5.add(SFXVolume);
           add(Panel5);
           
           Panel6 = new JPanel();
           Panel6.add(slideVoice);
           Panel6.add(voiceVolume);
           add(Panel6);
           
           Panel7 = new JPanel();
           Panel7.add(slideAmbient);
           Panel7.add(ambientVolume);
           add(Panel7);
           
           Panel8 = new JPanel();
           Panel8.add(graphics);
           add(Panel8);
           
           Panel9 = new JPanel();
           Panel9.add(Line2);
           add(Panel9);
           
           Panel10 = new JPanel();
           Panel10.add(resoultionText);
           Panel10.add(resoultion);
           Panel10.add(resolutionTextField1);
           Panel10.add(X);
           Panel10.add(resolutionTextField2);
           add(Panel10);
           
           Panel11 = new JPanel();
           Panel11.add(windowModeText);
           Panel11.add(window);
           add(Panel11);
           
            
           Panel12 = new JPanel();
           Panel12.add(graphicsText);
           Panel12.add(quality);
           add(Panel12);
           
           
           Panel13 = new JPanel();
           Panel13.add(motion);
           Panel13.add(checkBox1);
           add(Panel13);
           
           Panel14 = new JPanel();
           Panel14.add(film);
           Panel14.add(checkBox2);
           add(Panel14);
           
           Panel15 = new JPanel();
           Panel15.add(shafts);
           Panel15.add(checkBox3);
           add(Panel15);
           
           Panel16 = new JPanel();
           Panel16.add(apply);
           add(Panel16);
           
         
           
            ButtonApplyListener bok = new ButtonApplyListener();
          
            apply.addActionListener(bok);   
            
            
           event e = new event();
           masterVolume.addChangeListener(e);
           musicVolume.addChangeListener(e);
           SFXVolume.addChangeListener(e);
           voiceVolume.addChangeListener(e);
           ambientVolume.addChangeListener(e);
    }// close constructor

    public class event implements ChangeListener {
        public void stateChanged(ChangeEvent e){
             value = masterVolume.getValue();
             value2 = musicVolume.getValue();
             value3 = SFXVolume.getValue();
             value4 = voiceVolume.getValue();
             value5 = ambientVolume.getValue();
            
            slideMaster.setText("Master Volume: " + value);
            slideMusic.setText("Music Volume: " + value2);
            slideSFX.setText("SFX Volume: " + value3);
            slideVoice.setText("Voice Volume: " + value4);
            slideAmbient.setText("Ambient Volume: " + value5);
        }
    }
    
    public static void main(String[] args) {
      JFrame myFrame = new CustomGUI();
      myFrame.setTitle("Options Menu");
      myFrame.setSize(1000,1000);
      myFrame.setLocation(500,0);
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setVisible(true);
     }
    class ButtonApplyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // left side
        int resMin1 = 600;
        int resMax1 = 3080;
        // right side
        int resMin2 = 400;
        int resMax2 = 2800;
        
       JOptionPane.showMessageDialog(null,"Your settings have been applied!","Great!",JOptionPane.INFORMATION_MESSAGE);
       
        System.out.println("AUDIO");
        System.out.println("Your master volume is: " + value);
        System.out.println("Your music volume is: " + value2);
        System.out.println("Your SFXVolume volume is: " + value3);
        System.out.println("Your voice volume is: " + value4);
        System.out.println("Your ambient volume is: " + value5);
        System.out.println(" ");
        
        String selectedValue = resoultion.getSelectedItem().toString();
        String selectedValue2 = window.getSelectedItem().toString();
        String selectedValue3 = quality.getSelectedItem().toString();
        
        
        System.out.println("GRAPHICS");
        System.out.println("Resoultion selected: " + selectedValue);
        System.out.println("Screen selected: " + selectedValue2);
        System.out.println("Graphics selected: " + selectedValue3);
        
        if(checkBox1.isSelected()){
            System.out.println("Your motion blur is on!");
        }else{
             System.out.println("Your motion blur is off!");
        }
        if(checkBox2.isSelected()){
            System.out.println("Your film grain is on!");
        }else{
             System.out.println("Your film grain is off!");
        }
        if(checkBox3.isSelected()){
            System.out.println("Your light shafts are on!");
        }else{
             System.out.println("Your lights shafts are off!");
        }
        
       String input = resolutionTextField1.getText();
        
       resolutionTextField1.setText(input);
      
       String input2 = resolutionTextField2.getText();
        
       resolutionTextField2.setText(input2);
       
        
       
        if(resoultion.getSelectedIndex() == 4){
            if(resolutionTextField1.getText().trim().isEmpty() || resolutionTextField2.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(null,"You have not entered a full resoultion","Error",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                try{
                    int mm = Integer.parseInt(resolutionTextField1.getText());
                    int mm2 = Integer.parseInt(resolutionTextField2.getText());
                    if(mm < resMin1 || mm > resMax1){
                       JOptionPane.showMessageDialog(null,"Your resoultion is out of range of capability","Error",JOptionPane.INFORMATION_MESSAGE);
                    }else if(mm2 < resMin2 || mm2 > resMax2){
                       JOptionPane.showMessageDialog(null,"Your resoultion is out of range of capability","Error",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                       System.out.println("Your custom resoultion is: " + input + "x" + input2);  
                    }
                }catch (NumberFormatException f){
                  JOptionPane.showMessageDialog(null,"Resoultion is not a number!","Error",JOptionPane.INFORMATION_MESSAGE);
                } 
            }
        }
         System.out.println(" ");
         
       }
    }// Close Listener inner Class
}
