package prog5121;

//=====================THE START OF THE MainTasks==================//
import javax.swing.JOptionPane;

public class MainTasks
{

    //==================THE MAIN METHOD=============//
    public static void main(String[] args)
    {
        //This is for registering the user's username and password

        Login Log = new Login();

        JOptionPane.showMessageDialog(null, Log.registerUser(), "Successfull register", JOptionPane.INFORMATION_MESSAGE);

        // This is for login for user's username and password.
        JOptionPane.showMessageDialog(null, Log.ReturnLoginStatus(), "Successfull login ", JOptionPane.INFORMATION_MESSAGE);

        Task_class TaskFea = new Task_class();
        //If a user register successfully then they have to do the following//
        JOptionPane.showMessageDialog(null, "Welcome to the EasyKanban");
        //This is for creating a task//
        //capturing the task also//
        TaskFea.taskCreation();

    }//================THE END OF TASK1============================//

}//====================THE END OF THE FILE========================//
