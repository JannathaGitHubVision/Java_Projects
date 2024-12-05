package prog_assignment_Question1;

import javax.swing.JOptionPane;
public class Productmenu
{//---------------------------------------------------------------------productMenu-----------------------------------------------------------------------//

    public static void displayMenu()
    {
        //this is for displaying the menu to welcoming the user//
        int chose = JOptionPane.showConfirmDialog(null, """
                                                         BRIGHT FUTURE TECHNOLOGIES APPLICATION
                                                        ****************************************************
                                                         Enter Yes to launch menu or Press No to exit""", "Menu", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        //I link the method to input the yes or no value///
        menuItems(chose);

    }

    public static void menuItems(int item)
    {
        //Based on the response of a user does the following//
        //if user has chosen yes option then menu to chose options//
        if (item == JOptionPane.YES_OPTION)
        {
            String[] items =
            {
                "Capture a new product", "Search for a product", "Update a product", "Delete a product", "Print report", "Exit Application"
            };
            String s = (String) JOptionPane.showInputDialog(null, "Please select one of the following items", "Items menu", JOptionPane.QUESTION_MESSAGE, null, items, items[0]);
            //based on selection of a menu it will store on to a selection method//
            selection(s);

        }
        else
        {
            if (item == JOptionPane.NO_OPTION)
            {
            //if user has chosen no option then it will show messages and it exits the application
                JOptionPane.showMessageDialog(null, "Thank you");
                System.exit(0);
            }

        }

    }

    public static void selection(String select)
    {
        //This method for based on the menu selection it will redirects to the method//
        //I use switch statment to based on select variable//
        switch (select)
        {
            case "Capture a new product":
                Report.CaptureProduct();
            case "Search for a product":
                Report.searchProduct();
            case "Update a product":
                Report.updateProduct();
            case "Delete a product":
                Report.deleteProduct();
            case "Print report":
                Report.totalReportValue();
            case "Exit Application":
                JOptionPane.showMessageDialog(null, "Thank you");
                System.exit(0);
        }
    }

    public static void returnMethod()
    {
        //It is where user will redirects to this method after they done with the method//
        //every method in report class contains this method to redirects to the menu//
        int select = JOptionPane.showConfirmDialog(null, "Enter Yes to launch menu or No to exit", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (select == JOptionPane.YES_OPTION)
        {
            String[] items =
            {
                "Capture a new product", "Search for a product", "Update a product", "Delete a product", "Print report", "Exit Application"
            };

            String s = (String) JOptionPane.showInputDialog(null, "Please select one of the following items", "Items menu", JOptionPane.QUESTION_MESSAGE, null, items, items[0]);
            selection(s);

        }
        else
        {
            if (select == JOptionPane.NO_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Thank you");
                System.exit(0);
            }
        }

    }

}//-------------------------------------------------------------------------End of productMenu()------------------------------------------------------//
