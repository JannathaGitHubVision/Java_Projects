package Prog_assignment_Question2;

import javax.swing.JOptionPane;

public class CarsShowroomMenu
{//============================================menu2===============================//
//In this menu iam displaying the cars which user has to select based on the options that has provided//

    public static void display()
    {

        String[] dis =
        {
            "View all Cars", "View Car by Each", "Exit"
        };

        String show = (String) JOptionPane.showInputDialog(null, "Welcome to the VickyCars Traders", "Select the option below to view our stock", JOptionPane.QUESTION_MESSAGE, null, dis, dis[0]);
        choose(show);
        //==============================End of menu ============================================//
    }

    public static void choose(String show)
    {
        // Check if the show variable is null
        if (show == null)
        {
            // If it's null, we can return or handle it accordingly
            JOptionPane.showMessageDialog(null, "No option selected. Exiting.");
            System.exit(0); // Exit the program or handle it as needed
            return; // Exit the method
        }

        // The rest of your code remains unchanged
        String[][] carsShowRoom =
        {
            {
                "Toyota", "Hilux", " 6 Xtra Cab 4x4", "2019", "White", "R539,900"
            },
            {
                "BMW", "3 series", "320D ", "2021", "Alpine White", "R789,900"
            },
            {
                "VolksWagen", "Golf ", " Convertible", " 2020", "Black", "R850,450"
            },
            {
                "Ford", "Everest", "Convertible", " 2019", "white", " R125,000"
            }
        };

        // Check the user's choice
        if (show.equals("View all Cars"))
        {
            BrandedCars.manyCars(carsShowRoom);
        }
        else if (show.equals("View Car by Each"))
        {
            String[] diffCars =
            {
                "View Toyota cars", "View Ford cars", "View Volkswagen cars", "View BMW Cars"
            };

            String car = (String) JOptionPane.showInputDialog(null, "Please Select the option to view detailed cars", "View Cars", JOptionPane.QUESTION_MESSAGE, null, diffCars, diffCars[0]);
            switch (car)
            {
                case "View Toyota cars":
                    BrandedCars.toyataCars(carsShowRoom);
                    break; // Add break statements to prevent fall-through
                case "View Ford cars":
                    BrandedCars.fordCars(carsShowRoom);
                    break;
                case "View Volkswagen cars":
                    BrandedCars.volksCars(carsShowRoom);
                    break;
                case "View BMW Cars":
                    BrandedCars.BMWCars(carsShowRoom);
                    break;
                default:
                    // Handle case where no valid option is selected
                    JOptionPane.showMessageDialog(null, "No valid option selected.");
                    break;
            }
        }
        else if (show.equals("Exit"))
        {
            JOptionPane.showMessageDialog(null, "Thank you");
            System.exit(0);
        }

        //=====================================End of Choose()=======================================//
    }

}//----------------------------------------------------------------------------End of CarsShowroomMenu---------------------------------------------------------------------------//
