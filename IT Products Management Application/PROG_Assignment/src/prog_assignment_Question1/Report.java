package prog_assignment_Question1;

import javax.swing.JOptionPane;

public class Report
{//--------------------------------------------------------------ReportClass-------------------------------------------------------------------------------//

    //this is a report class where we use to manipulate the products//
    public static void CaptureProduct()

    {//==============================CaptureProduct()=====================================================//  
        //Here we ask user to input the number of items that you want to store//
        //the number is stored on to a array to create a size//

        int ad = Integer.parseInt(JOptionPane.showInputDialog(null, "Please provide the number of items that you add"));

        PROG_Assignment.proList = new Product[ad];

        String[] warranty =
        {
            "6 Months", "2 Years"
        };

        String[] category =
        {
            "Desktop Computer", "Laptop ", "Tablet", "Printer", "Gaming Console"
        };

        String proCode, proname, pric, stock, cat, warty, supl;

        //we use for loop to store values in an array//
        for (int v = 0; v < PROG_Assignment.proList.length; v++)
        {

            //I use variable to input the user values//
            proCode = JOptionPane.showInputDialog("Please Provide the Product code");
            proname = JOptionPane.showInputDialog("Please provide the Name of the product");
            pric = JOptionPane.showInputDialog("Please Provide the price of a product" + ": " + proname);
            stock = JOptionPane.showInputDialog("Please provide the stock levels of a product" + ": " + proname);
            cat = (String) JOptionPane.showInputDialog(null, "Please select the category of this product", "Select the Product category" + ": " + proname, JOptionPane.QUESTION_MESSAGE, null, category, category[0]);
            warty = (String) JOptionPane.showInputDialog(null, "Please select one of the following items", "Select the Product Warranty" + ": " + proname, JOptionPane.QUESTION_MESSAGE, null, warranty, warranty[0]);
            supl = JOptionPane.showInputDialog("Please provide the supplier of the product" + ": " + proname);

            //That variable is used to store on to a product constructor of an array//
            PROG_Assignment.proList[v] = new Product(proCode, proname, pric, stock, cat, warty, supl);
            JOptionPane.showMessageDialog(null, "Products has been successfully saved");

        }

        //this is for printing the method That was stored//
        Productmenu.returnMethod();
//=========================================End of captureProduct()============================================//
    }

    public static void searchProduct()
    {//================================================SearchProduct()=================================================//
        //In this method we use to search the product whether the product code it contains it or not//
        //Here we asking user to input the product code//
        String code = JOptionPane.showInputDialog(null, "Please enter the product code to search", "Search product", JOptionPane.INFORMATION_MESSAGE);
        for (int v = 0; v < PROG_Assignment.proList.length; v++)
        {
            //Iam using to array from main class to get product which must be equal to code variable input//
            if (PROG_Assignment.proList[v].getProductCode().equals(code))
            {
                //If the condition is true then print the function based on the product code//
                JOptionPane.showMessageDialog(null, PROG_Assignment.proList[v].toString());
                Productmenu.returnMethod();
            }
            else
            {
                if (!PROG_Assignment.proList[v].getProductCode().contains(code))
                {
                    //If the product code did not match the code variable then it will show this message//
                    JOptionPane.showMessageDialog(null, "Invalid code", "Error code", JOptionPane.ERROR_MESSAGE);
                    Productmenu.returnMethod();

                }

            }

        }
//============================================End of SearchProduct()==============================================//
    }

    public static void deleteProduct()
    {//================================================deleteProduct()==========================================//
        //Iam asking user provide the product code to delete the product
        String code = JOptionPane.showInputDialog(null, "Please enter the product code to delete", "Delete product", JOptionPane.INFORMATION_MESSAGE);
        for (int v = 0; v < PROG_Assignment.proList.length; v++)
        {
            //if the condition has met then delete the product //
            if (PROG_Assignment.proList[v].getProductCode().equals(code))
            {

                PROG_Assignment.proList[v] = null;
                JOptionPane.showMessageDialog(null, "Successfully deleted the Product" + " " + PROG_Assignment.proList[v].getProductCode(), "Deleted the Product", JOptionPane.INFORMATION_MESSAGE);
                Productmenu.returnMethod();

            }
            else
            {
                //If the condition has not met the conditon then it will show the error message//
                if (!PROG_Assignment.proList[v].getProductCode().equals(code))
                {
                    JOptionPane.showMessageDialog(null, "Invalid Code", "Error Code", JOptionPane.ERROR_MESSAGE);
                    Productmenu.returnMethod();
                }

            }
        }
//===============================================End of deleteProduct()============================================//
    }

