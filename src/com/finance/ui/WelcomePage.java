package com.finance.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {
    public WelcomePage() {
        // Frame setup
        setTitle("Personal Finance Manager");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // set Frame to center

        //creating a Welcome Message
        JLabel WelcomeLabel1 = new JLabel("Welcome to the Personal Finance Manager",SwingConstants.CENTER);





        add(WelcomeLabel1);
        // Set the frame visible
        setVisible(true);
    }
}