package prog_assignment_Question1;

import javax.swing.JOptionPane;

public class PROG_Assignment
{
    //I make static of a product class had proList to store objects here//

    static Product[] proList = new Product[10];

    public static void main(String[] args)
    {
        //I create instance method here to display the hardcode values//
        //This is to display the values that was stored , if you insterested you can run it by just removing the comments//
        displayValues();

        //This is main assignment class that i created//
        Productmenu.displayMenu();

    }

    public static void displayValues()
    {
        //this is a hardcode for product class to display the values that was inputed on a constructor by using instance//
        Product pro1 = new Product("A55", "Elitebook", "12000", "3", "Laptop", "2 years", "IT_4_Africa");
        Product pro2 = new Product("A54", "ExtremeBook", "12500", "3", "Tablet", "6 months", "IT_3_Africa");
        Product pro3 = new Product("A56", "Ps5", "8500", "3", "Gaming Console", "2 years", "Game_4_Africa");
        Product pro4 = new Product("A57", "Asus", "1200", "1", "Laptop", "2 years", "Incredible_connections");
        Product pro5 = new Product("A58", "Hp", "1800", "2", "Laptop", "2 years", "Game");
        Product pro6 = new Product("A59", "Elitebook", "12000", "3", "Laptop", "2 years", "IT_4_Africa");
        Product pro7 = new Product("A60", "ExtremeBook", "12500", "3", "Tablet", "6 months", "IT_3_Africa");
        Product pro8 = new Product("A61", "Ps5", "8500", "3", "Gaming Console", "2 years", "Game_4_Africa");
        Product pro9 = new Product("A62", "Asus", "1200", "1", "Laptop", "2 years", "Incredible_connections");
        Product pro10 = new Product("A63", "Hp", "1800", "2", "Laptop", "2 years", "Game");

        //I created a proList array as a "static" to store values of instance of a product class to display the values//
        //every instance contains its own constructor which was used to print the "tostring" from a product class//
        proList[0] = pro1;
        proList[1] = pro2;
        proList[2] = pro3;
        proList[3] = pro4;
        proList[4] = pro5;
        proList[5] = pro6;
        proList[6] = pro7;
        proList[7] = pro8;
        proList[8] = pro9;
        proList[9] = pro10;

        //I use for loop to print this function in Joptionpane using toString//
        for (int v = 0; v < proList.length; v++)
        {
            JOptionPane.showMessageDialog(null, proList[v].toString());
        }

    }

}
