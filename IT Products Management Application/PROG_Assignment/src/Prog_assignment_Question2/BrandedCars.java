package Prog_assignment_Question2;

import javax.swing.JOptionPane;

public class BrandedCars
{//------------------------------------------------------------BrandedCars()-------------------------------------------------------------------------//

    public static void manyCars(String[][] carSales)
    {//========================ManyCars()=============================================//
        //i created the carslaes 2d arrray in paranthesis to link the 2d array in menu and to use it on to a for loop//
        //Iam using for loop to to display the values based on the position on 2d array//
        for (int i = 0; i < carSales.length; i++)
        {
            Cars show = new Cars(carSales[i][0], carSales[i][4],
                    carSales[i][3], carSales[i][1], carSales[i][2], carSales[i][5]); 
            JOptionPane.showMessageDialog(null, show.toString(), "The Cars", JOptionPane.INFORMATION_MESSAGE); 
        }
       
    } //===============================End of many Cars()==================================//

    public static void toyataCars(String[][] carSales)
    {//========================ToyataCars()=============================================//

        for (int i = 0; i < carSales.length; i++)
        {
        //This process almost same like manycars method but only thing is difference is I created if function//
        //In if function Iam searching the name of "Toyata" so based on search am displaying the value//
            if (carSales[i][0].equals("Toyota"))
            {
                Cars show = new Cars(carSales[i][0], carSales[i][4],
                        carSales[i][3], carSales[i][1], carSales[i][2], carSales[i][5]); 
                JOptionPane.showMessageDialog(null, show.toString()); 
            }
            else
            {
                if (!carSales[i][0].equals("Toyota"))
                {
                    System.exit(0);
                }
            }
        }
//========================End of ToyataCars()=============================================//
    }

    public static void BMWCars(String[][] carSales)
    {//========================BMW Cars()=============================================//


        for (int i = 0; i < carSales.length; i++)
        {
            if (carSales[i][0].equals("BMW"))
            {
                Cars show= new Cars(carSales[i][0], carSales[i][4],
                        carSales[i][3], carSales[i][1], carSales[i][2], carSales[i][5]); 
                JOptionPane.showMessageDialog(null, show.toString()); 
            }
            else
            {
                if (!carSales[i][0].equals("Toyota"))
                {
                    System.exit(0);
                }
            }
        }
//========================End of BMW Cars()=============================================//
    }

    public static void volksCars(String[][] carSales)
    {//========================volks Cars()=============================================//
        for (int i = 2; i < carSales.length; i++)
        {
            if (carSales[i][0].equals("VolksWagen"))
            {
                Cars show = new Cars(carSales[i][0], carSales[i][4],
                        carSales[i][3], carSales[i][1], carSales[i][2], carSales[i][5]);
                JOptionPane.showMessageDialog(null, show.toString()); 

            }
            else
            {
                if (!carSales[i][0].equals("VolksWagen"))
                {
                    System.exit(0);
                }
            }
        }
//========================End of VolksCars()=============================================//
    }

    public static void fordCars(String[][] carSales)
    {//========================fordCars()=============================================//

        for (int i = 3; i < carSales.length; i++)
        {
            if (carSales[i][0].equals("Ford"))
            {
                Cars show = new Cars(carSales[i][0], carSales[i][4],
                        carSales[i][3], carSales[i][1], carSales[i][2], carSales[i][5]); 
                JOptionPane.showMessageDialog(null, show.toString()); 
            }
            

        }
//========================End of fordCars()=============================================//
    }
//--------------------------------------------------------------------End of Branded Cars()-------------------------------------------------------------//
}