    public static void updateProduct()
    {//==================================updateProduct()========================================//
        //In this method we ask user if they want to update a product which we use the product code that they provide//
        String code = JOptionPane.showInputDialog(null, "Please enter the product code to update", "Update product", JOptionPane.INFORMATION_MESSAGE);

        for (int v = 0; v < PROG_Assignment.proList.length; v++)
        {
            //if condition has met then it will do the process//
            if (PROG_Assignment.proList[v].getProductCode().equals(code))
            {
                //here I created a methods for updating warranty,price,stock at the same time//
                //each method contains it's own process//
                updateWarrantyProduct();
                updatePriceProduct();
                updateStockLevels();

            }
            else
            {
                if (!PROG_Assignment.proList[v].getProductCode().equals(code))
                {
                    //if the condtion has not met then it will show the error message//
                    JOptionPane.showMessageDialog(null, "Invalid code", "Error code", JOptionPane.ERROR_MESSAGE);
                    Productmenu.returnMethod();

                }

            }
        }
    }

    public static void updateWarrantyProduct()
    {

        //This method for updating warranty of a product so we ask if they insterested to update the product or not//
        int chose = JOptionPane.showConfirmDialog(null, "If you want to update a product say yes or no", "Update Product", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chose == JOptionPane.YES_OPTION)
        {
            for (int v = 0; v < PROG_Assignment.proList.length; v++)
            {
                //If they chosen yes, then we ask user to input to chose the warranty of a product//
                String[] warranty =
                {
                    "6 Months", "2 Years"
                };

                String warty = (String) JOptionPane.showInputDialog(null, "Please select one of the following items", "Select the Product Warranty" + ":" + PROG_Assignment.proList[v].getProductCode(), JOptionPane.QUESTION_MESSAGE, null, warranty, warranty[0]);
                //After the following option they chose it will going to update the warranty//
                PROG_Assignment.proList[v].setWarranty(warty);

            }

        }
        else
        {
            //If user is chosen yes then it will redirect to the updatePriceProduct//
            if (chose == JOptionPane.NO_OPTION)
            {
                updatePriceProduct();
            }
        }
    }

    public static void updatePriceProduct()
    {
        //same process like updating warranty product but only difference here is we updating the price of a product//
        int chose = JOptionPane.showConfirmDialog(null, "If you want to update a Price of a product say yes or no", "Price Product", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chose == JOptionPane.YES_OPTION)
        {
            for (int v = 0; v < PROG_Assignment.proList.length; v++)
            {
                String pric = JOptionPane.showInputDialog("Please Provide the price of a product" + ":" + PROG_Assignment.proList[v].getProductCode());
                PROG_Assignment.proList[v].setPrice(pric);
            }

        }
        else
        {
            //if user chosen no option it will redirect to the stock levels//
            if (chose == JOptionPane.NO_OPTION)
            {
                updateStockLevels();
            }
        }

    }

    public static void updateStockLevels()
    {

        int chose = JOptionPane.showConfirmDialog(null, "If you want to update a stock levels say yes or no", "Product Stock", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (chose == JOptionPane.YES_OPTION)
        {
            //we ask user to provide the stock that you want to update//
            //it will change in the array//

            for (int v = 0; v < PROG_Assignment.proList.length; v++)
            {
                String stock = JOptionPane.showInputDialog("Please provide the stock levels of a product" + ":" + PROG_Assignment.proList[v].getProductCode());
                PROG_Assignment.proList[v].setStock(stock);
            }

        }
        else //if user chosen has no option then it will redirected to the menu//
        if (chose == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Product details has been updated successfully", "Successfully Updated", JOptionPane.INFORMATION_MESSAGE);

            Productmenu.returnMethod();
        }

    }

    public static void totalReportValue()
    {//============================================totalReportValue()================================//
        //it is where we displaying the report//
        int total = 0;
        for (int v = 0; v < PROG_Assignment.proList.length; v++)
        {
            JOptionPane.showMessageDialog(null, PROG_Assignment.proList[v].toString());
            total += Integer.parseInt(PROG_Assignment.proList[v].getPrice());

        }
        //we use for loop to display the number of products that has been captured//
        JOptionPane.showMessageDialog(null, "Total Product Count :" + " " + PROG_Assignment.proList.length);
        //we use variable called "total'' to store the prices of a each product which will add up//
        JOptionPane.showMessageDialog(null, "Total product value :" + " " + total);
        //this is for average product value by diving the total value to a length of an array//
        JOptionPane.showMessageDialog(null, "Average product value : R" + total / PROG_Assignment.proList.length);

        newProduct();
//=======================================End of totalReportValue()===========================================//
    }

    public static void newProduct()
    {//==========================================newProduct()===============================================//
        //we ask user to if they capture new products say yes or no//

        int chose = JOptionPane.showConfirmDialog(null, "If you want to capture new products say yes or no", "Adding new Products", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        //if yes then it will redirect to a capture product class//
        if (chose == JOptionPane.YES_OPTION)
        {
            CaptureProduct();
        }
        else
        {
            if (chose == JOptionPane.NO_OPTION)
            {
                JOptionPane.showMessageDialog(null, "Thank you");
                System.exit(0);

            }
        }
        //==================================End of newProduct()=====================================================//
    }

}//---------------------------------------------------------End of Report Class----------------------------------------------------------------------------//
