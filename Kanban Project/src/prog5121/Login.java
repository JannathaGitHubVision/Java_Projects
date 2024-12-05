package prog5121;

import javax.swing.JOptionPane;

//===================THE START OF CLASS========================//
public class Login
{
// Here iam declaring global variable throught out the code.

    public String password;
    public String username;
    public String firstname, lastname;

//-----------------------------------Input----------------------------------------------------------------------//
    public void input()
    {
        // Here iam getting details from input for registration details

        this.firstname = JOptionPane.showInputDialog("Please provide your name");
        this.lastname = JOptionPane.showInputDialog("Please provide your last name");

        this.username = JOptionPane.showInputDialog(null, "Please provide your username");
        this.password = JOptionPane.showInputDialog(null, "Please provide your password ");
        

    }
//-----------------------------------End of Input------------------------------------------------------------------//
//
//
//
    //-----------------------------------------CheckUsername-------------------------------------------------//

    public boolean checkUsername()
    {
        //Here I making a condition for username by using if statements.
        //The User needs to match this username condition in order to proceed.
        if ((this.username.length() <= 5) && (this.username.contains("_")))
        {

            return true;
        }
        else
        {

            return false;
        }

        //-------------------------------------------End of CheckUsername-------------------------------------------------//       
    }

//_________________________Matching the all the conditions for the password___________________________// 
    //It contains Three methods for password namely,
    //CheckDigitComplexity
    //CheckSpecialCharacter
    //CheckCaptialLetter
    //Every method contains unique condition which User must match according to those condition in order to procced.
    //--------------------------------CheckDigitComplexity-------------------------------------------------------------//
    public boolean CheckDigitComplexity(String password)

    {
        //Here iam making condition for a digit in a Password.
        char v;

        for (int i = 0; i < password.length(); i++)
        {
            v = password.charAt(i);
            if (Character.isDigit(v))
            {
                return true;

            }

        }
        return false;

    }
    //--------------------------------End of CheckDigitComplexity-------------------------------------------------------------//

//----------------------CheckSpecialCharacter---------------------------------------------------//
    public boolean CheckSpecialCharacter(String password)
    {
        //Here iam making a condition for User to have a special character for password.
        //Having a special character creates Strong Password.
        char v;
        for (int i = 0; i < password.length(); i++)
        {
            String specialChr = "!@#$%^&*()_+|~?></*";
            v = password.charAt(i);

            if (specialChr.contains(v + ""))
            {
                return true;
            }
        }
        return false;

    }//------------------------End of CheckSpecialCharacter --------------------------------------------------//

    //---------------------CheckCaptialLetters-----------------------------//
    public boolean CheckCaptialLetters(String password)
    {
        //Here iam making a condition for User to have a any Character  have a Upper case.
        char v;
        for (int i = 0; i < password.length(); i++)
        {
            v = password.charAt(i);
            if (Character.isUpperCase(v))
            {
                return true;
            }
        }
        return false;

    }//---------------------------End of CheckCaptialLetters------------------------------------//

    //-----------------------------CheckPasswordComplexity----------------------------------------------------//
    public boolean checkPasswordComplexity()

    {

        // Here we checking if password contains a number,captial letter,small letters and special characters;
        // //The User needs to match this Password  four conditions in order to proceed.
        if (CheckDigitComplexity(this.password) == true && CheckSpecialCharacter(this.password) == true && CheckCaptialLetters(this.password) == true && this.password.length() >= 8)
        {
            return true;
        }
        else
        {
            return false;
        }

    }  //---------------------------------------End of conditions for password--------------------------------------------------------//
//
//
//
    //-------------------------------------------------Username----------------------------------------------------------------------//

