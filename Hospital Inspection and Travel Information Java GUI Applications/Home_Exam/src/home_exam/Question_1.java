/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home_exam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Question_1 implements ActionListener
{

    //-----------------------------Buttons-----------------------------//
    private final  JButton savebutton = new JButton("SAVE");
    private final  JButton clearbutton = new JButton("CLEAR");
    private  final JButton Printbutton = new JButton("PRINT");
    private  final JButton okbutton = new JButton("OK");
    
    //-----------------------------MenuItem---------------------------//
    private  final JMenuItem sav = new JMenuItem("Save");
    private  final JMenuItem print = new JMenuItem("Print");
    private final  JMenuItem clear = new JMenuItem("Clear");
    private final JMenuItem exit = new JMenuItem("Exit");
    
    //------------------------JTextField--------------------------------//
    private final JTextField textField1 = new JTextField();
    private  final JTextField textField2 = new JTextField();
    private final JTextArea textField3 = new JTextArea(3, 3);
    
    //-----------------------JcomboBox------------------------------------//
     private  JComboBox combo = new JComboBox();
     
     //--------------------------frame-----------------------------------//
     private final JFrame errorFrame = new JFrame();
     
     //------------------------Label---------------------------------//
     private final JLabel label = new JLabel();
     //-----------------------Panel-------------------------------------//
     private final JPanel panel = new JPanel();
    
    private int count = 0;
//--------------------------------------------HospitalInspection()------------------------------------------//
    public void HospitalInspection()
    {
        //These are the hospital inspections frame//
        JFrame frame = new JFrame("Hospital Inspections");
        String[] years =
        {
            "1 Years", "2 Years", "3 Years", "4 Years", "5 Years"
        };
        combo = new JComboBox(years);
        //labels//
        JLabel label1 = new JLabel("Hospital Name:");
        JLabel label2 = new JLabel("Hospital Location:");
        JLabel label3 = new JLabel("Years Since Inspection:");

        //textfield//
        textField1.setBackground(Color.white);
        textField2.setBackground(Color.white);
        textField1.setPreferredSize(new Dimension(100, 20));
        textField2.setPreferredSize(new Dimension(20, 5));
        textField3.setPreferredSize(new Dimension(100, 100));

        //menu bar//
        JMenuBar menu = new JMenuBar();
        //menu items
        JMenu fileMenu = new JMenu("File");
        JMenu toolsMenu = new JMenu("Tools");

        menu.add(fileMenu);
        menu.add(toolsMenu);

        toolsMenu.add(sav);
        toolsMenu.add(print);
        toolsMenu.add(clear);

        clear.addActionListener(this);
        print.addActionListener(this);

        fileMenu.add(exit);
        exit.addActionListener(this);

        //Button action//
        savebutton.addActionListener(this);
        savebutton.setPreferredSize(new Dimension(50, 50));
        clearbutton.addActionListener(this);
        Printbutton.addActionListener(this);
        
         ImageIcon icon = new ImageIcon("host.PNG");
         
         //Frame layout I used Gridlayout//
        frame.setIconImage(icon.getImage());
        frame.setLayout(new GridLayout(6, 0, 30, 30));
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(combo);
        frame.add(new JPanel());
        frame.add(savebutton);
        frame.add(new JPanel());
        frame.add(textField3);
         frame.add(Printbutton);
         frame.add(clearbutton);
        frame.setBounds(500, 100, 500, 570);
        frame.setJMenuBar(menu);
//         frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getRootPane().setBorder(
                BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //These are the particular action events would occur as they click//
        if ((e.getSource() == savebutton) || (e.getSource() == sav))
        {
            //These is for displaying the text of information which user has used//
            String show = String.format("Hospital Name : %s \nHospital Location : %s \nYears Since Inspection : %s \n************************************", textField1.getText(), textField2.getText(), combo.getSelectedItem());

            textField3.setText(show);
            textField3.setLineWrap(true);
            textField3.setWrapStyleWord(true);
            
            count++;
            if(count>5)
            {
                label.setText("<html><p> Maximum Inspection count Reached! <p></html>");

                label.setVerticalTextPosition(JLabel.CENTER);

                ImageIcon icon = new ImageIcon("Information Icon.PNG");
                Image info = icon.getImage();
                Image infoMod = info.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);

                icon = new ImageIcon(infoMod);

                label.setIcon(icon);
                label.setHorizontalAlignment(JLabel.LEFT);

                panel.setLayout(new BorderLayout());
                panel.setBounds(300, 115, 70, 40);

                panel.add(okbutton);

                errorFrame.setTitle("Message");
                errorFrame.setBounds(500, 180, 400, 200);
                errorFrame.add(panel);
                errorFrame.add(label);
                okbutton.addActionListener(this);
                okbutton.setBackground(new Color(135, 206, 235));
                errorFrame.setResizable(false);
                errorFrame.setVisible(true);
                
            }

        }
        else
        {
            //This is for clear button//
            if ((e.getSource() == clearbutton) || (e.getSource() == clear))
            {
                textField3.setText("");
            }
            else
            {
                //If they user press printbutton then it perform//
                if ((e.getSource() == Printbutton) || (e.getSource() == print))
                {
                    ArrayList<String> store = new ArrayList<>();
                    store.add(textField3.getText());
                   JList jList = new JList(store.toArray());
                   
                }
                else
                {
                    //If they press exit button//
                    if (e.getSource() == exit)
                    {
                        
                        System.exit(0);

                    }
                    else
                    {
                        //if they press ok button//
                        if(e.getSource() == okbutton)
                        {
                            errorFrame.setVisible(false);
                        }
                    }
                }
            }
        }
//---------------------------------------------End of Hospital Inspection()----------------------------------------------//
    }
}
