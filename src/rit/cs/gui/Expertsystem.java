package rit.cs.gui;

import java.awt.EventQueue;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import rit.cs.model.KnowledgeBase;

import java.awt.Font;

/**
 * Program which create front end form for getting values froom the user
 */
public class Expertsystem {
	public JFrame frame;
	static boolean flag = false;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public int vulnerabilitiesidentified;
	public int vulnerabilitiesmitigated;
	public int remoteaccesspoints;
	public int unauthorizedAccess;
	public int sharedaccounts;
	public int accesstosystem;
	public int vulnerabilitiesidentifiedpoam;
	public int vulnerabilitiesremediatedpoam;
	public int vulnerabilityscans;
	public String automatedtools;
	public String intrusiondetection;
	public String securitydb;
	public String periodicvul;
	public String periodicity;
	public String password;
	public String specialchars;
	public String moredigits;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Expertsystem(KnowledgeBase base) {
		initialize(base);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(KnowledgeBase base) {
		 frame = new JFrame();
	        frame.getContentPane().setBackground(new Color(245, 245, 245));
	        frame.setBounds(100, 100, 957, 720);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(null);
	 
	        JLabel lblNoOf = new JLabel(
	                "1.  No. of vulnerabilities identified across organization during time period(2014-15)? ");
	        lblNoOf.setBounds(10, 29, 501, 14);
	        frame.getContentPane().add(lblNoOf);
	 
	        JLabel lblNewLabel = new JLabel(
	                "2.  No. of vulnerabilities mitigated across organization during time period(2014-15)? ");
	        lblNewLabel.setBounds(10, 51, 501, 14);
	        frame.getContentPane().add(lblNewLabel);
	 
	        JLabel lblNewLabel_1 = new JLabel(
	                "1.  How many remote access points exist in the organization? ");
	        lblNewLabel_1.setBounds(10, 109, 407, 14);
	        frame.getContentPane().add(lblNewLabel_1);
	 
	        JLabel lblNewLabel_2 = new JLabel(
	                "2.  Does organization use automated tools to maintain upto date network diagram ");
	        lblNewLabel_2.setBounds(10, 126, 471, 14);
	        frame.getContentPane().add(lblNewLabel_2);
	 
	        JLabel lblNewLabel_3 = new JLabel(
	                "that identifies all remote access points?");
	        lblNewLabel_3.setBounds(25, 140, 302, 14);
	        frame.getContentPane().add(lblNewLabel_3);
	 
	        ButtonGroup g1 = new ButtonGroup();
	        ButtonGroup g2 = new ButtonGroup();
	        ButtonGroup g3 = new ButtonGroup();
	        ButtonGroup g4 = new ButtonGroup();
	 
	        JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
	        rdbtnNewRadioButton.setBounds(500, 130, 52, 20);
	        frame.getContentPane().add(rdbtnNewRadioButton);
	        g1.add(rdbtnNewRadioButton);
	 
	        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
	        rdbtnNewRadioButton_1.setBounds(554, 130, 52, 20);
	        frame.getContentPane().add(rdbtnNewRadioButton_1);
	        g1.add(rdbtnNewRadioButton_1);
	 
	 
	 
	        JLabel lblNewLabel_6 = new JLabel(
	                "1.  How many users have access to shared accounts?");
	        lblNewLabel_6.setBounds(10, 266, 407, 14);
	        frame.getContentPane().add(lblNewLabel_6);
	 
	        JLabel lblNewLabel_7 = new JLabel(
	                "2.  How many users have access to the system ?");
	        lblNewLabel_7.setBounds(10, 289, 407, 14);
	        frame.getContentPane().add(lblNewLabel_7);
	 
	        JLabel lblWhatIs = new JLabel(
	                "1.  What is the periodicity of vulnerability scan ?");
	        lblWhatIs.setBounds(10, 339, 407, 14);
	        frame.getContentPane().add(lblWhatIs);
	 
	        JRadioButton rdbtnWeekly = new JRadioButton("Weekly");
	        rdbtnWeekly.setBounds(500, 335, 70, 23);
	        frame.getContentPane().add(rdbtnWeekly);
	        g4.add(rdbtnWeekly);
	 
	        JRadioButton rdbtnMonthly = new JRadioButton("Monthly");
	        rdbtnMonthly.setBounds(572, 335, 70, 23);
	        frame.getContentPane().add(rdbtnMonthly);
	        g4.add(rdbtnMonthly);
	 
	        JRadioButton rdbtnQuarterly = new JRadioButton("Quarterly");
	        rdbtnQuarterly.setBounds(644, 335, 86, 23);
	        frame.getContentPane().add(rdbtnQuarterly);
	        g4.add(rdbtnQuarterly);
	 
	        JLabel lblNewLabel_9 = new JLabel(
	                "2.  How many vulnerabilities were identified thru scan and entered into applicable");
	        lblNewLabel_9.setBounds(10, 359, 471, 14);
	        frame.getContentPane().add(lblNewLabel_9);
	 
	        JLabel lblNewLabel_10 = new JLabel(" POA&M ? ");
	        lblNewLabel_10.setBounds(25, 378, 77, 14);
	        frame.getContentPane().add(lblNewLabel_10);
	 
	        JLabel lblNewLabel_11 = new JLabel(
	                "3.  How many identified vulnerabilities were remediated and entered into ");
	        lblNewLabel_11.setBounds(10, 392, 471, 14);
	        frame.getContentPane().add(lblNewLabel_11);
	 
	        JLabel lblApplicablePoam = new JLabel("applicable POA&M?");
	        lblApplicablePoam.setBounds(25, 410, 109, 14);
	        frame.getContentPane().add(lblApplicablePoam);
	 
	         
	 
	        textField = new JTextField();
	        textField.setBounds(500, 29, 86, 20);
	        frame.getContentPane().add(textField);
	        textField.setColumns(10);
	 
	        textField_1 = new JTextField();
	        textField_1.setBounds(500, 51, 86, 20);
	        frame.getContentPane().add(textField_1);
	        textField_1.setColumns(10);
	 
	        textField_2 = new JTextField();
	        textField_2.setBounds(500, 106, 86, 20);
	        frame.getContentPane().add(textField_2);
	        textField_2.setColumns(10);
	 
	        textField_3 = new JTextField();
	        textField_3.setBounds(500, 265, 86, 20);
	        frame.getContentPane().add(textField_3);
	        textField_3.setColumns(10);
	 
	        textField_4 = new JTextField();
	        textField_4.setBounds(500, 192, 86, 20);
	        frame.getContentPane().add(textField_4);
	        textField_4.setColumns(10);
	 
	        textField_5 = new JTextField();
	        textField_5.setBounds(500, 365, 86, 20);
	        frame.getContentPane().add(textField_5);
	        textField_5.setColumns(10);
	 
	        textField_6 = new JTextField();
	        textField_6.setBounds(500, 389, 86, 20);
	        frame.getContentPane().add(textField_6);
	        textField_6.setColumns(10);
	 
	        JLabel lblDoesOrganization = new JLabel(
	                "3.  Does organization employ Intrusion Detection System to monitor traffic");
	        lblDoesOrganization.setBounds(10, 160, 460, 14);
	        frame.getContentPane().add(lblDoesOrganization);
	 
	        JLabel lblNewLabel_12 = new JLabel(" traversing remote access points?");
	        lblNewLabel_12.setBounds(25, 176, 349, 14);
	        frame.getContentPane().add(lblNewLabel_12);
	 
	        JLabel lblVulnerabilityManagement = new JLabel(
	                "Vulnerability Management");
	        lblVulnerabilityManagement.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblVulnerabilityManagement.setBounds(10, 0, 203, 31);
	        frame.getContentPane().add(lblVulnerabilityManagement);
	 
	        JLabel lblAccessControl = new JLabel("Access Control");
	        lblAccessControl.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblAccessControl.setBounds(10, 76, 178, 31);
	        frame.getContentPane().add(lblAccessControl);
	 
	        JLabel lblNewLabel_13 = new JLabel(
	                "4.  How many number of access points used to gain unauthorized access?");
	        lblNewLabel_13.setBounds(10, 195, 460, 14);
	        frame.getContentPane().add(lblNewLabel_13);
	 
	        JLabel lblIdentificationAndAuthentication = new JLabel(
	                "Identification and Authentication");
	        lblIdentificationAndAuthentication.setFont(new Font("Tahoma",
	                Font.BOLD, 13));
	        lblIdentificationAndAuthentication.setBounds(10, 237, 407, 23);
	        frame.getContentPane().add(lblIdentificationAndAuthentication);
	 
	        JLabel lblRiskAssessment = new JLabel("Risk Assessment");
	        lblRiskAssessment.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblRiskAssessment.setBounds(10, 304, 178, 35);
	        frame.getContentPane().add(lblRiskAssessment);
	 
	                 
	        JLabel lblPassword = new JLabel("Password");
	        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblPassword.setBounds(10, 432, 92, 27);
	        frame.getContentPane().add(lblPassword);
	 
	        JLabel lblNewLabel_8 = new JLabel("1.  How often you change password?");
	        lblNewLabel_8.setBounds(10, 462, 317, 14);
	        frame.getContentPane().add(lblNewLabel_8);
	 
	        JLabel lblNewLabel_14 = new JLabel(
	                "2.  Does your password contains either of the following two :uppercase,special characters,");
	        lblNewLabel_14.setBounds(10, 487, 487, 14);
	        frame.getContentPane().add(lblNewLabel_14);
	 
	        JLabel lblNewLabel_15 = new JLabel("   numbers ?");
	        lblNewLabel_15.setBounds(25, 503, 124, 14);
	        frame.getContentPane().add(lblNewLabel_15);
	 
	        JLabel lblNewLabel_16 = new JLabel(
	                "3.  Does your password contain more than 6 characters?");
	        lblNewLabel_16.setBounds(10, 528, 317, 14);
	        frame.getContentPane().add(lblNewLabel_16);
	        ButtonGroup g5 = new ButtonGroup();
	 
	        JRadioButton rdbtnYes = new JRadioButton("Yes");
	        rdbtnYes.setBounds(500, 160, 57, 14);
	        frame.getContentPane().add(rdbtnYes);
	        g5.add(rdbtnYes);
	 
	        JRadioButton rdbtnNo_1 = new JRadioButton("No");
	        rdbtnNo_1.setBounds(554, 160, 52, 14);
	        frame.getContentPane().add(rdbtnNo_1);
	        g5.add(rdbtnNo_1);
	 
	        textField_8 = new JTextField();
	        textField_8.setBounds(500, 289, 86, 20);
	        frame.getContentPane().add(textField_8);
	        textField_8.setColumns(10);
	 
	        ButtonGroup g6 = new ButtonGroup();
	 
	        JRadioButton rdbtnMonthly_1 = new JRadioButton("Monthly");
	        rdbtnMonthly_1.setBounds(500, 458, 70, 23);
	        frame.getContentPane().add(rdbtnMonthly_1);
	        g6.add(rdbtnMonthly_1);
	        JRadioButton rdbtnQuarterly_1 = new JRadioButton("Quarterly");
	        rdbtnQuarterly_1.setBounds(572, 458, 95, 23);
	        frame.getContentPane().add(rdbtnQuarterly_1);
	        g6.add(rdbtnQuarterly_1);
	 
	        JRadioButton rdbtnSixMonthsOr = new JRadioButton("Six months or more");
	        rdbtnSixMonthsOr.setBounds(669, 458, 149, 23);
	        frame.getContentPane().add(rdbtnSixMonthsOr);
	        g6.add(rdbtnSixMonthsOr);
	 
	        ButtonGroup g7 = new ButtonGroup();
	 
	        JRadioButton radioButton = new JRadioButton("Yes");
	        radioButton.setBounds(500, 487, 52, 14);
	        frame.getContentPane().add(radioButton);
	        g7.add(radioButton);
	 
	        JRadioButton radioButton_1 = new JRadioButton("No");
	        radioButton_1.setBounds(572, 487, 52, 14);
	        frame.getContentPane().add(radioButton_1);
	        g7.add(radioButton_1);
	 
	        ButtonGroup g8 = new ButtonGroup();
	 
	        JRadioButton radioButton_2 = new JRadioButton("Yes");
	        radioButton_2.setBounds(500, 528, 52, 14);
	        frame.getContentPane().add(radioButton_2);
	        g8.add(radioButton_2);
	 
	        JRadioButton radioButton_3 = new JRadioButton("No");
	        radioButton_3.setBounds(572, 528, 52, 14);
	        frame.getContentPane().add(radioButton_3);
	        g8.add(radioButton_3);
	 
	        JButton btnSubmit = new JButton("Next");
	        btnSubmit.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	 
	                 flag = false;
	                if (rdbtnNewRadioButton.isSelected()) {
	                    automatedtools = "yes";
	                } else {
	                    automatedtools = "no";
	                }
	 
	                 
	 
	                if (rdbtnYes.isSelected()) {
	                    intrusiondetection = "yes";
	                } else {
	                    intrusiondetection = "no";
	                }
	 
	               /* if (rdbtnNewRadioButton_3.isSelected()) {
	                    periodicvul = "yes";
	                } else {
	                    periodicvul = "no";
	                }*/
	 
	                if (rdbtnWeekly.isSelected()) {
	                    periodicity = "Weekly";
	                } else if (rdbtnMonthly.isSelected()) {
	                    periodicity = "Monthly";
	                } else {
	                    periodicity = "Quarterly";
	                }
	 
	                if (rdbtnMonthly_1.isSelected()) {
	                    password = "Monthly";
	                } else if (rdbtnQuarterly_1.isSelected()) {
	                    password = "Quarterly";
	                } else {
	                    password = "6";
	                }
	 
	                if (radioButton.isSelected()) {
	                    specialchars = "yes";
	                } else {
	                    specialchars = "no";
	                }
	 
	                if (radioButton_2.isSelected()) {
	                    moredigits = "yes";
	                } else {
	                    moredigits = "no";
	                }
	                getresult(base);
	                 if(!(flag)) {
						 frame.dispose();
						 Expertsystemop op = new Expertsystemop();
						 op.setVisible(true);
					 }
	            }
	        });

		btnSubmit.setBounds(594, 607, 109, 35);
		frame.getContentPane().add(btnSubmit);

	}

	public void getresult(KnowledgeBase base) {
		// getting values from test fileds.
		try
		{
			vulnerabilitiesidentified = Integer.parseInt(textField.getText());
			if(!(vulnerabilitiesidentified>0))
			{
				 flag = true;
				JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for Vul.Identified.");
			}

			vulnerabilitiesmitigated = Integer.parseInt(textField_1.getText());
			if(!(vulnerabilitiesmitigated>0))
			{				 flag = true;

				JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for Vul.Mitigated.");
			}
			remoteaccesspoints = Integer.parseInt(textField_2.getText());
			if(!(remoteaccesspoints>0))
			{
				flag = true;

				JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for remoteAccPts.");
			}
			unauthorizedAccess = Integer.parseInt(textField_4.getText());
			if(!(unauthorizedAccess > 0)) {
				flag = true;

				JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for UnauthAccess.");
			}
			sharedaccounts = Integer.parseInt(textField_3.getText());
			if(!(sharedaccounts > 0)) {
				flag = true;

				JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for shared acc.");
			}
			accesstosystem = Integer.parseInt(textField_8.getText());
			if(!(accesstosystem > 0)) {
				flag = true;

				JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for AccessSystem.");
			}
			vulnerabilitiesidentifiedpoam = Integer.parseInt(textField_5.getText());
			if(!(vulnerabilitiesidentifiedpoam>0))
			{
				flag = true;

				JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for VulIden.POA.");
			}
			vulnerabilitiesremediatedpoam = Integer.parseInt(textField_6.getText());
			if(!(vulnerabilitiesremediatedpoam>0))
			{
				flag = true;

				JOptionPane.showMessageDialog(null, "Please Enter a Positive Integer value for Vul.Miti.POA.");
			}

		}
		catch(NumberFormatException e)
		{
			flag = true;

			JOptionPane.showMessageDialog(null, "Please Enter Integer values only.");
		}
		// setting values in knowledge base
		base.setVulnerabilitiesidentified(vulnerabilitiesidentified);
		System.out.println("identify "+base.getVulnerabilitiesidentified());
		base.setVulnerabilitiesmitigated(vulnerabilitiesmitigated);
		System.out.println("miti "+base.getVulnerabilitiesmitigated());
		base.setRemoteaccesspoints(remoteaccesspoints);
		base.setUnauthorizedAccess(unauthorizedAccess);
		base.setSharedaccounts(sharedaccounts);
		base.setAccesstosystem(accesstosystem);
		base.setVulnerabilitiesidentifiedpoam(vulnerabilitiesidentifiedpoam);
		base.setVulnerabilitiesremediatedpoam(vulnerabilitiesremediatedpoam);
		//base.setVulnerabilityscans(vulnerabilityscans);
		base.setAutomatedtools(automatedtools);
		base.setSecuritydb(securitydb);
		base.setIntrusiondetection(intrusiondetection);
		base.setPeriodicvul(periodicvul);
		base.setPeriodicity(periodicity);
		base.setMoredigits(moredigits);
		base.setPassword(password);
		base.setSpecialchars(specialchars);
		
		System.out.println("vulIdent "+vulnerabilitiesidentified);
		System.out.println("moredigits "+ moredigits);
	}

}
