/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.historyaccount;


import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author Jessica
 */
public class createAccount extends JFrame {
    private JLabel backgroundLabel, fName, lName, userId, phnNumber, pWord, cnfrmPass;
    private URL planePic;
    private JTextField txtFname, txtLname, txtId, txtPhnNumber, txtPword, txtConfrmPass;
    private JButton crtAcc;
   
    
    createAccount(){
        setTitle("History");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        
        
        fName = new JLabel("First Name");
        fName.setBounds(220, 150, 120, 60);
        fName.setFont(new Font("Garet", Font.BOLD, 18));
        fName.setForeground(new Color(0, 0, 0));
        add(fName);
        
        lName = new JLabel("Last Name");
        lName.setBounds(550, 150, 120, 60);
        lName.setFont(new Font("Garet", Font.BOLD, 18));
        lName.setForeground(new Color(0, 0, 0));
        add(lName);
        
        txtFname = new JTextField();
        txtFname.setBounds(220, 200, 250, 40);
        add(txtFname);
        
        txtLname = new JTextField();
        txtLname.setBounds(550, 200, 250, 40);
        add(txtLname);

        userId = new JLabel("User ID");
        userId.setBounds(220, 240, 120, 60);
        userId.setFont(new Font("Garet", Font.BOLD, 18));
        userId.setForeground(new Color(0, 0, 0));
        add(userId);
        
        phnNumber = new JLabel("Phone Number");
        phnNumber.setBounds(550, 240, 200, 60);
        phnNumber.setFont(new Font("Garet", Font.BOLD, 18));
        phnNumber.setForeground(new Color(0, 0, 0));
        add(phnNumber);
        
        txtId = new JTextField();
        txtId.setBounds(220, 290, 250, 40);
        add(txtId);
        
        txtPhnNumber = new JTextField();
        txtPhnNumber.setBounds(550, 290, 250, 40);
        add(txtPhnNumber);
        
        pWord = new JLabel("Password");
        pWord.setBounds(220, 330, 120, 60);
        pWord.setFont(new Font("Garet", Font.BOLD, 18));
        pWord.setForeground(new Color(0, 0, 0));
        add(pWord);
       
        cnfrmPass = new JLabel("Confirm Password");
        cnfrmPass.setBounds(550, 330, 280, 60);
        cnfrmPass.setFont(new Font("Garet", Font.BOLD, 18));
        cnfrmPass.setForeground(new Color(0, 0, 0));
        add(cnfrmPass);
        
        txtPword = new JTextField();
        txtPword.setBounds(220, 380, 250, 40);
        add(txtPword);
        
        txtConfrmPass = new JTextField();
        txtConfrmPass.setBounds(550, 380, 250, 40);
        add(txtConfrmPass);
        
        crtAcc = new JButton("Create Account");
        crtAcc.setBounds(230, 450, 180, 50);
        crtAcc.setBackground(new Color(37, 113, 128));
        crtAcc.setFont(new Font("Garet", Font.BOLD, 18));
        crtAcc.setForeground(new Color(253, 252, 233));
        add(crtAcc);
        
        

        try {
            URL planePic = new URL("https://i.imgur.com/ppEdn2K.png"); 
            ImageIcon imageIcon = new ImageIcon(planePic);
            Image imageScale = imageIcon.getImage().getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
            backgroundLabel = new JLabel(new ImageIcon(imageScale));
            backgroundLabel.setBounds(0, 0, 1000, 600); 
            add(backgroundLabel); 

        } catch (MalformedURLException ex) {
            Logger.getLogger(createAccount.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        setVisible(true);
    }
    
}
