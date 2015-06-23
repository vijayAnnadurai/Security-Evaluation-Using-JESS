package rit.cs.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.*;
import javax.swing.border.EmptyBorder;


import java.awt.Font;


import java.awt.Color;


//import rit.cs.model.KnowledgeBase;
 

import rit.cs.model.KnowledgeBase;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Program which create front end form for getting values froom the user
 */
public class Expertsystemop extends JFrame {
     
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    public int individualsaccess;
    public int individualscreened;
    public int incidentsoccured;
    public int allowedunauthorisedentries;
     static boolean flag = false;
    /**
     * Launch the application.
     */
     
    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Expertsystemop frame = new Expertsystemop();
 
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
 
    /**
     * Create the frame.
     */
 
    public Expertsystemop() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 50, 725, 416);
        getContentPane().setLayout(null);
 
     
        JLabel lblNewLabel_2 = new JLabel("Incidents\r\n");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_2.setBounds(32, 24, 126, 33);
        getContentPane().add(lblNewLabel_2);
 
        JLabel lblNewLabel_3 = new JLabel(
                "1.  How many individuals have been granted access to organizational information?");
        lblNewLabel_3.setBounds(32, 68, 497, 14);
        getContentPane().add(lblNewLabel_3);
 
        JLabel lblNewLabel_4 = new JLabel(
                "2.  What is the number of individuals completed screening?");
        lblNewLabel_4.setBounds(32, 93, 409, 14);
        getContentPane().add(lblNewLabel_4);
 
        JLabel lblNewLabel_5 = new JLabel("Physical and environmental ");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_5.setBounds(32, 128, 219, 33);
        getContentPane().add(lblNewLabel_5);
 
        JLabel lblNewLabel_6 = new JLabel(
                "1.  How many physical incidents occurred during specified time period? ");
        lblNewLabel_6.setBounds(32, 172, 425, 14);
        getContentPane().add(lblNewLabel_6);
 
        JLabel lblNewLabel_7 = new JLabel(
                "2.  How many of the physical security incidents allowed unauthorized entry into facilities ");
        lblNewLabel_7.setBounds(32, 198, 513, 14);
        getContentPane().add(lblNewLabel_7);
 
        JLabel lblNewLabel_8 = new JLabel("containing information system? ");
        lblNewLabel_8.setBounds(42, 213, 209, 14);
        getContentPane().add(lblNewLabel_8);
 
         
        textField = new JTextField();
        textField.setBounds(536, 65, 86, 20);
        getContentPane().add(textField);
        textField.setColumns(10);
 
        textField_1 = new JTextField();
        textField_1.setBounds(536, 90, 86, 20);
        getContentPane().add(textField_1);
        textField_1.setColumns(10);
 
        textField_2 = new JTextField();
        textField_2.setBounds(536, 169, 86, 20);
        getContentPane().add(textField_2);
        textField_2.setColumns(10);
 
        textField_3 = new JTextField();
        textField_3.setBounds(536, 195, 86, 20);
        getContentPane().add(textField_3);
        textField_3.setColumns(10);
 
        JButton btnNewButton = new JButton("Recommend");
        btnNewButton.addActionListener(new RecommendationActionListener(this)); 
            /*public void actionPerformed(ActionEvent arg0) {
 
                getresults();
 
                if (rdbtnYes.isSelected()) {
                    knowspassword = "yes";
                } else {
                    knowspassword = "no";
                }
 
                if (rdbtnYes.isSelected()) {
                    writingpassword = "yes";
                } else {
                    writingpassword = "no";
                }
 
                if (rdbtnYes.isSelected()) {
                    changepassword = "yes";
                } else {
                    changepassword = "no";
                }
 
            }
        });*/
        btnNewButton.setBounds(497, 290, 150, 45);
        getContentPane().add(btnNewButton);
 
 
 
    }

    /**
     * method to get the values from user
     * @param base
     */
    public void getresults(KnowledgeBase base) {
     
       /* individualsaccess = Integer.parseInt(textField.getText());
        individualscreened = Integer.parseInt(textField_1.getText());
        incidentsoccured = Integer.parseInt(textField_2.getText());
        allowedunauthorisedentries = Integer.parseInt(textField_3.getText());

        base.setIndividualsaccess(individualsaccess);
        System.out.println("valu "+ base.getIndividualsaccess());
        base.setIndividualscreened(individualscreened);
        base.setIncidentsoccured(incidentsoccured);
        base.setAllowedunauthorisedentries(allowedunauthorisedentries);
         */




        try
        {
            individualsaccess = Integer.parseInt(textField.getText());
            if(!(individualsaccess>0))
            { flag= true;
                JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for IndividualAccess.");
            }
            individualscreened = Integer.parseInt(textField_1.getText());
            if(!(individualscreened>0))
            {flag= true;
                JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for Ind.Screened.");
            }
            incidentsoccured = Integer.parseInt(textField_2.getText());
            if(!(incidentsoccured>0))
            {
                flag= true;
                JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for IncidentsOccured.");
            }
            allowedunauthorisedentries = Integer.parseInt(textField_3.getText());
            if(!(allowedunauthorisedentries>0))

            { flag= true;
                JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for UnauthEntries.");
            }

            base.setIndividualsaccess(individualsaccess);
            System.out.println("valu "+ base.getIndividualsaccess());
            base.setIndividualscreened(individualscreened);
            base.setIncidentsoccured(incidentsoccured);
            base.setAllowedunauthorisedentries(allowedunauthorisedentries);

        }
        catch(NumberFormatException e)
        {
            flag= true;
            JOptionPane.showMessageDialog(null, "Please Enter Integer values only.");
        }
    }
}