    public boolean Username()
    {
        //Iam using CheckUsername method to see if User matches the condition.
        //I provided the messages according to the true or false using If's statements.
        if (checkUsername() == true)
        {
            JOptionPane.showMessageDialog(null, "Username successfully captured", "Username register successfull ", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Username is not correctly formmated, please ensure that your username contains an underscore and is no more than 5 characters in length", "username incorrectly formated", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    //-----------------------------------------------End of the username---------------------------------------------------------//

//----------------------------------------------------------------------------Password---------------------------------------------------//
    // This is for checking if a user enter the password which matches the password condition and show messages.
    public boolean Password()
    {
        //Iam using CheckPasswordComplexity method to see if User matches the condition.
        //I provided the messages according to the true or false using If's statements.
        if (checkPasswordComplexity() == true)
        {
            JOptionPane.showMessageDialog(null, "Password successfully captured", "Password register successfull ", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted please ensure that the password contains"
                    + " at least 8 characters, a captial letter,a number and a special character;", "Password dialong", JOptionPane.ERROR_MESSAGE);

            return false;

        }
    }
    //---------------------------------------------------------------End of password-----------------------------------------------//

    //----------------------------------------RegisterUser-------------------------------------------------------//
    public String registerUser()
    {
        //Here iam linking input method here to get details.
        input();

        //Here iam linking Username as User_name.
        boolean User_name = Username();
        //Here iam creating a loop if User's does not type perfect username.
        //it will loop until the user type perfect username condition.
        do
        {
            if (!User_name)
            {
                //This is message for displaying the wrong username without meeting the conditions.
                username = JOptionPane.showInputDialog("It requires valid username for registration");
                User_name = Username();
            }
        }
        while (!User_name);

        //Here iam linking Password as Pass..
        boolean Pass = Password();
        do
        {
            if (!Pass)
            {
                //This is message for displaying the wrong username without meeting the conditions.
                password = JOptionPane.showInputDialog("It requires valid password for registration");
                Pass = Password();
            }

        }
        while (!Pass);
        //Here iam making User_name and Pass both condition needs to be in order for regestration.
        if ((User_name == true) && (Pass == true))
        {

            return "Username and Password successfully registered";
        }
        else
        {

            return "It may be Username or Password does not match the condition to register";
        }
    }

//-----------------------------------------End of RegisterUser-----------------------------------------------------------------------//
    // This is just for unit testing by using overload method.
    // it doesn't involve part of the actual process
    public String registerUserTest()
    {
        boolean User_name = Username();
        boolean Pass = Password();
        if ((User_name == true) && (Pass == true))
        {
            return "Username and Password successfully registered";
        }
        else
        {
            return "It may be Username or Password does not match the condition to register";
        }
    }

    //----------------------------------------------LoginUser----------------------------------------------------------------------//
    public boolean loginUser()
    {
        //Here iam declaring LogUser and LogPass
        //Here iam comparing if User's registration for username and password matches in LogUser and LogPass.
        String LogUser;
        LogUser = JOptionPane.showInputDialog("Please provide your login user");

        String LogPass;
        LogPass = JOptionPane.showInputDialog("Please provide your login password");

        if (LogUser.equals(username) && LogPass.equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    //--------------------------------End of LoginUser---------------------------------------------------------------------//
    //---------------------------------ReturnLoginStatus--------------------------------------------------------//
    public String ReturnLoginStatus()
    {
        String messageReturn = "";
        //Here iam linking LoginUser() as use_pass;
        //It loops, if User matches the login and registration.
        boolean use_pass = loginUser();
        while (!use_pass)
        {
            //Here iam providing message for User to check their Username and Password.
            JOptionPane.showMessageDialog(null, "The Username or Password incorrect please try again", "Login unsuccessfull", JOptionPane.ERROR_MESSAGE);
            use_pass = loginUser();
        }
        //If this was Successful then welcome message will pop up.
        messageReturn = "Welcome "
                + firstname
                + " "
                + lastname
                + " It is great to see you";

        return messageReturn;

    }

//------------------------------------End of ReturnLoginStatus---------------------------------------------//
}

//=============================END OF CLASS===================================//

