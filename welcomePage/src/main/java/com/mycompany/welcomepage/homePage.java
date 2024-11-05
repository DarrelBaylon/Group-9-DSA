/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.welcomepage;

/**
 *
 * @author Jessica
 */


import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.*;
import javax.swing.*;


public class homePage extends JFrame {
    
    private JPanel firstTab, secondTab, thirdTab, fourthTab, fifthTab;  
    private final JTabbedPane jtpHome;
    private JLabel txtLabel, anotherLabel, nextLabel, dashLine; 
    private URL pic = null;

   
   homePage(){
       setSize(1000, 600);
       setTitle("Travel Booking System");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
        firstTab = new JPanel();
        firstTab.setLayout(null);
        firstTab.setSize(1000, 600);

        txtLabel = new JLabel("Book Your Next");
        txtLabel.setBounds(30, 200, 400, 100); 
        txtLabel.setFont(new Font("Times New Roman", Font.BOLD , 40)); 
        txtLabel.setForeground(new Color(0, 151, 178));
        firstTab.add(txtLabel); 
        
        anotherLabel = new JLabel("Destination With Us");
        anotherLabel.setBounds(30, 250, 400, 110); 
        anotherLabel.setFont(new Font("Times New Roman", Font.BOLD , 40)); 
        anotherLabel.setForeground(new Color(0, 151, 178));
        firstTab.add(anotherLabel); 

        
        nextLabel = new JLabel("Get Your Flight From _ _ _ _ _ _ _ ");
        nextLabel.setBounds(30, 300, 400, 120); 
        nextLabel.setFont(new Font("GARET", Font.PLAIN , 25)); 
        nextLabel.setForeground(new Color(175, 168, 140));
        firstTab.add(nextLabel);
        
        dashLine = new JLabel("_ _ _ _ _ _ _ _ _ _  ");
        dashLine.setBounds(30, 320, 400, 130);
        dashLine.setForeground(new Color(0, 151, 178));
        dashLine.setFont(new Font("Times New Roman", Font.BOLD , 25)); 
        firstTab.add(dashLine);
        
            try {
                pic = new URL ("https://i.imgur.com/SON68g6.png");
            } catch (MalformedURLException ex) {
                Logger.getLogger(homePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ImageIcon imageIcon = new ImageIcon(pic);
            Image imageScale = imageIcon.getImage().getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
            ImageIcon imageNew = new ImageIcon(imageScale);
            JLabel backgroundLabel = new JLabel(imageNew);
            backgroundLabel.setBounds(0, 0, 1000, 600);
            firstTab.add(backgroundLabel);
           
        secondTab = new JPanel();
        secondTab.setSize(1000, 600);

        thirdTab = new JPanel();
        thirdTab.setSize(1000, 600); 
        
        fourthTab = new JPanel();
        fourthTab.setSize(1000, 600);
        
        fifthTab= new JPanel();
        fifthTab.setSize(1000, 600);
               
        jtpHome = new JTabbedPane();
        jtpHome.setSize(1000, 600);
        jtpHome.addTab("HOME", firstTab);
        jtpHome.addTab("Flight", secondTab);
        jtpHome.addTab("Hotel", thirdTab);
        jtpHome.addTab("Package", fourthTab);
        jtpHome.addTab("History", fifthTab);
        add(jtpHome);

        setResizable(false);
        setLocationRelativeTo(null);

        setVisible(true);
    
   
    }

}

    
    


    
    

