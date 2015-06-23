package rit.cs.view;

import rit.cs.model.KnowledgeBase;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Program to display recommendation for each metrics.
 */
public class DisplayResult extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;

    /**
     * Launch the application.
     */
   /* public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DisplayResult frame = new DisplayResult();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
*/
    /**
     * Create the frame.
     */
    public DisplayResult(KnowledgeBase base) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 935, 555);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblSystemRecomendations = new JLabel("System Recommendations");
        lblSystemRecomendations.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblSystemRecomendations.setBounds(297, 21, 293, 51);
        contentPane.add(lblSystemRecomendations);

        JLabel lblVulnerabilityManagement = new JLabel("Vulnerability Management");
        lblVulnerabilityManagement.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblVulnerabilityManagement.setBounds(38, 73, 202, 35);
        contentPane.add(lblVulnerabilityManagement);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(48, 114, 396, 50);
        contentPane.add(textArea);
        textArea.setText(base.getResultVulMgmtText());

        JLabel lblAccessControl = new JLabel("Access control");
        lblAccessControl.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblAccessControl.setBounds(38, 182, 202, 35);
        contentPane.add(lblAccessControl);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(48, 218, 396, 50);
        contentPane.add(textArea_1);
        textArea_1.setText(base.getResultAccessValText());

        JLabel lblIdentification = new JLabel("Environmental Security");
        lblIdentification.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblIdentification.setBounds(38, 279, 202, 35);
        contentPane.add(lblIdentification);

        JTextArea textArea_2 = new JTextArea();
        textArea_2.setBounds(48, 314, 396, 50);
        contentPane.add(textArea_2);
        textArea_2.setText(base.getResultequipSecText());

        JLabel lblRiskAssesement = new JLabel("Risk Assesement");
        lblRiskAssesement.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblRiskAssesement.setBounds(38, 376, 202, 35);
        contentPane.add(lblRiskAssesement);

        JTextArea textArea_3 = new JTextArea();
        textArea_3.setBounds(48, 422, 396, 50);
        contentPane.add(textArea_3);
        textArea_3.setText(base.getResultRiskAccessText());

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPassword.setBounds(454, 73, 202, 35);
        contentPane.add(lblPassword);

        JTextArea textArea_4 = new JTextArea();
        textArea_4.setBounds(464, 114, 445, 50);
        contentPane.add(textArea_4);
        textArea_4.setText(base.getResultPwdText());

        JTextArea textArea_5 = new JTextArea();
        textArea_5.setBounds(464, 218, 445, 50);
        contentPane.add(textArea_5);
        textArea_5.setText(base.getResultSystemSecText());

        JLabel lblSystemProtection = new JLabel("System Protection");
        lblSystemProtection.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblSystemProtection.setBounds(454, 182, 202, 35);
        contentPane.add(lblSystemProtection);

        JLabel lblIncidentManager = new JLabel("Incident Management");
        lblIncidentManager.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblIncidentManager.setBounds(454, 279, 202, 35);
        contentPane.add(lblIncidentManager);

        JTextArea textArea_6 = new JTextArea();
        textArea_6.setBounds(464, 314, 445, 50);
        contentPane.add(textArea_6);
        textArea_6.setText(base.getResultUnauthAccessText());

        textField = new JTextField();
        textField.setBounds(233, 83, 153, 26);
        contentPane.add(textField);
        textField.setColumns(10);
        textField.setText(base.getResultVulMgmt().toUpperCase());
        if(base.getResultVulMgmt().equalsIgnoreCase("low")) {
            textField.setText(base.getResultVulMgmt());
            textField.setForeground(Color.red);
        }
        else if(base.getResultVulMgmt().equalsIgnoreCase("medium")) {
            textField.setText(base.getResultVulMgmt());
            textField.setForeground(Color.orange);
        }
        else {
            textField.setText(base.getResultVulMgmt());
            textField.setForeground(Color.green);
        }

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(233, 175, 153, 26);
        contentPane.add(textField_1);
        textField_1.setText(base.getResultAccessVal().toUpperCase());
        if(base.getResultAccessVal().equalsIgnoreCase("low")) {
            textField_1.setText(base.getResultAccessVal());
            textField_1.setForeground(Color.red);
        }
        else if(base.getResultAccessVal().equalsIgnoreCase("medium")) {
            textField_1.setText(base.getResultAccessVal());
            textField_1.setForeground(Color.orange);
        }
        else {
            textField_1.setText(base.getResultAccessVal());
            textField_1.setForeground(Color.green);
        }
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(233, 279, 153, 26);
        contentPane.add(textField_2);
        textField_2.setText(base.getResultequipSec().toUpperCase());
        if(base.getResultequipSec().equalsIgnoreCase("low")) {
            textField_2.setText(base.getResultequipSec());
            textField_2.setForeground(Color.red);
        }
        else if(base.getResultequipSec().equalsIgnoreCase("medium")) {
            textField_2.setText(base.getResultequipSec());
            textField_2.setForeground(Color.orange);
        }
        else {
            textField_2.setText(base.getResultequipSec());
            textField_2.setForeground(Color.green);
        }

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(233, 381, 153, 26);
        contentPane.add(textField_3);
        textField_3.setText(base.getResultRiskAccess().toUpperCase());
        if(base.getResultRiskAccess().equalsIgnoreCase("low")) {
            textField_3.setText(base.getResultRiskAccess());
            textField_3.setForeground(Color.red);
        }
        else if(base.getResultRiskAccess().equalsIgnoreCase("medium")) {
            textField_3.setText(base.getResultRiskAccess());
            textField_3.setForeground(Color.orange);
        }
        else {
            textField_3.setText(base.getResultRiskAccess());
            textField_3.setForeground(Color.green);
        }

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(677, 81, 153, 26);
        contentPane.add(textField_4);
        textField_4.setText(base.getResultPwd().toUpperCase());
        if(base.getResultPwd().equalsIgnoreCase("low")) {
            textField_4.setText(base.getResultPwd());
            textField_4.setForeground(Color.red);
        }
        else if(base.getResultPwd().equalsIgnoreCase("medium")) {
            textField_4.setText(base.getResultPwd());
            textField_4.setForeground(Color.orange);
        }
        else {
            textField_4.setText(base.getResultPwd());
            textField_4.setForeground(Color.green);
        }

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(677, 182, 153, 26);
        contentPane.add(textField_5);
        textField_5.setText(base.getResultSystemSec().toUpperCase());
        if(base.getResultSystemSec().equalsIgnoreCase("low")) {
            textField_5.setText(base.getResultSystemSec());
            textField_5.setForeground(Color.red);
        }
        else if(base.getResultSystemSec().equalsIgnoreCase("medium")) {
            textField_5.setText(base.getResultSystemSec());
            textField_5.setForeground(Color.orange);
        }
        else {
            textField_5.setText(base.getResultSystemSec());
            textField_5.setForeground(Color.green);
        }
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(677, 277, 153, 26);
        contentPane.add(textField_6);
        textField_6.setText(base.getResultUnauthAccess().toUpperCase());
        if(base.getResultUnauthAccess().equalsIgnoreCase("low")) {
            textField_6.setText(base.getResultUnauthAccess());
            textField_6.setForeground(Color.red);
        }
        else if(base.getResultAccessVal().equalsIgnoreCase("medium")) {
            textField_6.setText(base.getResultUnauthAccess());
            textField_6.setForeground(Color.orange);
        }
        else {
            textField_6.setText(base.getResultUnauthAccess());
            textField_6.setForeground(Color.green);
        }
    }
}