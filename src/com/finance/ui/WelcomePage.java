package com.finance.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {
    public WelcomePage() {
        // Frame setup
        setTitle("Personal Finance Manager");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // set Frame to center
        getContentPane().setBackground(new Color(183,223,225));

        //creating a Welcome Message
        JLabel WelcomeLabel1 = new JLabel("Welcome to the Personal Finance Manager",SwingConstants.CENTER);
        WelcomeLabel1.setFont(new Font("Agency FB",Font.BOLD,30));
        WelcomeLabel1.setForeground(Color.DARK_GRAY);
        WelcomeLabel1.setBounds(100,100,500,100);

        //creating a tagline
        JLabel tagline = new JLabel("Take control of your finance with ease",SwingConstants.CENTER);
        tagline.setFont(new Font("SansSerif",Font.PLAIN,15));
        tagline.setForeground(new Color(100, 148, 237));
        tagline.setBounds(200,160,200,40);

        //creating a Start Button
        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Agency FB",Font.ITALIC,15));
        startButton.setForeground(Color.WHITE);




        add(WelcomeLabel1,BorderLayout.CENTER);
        add(tagline);
        add(startButton,BorderLayout.SOUTH);
        // Set the frame visible
        setVisible(true);
    }
}