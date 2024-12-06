package home_exam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Question_3 implements ActionListener
{
//-----------------------------------JComboBox--------------------------------//

    private JComboBox start = new JComboBox();
    private JComboBox end = new JComboBox();
    private JComboBox travel = new JComboBox();

    //---------------------------------Button-------------------------------//
    private final JButton sub = new JButton("SUBMIT");
    private final JButton okbutton = new JButton("OK");

    //-------------------------TextArea--------------------------------//
    private final JTextArea display = new JTextArea();

    //--------------------------Frame--------------------------------//
    private final JFrame messageframe = new JFrame();

    //------------------label-----------------------------------//
    private final JLabel label = new JLabel();

    //-------------------------Panel-------------------------------//
    private final JPanel panel = new JPanel();

    //--------------------------------------------------Travel--------------------------------------------//
    public void travel()
    {

        String[] locations =
        {
            "Cape Town", "Durban", "Port Elizabeth"
        };
        String[] tra =
        {
            "Airplane", "Train"
        };

        //Combo boxes 
        start = new JComboBox(locations);
        end = new JComboBox(locations);
        travel = new JComboBox(tra);

        //Labels//
        JLabel label1 = new JLabel("Start Location: ");
        JLabel label2 = new JLabel("End Location: ");
        JLabel label3 = new JLabel("Travel By: ");

        sub.addActionListener(this);

        //Frame//
        JFrame frame = new JFrame();
        frame.setTitle("Travel Log");
        ImageIcon image = new ImageIcon("tra.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(new GridLayout(5, 2, 80, 30));
        frame.add(label1);
        frame.add(start);
        frame.add(label2);
        frame.add(end);
        frame.add(label3);
        frame.add(travel);
        frame.add(new JPanel());
        frame.add(sub);
        frame.add(display);
        frame.setBounds(500, 50, 600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getRootPane().setBorder(
                BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //if user enters the sub button//
        if (e.getSource() == sub)
        {
            String show = String.format("""
                                        TRAVEL LOG 
                                        *************************************************
                                        Destination 1: %s
                                        Destination 2: %s
                                        Travel By: %s
                                        *************************************************""", start.getSelectedItem(), end.getSelectedItem(), travel.getSelectedItem());

            //for text display//
            display.setText(show);
            display.setPreferredSize(new Dimension(500, 500));
            display.setLineWrap(true);
            display.setWrapStyleWord(true);

            try
            {
                //Here iam creating a sequential data files here//
                JComboBox combo = new JComboBox();
                FileWriter writeFile = new FileWriter("travel.txt");
                writeFile.write(start.getSelectedItem().toString() + "," + end.getSelectedItem().toString() + "," + travel.getSelectedItem().toString());
                writeFile.write(display.getText());
                writeFile.close();

                //this is travel text file which user that stores//
                File file = new File("travel.txt");

                Scanner Readfile = new Scanner(file);
                while (Readfile.hasNextLine())
                {
                    String data = Readfile.nextLine();
                    System.out.println(data);
                    String[] store =
                    {
                        data
                    };
                    combo = new JComboBox(store);

                }

            } catch (IOException f)
            {
                System.out.println(f);
            }

            //if user has the same locations//
            if (start.getSelectedItem().equals(end.getSelectedItem()))
            {
                //This is for displaying messages//
                label.setText("<html><p> Destinations cannot be the same!!! <p></html>");

                label.setVerticalTextPosition(JLabel.CENTER);

                //This is for displaying icon//
                ImageIcon icon = new ImageIcon("Information Icon.PNG");
                Image info = icon.getImage();
                Image infoMod = info.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);

                icon = new ImageIcon(infoMod);

                label.setIcon(icon);
                label.setHorizontalAlignment(JLabel.LEFT);

                panel.setLayout(new BorderLayout());
                panel.setBounds(300, 115, 70, 40);

                //messages frames that I displayed//
                panel.add(okbutton);
                display.setText("");
                messageframe.setTitle("Message");
                messageframe.setBounds(500, 180, 400, 200);
                messageframe.add(panel);
                messageframe.add(label);
                okbutton.setBackground(new Color(135, 206, 235));
                okbutton.addActionListener(this);
                messageframe.setResizable(false);
                messageframe.setVisible(true);

            }

        }
        else
        {
            //if user enters the ok button
            if (e.getSource() == okbutton)
            {
                messageframe.setVisible(false);
            }
        }
    }

    //-------------------------------------------------------------End of travel--------------------------------------------//
}
