

package com.mycompany.yann_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Senar extends JFrame {
    
    private JPanel bgColor;
    private URL pic1, pic2, pic3, pic4 = null;
    private JLabel packages;
    private JButton btnCountry, btnCountry2, btnCountry3, btnCountry4;

    public Senar() {
        bgColor = new JPanel();
        bgColor.setSize(1000, 600);
        bgColor.setBackground(new Color(37, 113, 128));
        bgColor.setLayout(null);

        setSize(1000, 600);
        setTitle("Hotel Packages");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        add(bgColor);
      
        packages = new JLabel("TRAVEL PACKAGES");
        packages.setBounds(300, 40, 400, 30);
        packages.setFont(new Font("Fira Code", Font.BOLD, 40)); 
        packages.setForeground(new Color(234, 216, 177));
        bgColor.add(packages);
        
        try {
            pic1 = new URL("https://i.pinimg.com/564x/f5/d1/20/f5d120426d8b163560f9f0a33fe92b2b.jpg");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Senar.class.getName()).log(Level.SEVERE, null, ex);
        }

        ImageIcon imageIcon = new ImageIcon(pic1);
        Image imageScale = imageIcon.getImage().getScaledInstance(180, 300, Image.SCALE_SMOOTH);
        ImageIcon imageNew = new ImageIcon(imageScale);
        JLabel backgroundLabel = new JLabel(imageNew);
        backgroundLabel.setBounds(50, 70, 250, 350);
        bgColor.add(backgroundLabel);
        
       try {
            pic2 = new URL("https://i.pinimg.com/enabled_lo/564x/5d/cc/9b/5dcc9be77b68fab2e6f4e21d62947ae6.jpg");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Senar.class.getName()).log(Level.SEVERE, null, ex);
        }

        ImageIcon imageIcon1 = new ImageIcon(pic2);
        Image imageScale1 = imageIcon1.getImage().getScaledInstance(180, 300, Image.SCALE_SMOOTH);
        ImageIcon imageNew1 = new ImageIcon(imageScale1);
        JLabel backgroundLabel1 = new JLabel(imageNew1);
        backgroundLabel1.setBounds(260, 70, 250, 350);
        bgColor.add(backgroundLabel1);
        
       try {
            pic3 = new URL("https://i.pinimg.com/736x/28/5a/8f/285a8f1a5c17aabef1261e537dc9bf4e.jpg");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Senar.class.getName()).log(Level.SEVERE, null, ex);
        }

        ImageIcon imageIcon2 = new ImageIcon(pic3);
        Image imageScale2 = imageIcon2.getImage().getScaledInstance(180, 300, Image.SCALE_SMOOTH);
        ImageIcon imageNew2 = new ImageIcon(imageScale2);
        JLabel backgroundLabel2 = new JLabel(imageNew2);
        backgroundLabel2.setBounds(470, 70, 250, 350);
        bgColor.add(backgroundLabel2);
        
       try {
            pic4 = new URL("https://i.pinimg.com/enabled_lo/564x/bc/9d/59/bc9d59f8f3e41986f862d53a8173b330.jpg");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Senar.class.getName()).log(Level.SEVERE, null, ex);
        }

        ImageIcon imageIcon3 = new ImageIcon(pic4);
        Image imageScale3 = imageIcon3.getImage().getScaledInstance(180, 300, Image.SCALE_SMOOTH);
        ImageIcon imageNew3 = new ImageIcon(imageScale3);
        JLabel backgroundLabel3 = new JLabel(imageNew3);
        backgroundLabel3.setBounds(680, 70, 250, 350);
        bgColor.add(backgroundLabel3);
        
        btnCountry = new JButton("Bangkok, Thailand");
        btnCountry.setFont(new Font("Times New Roman", Font.BOLD, 12)); 
        btnCountry.setBackground(new Color(253, 252, 233));
        btnCountry.setForeground(new Color(37, 113, 128));
        btnCountry.setBounds(85, 395, 180 ,40);
        bgColor.add(btnCountry);
        
        btnCountry2 = new JButton("Beijing, China");
        btnCountry2.setFont(new Font("Times New Roman", Font.BOLD, 12)); 
        btnCountry2.setBackground(new Color(253, 252, 233));
        btnCountry2.setForeground(new Color(37, 113, 128));
        btnCountry2.setBounds(295, 395, 180 ,40);
        bgColor.add(btnCountry2);
        
        btnCountry3 = new JButton("Kyoto, Japan");
        btnCountry3.setFont(new Font("Times New Roman", Font.BOLD, 12)); 
        btnCountry3.setBackground(new Color(253, 252, 233));
        btnCountry3.setForeground(new Color(37, 113, 128));
        btnCountry3.setBounds(505, 395, 180 ,40);
        bgColor.add(btnCountry3);
        
        btnCountry4 = new JButton("Seoul, Korea");
        btnCountry4.setFont(new Font("Times New Roman", Font.BOLD, 12)); 
        btnCountry4.setBackground(new Color(253, 252, 233));
        btnCountry4.setForeground(new Color(37, 113, 128));
        btnCountry4.setBounds(715, 395, 180 ,40);
        bgColor.add(btnCountry4);
        
      setVisible(true);
    }
}
