package prog5121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class Task_class
{//=========================Task_class=======================================//

    //This is Login class as "Log"//
    Login Log = new Login();
    //These are the declare variables for this task//
    public String TaskName, TaskID, TaskDescription, TaskStatus, DeveloperDetails, display, seTsk, seDev, Del;
    public int TaskNumber, TaskDuration, Hours, numTask;
    //These are the global array variables for String and int//
    String[] devDetail, name, id, status;
    int[] duration;

//------------------------------------------arrayCapture()---------------------------------------------------------------//
    public void arrayCapture()
    {
        //Here iam using the numTask to create size to store values in array//
        this.devDetail = new String[this.numTask];
        this.name = new String[this.numTask];
        this.duration = new int[this.numTask];
        this.id = new String[this.numTask];
        this.status = new String[this.numTask];
    }

//------------------------------------------taskCreation()---------------------------------------------------------------//
    public void taskCreation()
    {

        //I create a menu for user to choose //
        String[] optionsToChoose =
        {
            "Add task", "Show report", "Quit"
        };
        String choices = (String) JOptionPane.showInputDialog(null, "Please choose options below", "Options selection of EasyKanban", JOptionPane.QUESTION_MESSAGE, null, optionsToChoose, optionsToChoose[0]);

        //If user choose to add task, he must follow the inputs of GUI//
        if ("Add task".equals(choices))
        {
            //This is where we ask user to input how many task you want to add//
            String Tnum = JOptionPane.showInputDialog("How many Task add you want to add");
            this.numTask = Integer.parseInt(Tnum.replaceAll("[^0-9]", ""));
            //Iam linking here//
            this.arrayCapture();

            //I created a for loops depends according to the  number of task as user wishes to enter//
            //It loops according number of task as "numTask"//
            for (int i = 0; i < this.numTask; i++)
            {
                //These are the method needs to loop in step wise//
                //I assign the developer details with "firstName and lastname"//
                //After assign iam storing values according to the related arrays using for loops//
                String firstLast;
                firstLast = JOptionPane.showInputDialog("Please provide the First name and Last name : ");
                DeveloperDetails = firstLast;
                this.devDetail[i] = this.DeveloperDetails;

                //This is for naming the task //
                this.TaskName = JOptionPane.showInputDialog("Please provide your task name : ");
                this.name[i] = this.TaskName;

                //This is for providing the task description for task to provide more details//
                TaskDescription = JOptionPane.showInputDialog("Please provide your Task Description for : ");

                //This is for task duration, which indicates how many hours does user want to spend//
                String time = JOptionPane.showInputDialog(null, "How many hours do you want to work for : ");
                this.TaskDuration = Integer.parseInt(time.replaceAll("[^0-9]", ""));
                this.duration[i] = this.TaskDuration;

                checkTaskDescription();
                returnTaskNum();
                JOptionPane.showMessageDialog(null, createTaskID(), "Your TaskID ", JOptionPane.INFORMATION_MESSAGE);
                id[i] = this.createTaskID();
                status[i] = this.TaskStatus();
                JOptionPane.showMessageDialog(null, printTaskDetails(), "Your Task Details", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, returnTotalHours(), "Total hours of each task", JOptionPane.INFORMATION_MESSAGE);
            }
            AnythingElse();

        }
        else
        {
            //If a user choose to "show report" then output will be shown after user enter the details//
            //If not then it shows an error message or it will going to exit.//
            if ("Show report".equals(choices))
            {
                //The method report iam linking here//
                report();
                JOptionPane.showMessageDialog(null, "\t          Thank you and Have a nice day!!", "Quit message", JOptionPane.CLOSED_OPTION);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "\t          Thank you and Have a nice day!!", "Quit message", JOptionPane.CLOSED_OPTION);
                System.exit(0);

            }

        }
    }

    //------------------------------------------End of taskCreation()---------------------------------------------------------------//
    //-----------------------------------------checkTaskDescription()------------------------------------------------------------------------// 
    public boolean checkTaskDescription()
    {
        //Iam creating a condition for "TaskDescription" must be less than equal 50 characters"
        boolean description = TaskDescription.length() <= 50;

        do
        {//If description is not true then it ask user to enter valid description//
            if (!description)
            {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters", "Unsuccessfull captured", JOptionPane.ERROR_MESSAGE);
                this.TaskDescription = JOptionPane.showInputDialog("Please provide valid task description: ");
                description = TaskDescription.length() <= 50;
            }
        }

        while (!description);
        //If description is true then "successfully captured'' as an output//
        if (description == true)
        {

            JOptionPane.showMessageDialog(null, "Task successfully captured", "Successfull task", JOptionPane.INFORMATION_MESSAGE);
        }
        return true;

    }
    //-----------------------------------------End of checkTaskDescription()------------------------------------------------------------------------// 

    //---------------------------------------------createTaskID()--------------------------------------------------------------------------------------//
    public String createTaskID()
    {
        //In these taskID it uses the string manipulation to generate TaskID//
        this.TaskID = "";
        // TaskID based on "TaskName , numbers of task , DeveloperDetails ".//
        this.TaskID = this.TaskName.substring(0, 2) + ":" + numTask + ":" + this.DeveloperDetails.substring(this.DeveloperDetails.length() - 3);
        //TaskID set it as uppercase.//
        return TaskID.toUpperCase();
    }
    //---------------------------------------------End of createTaskID()--------------------------------------------------------------------------------------//

//----------------------------------returnTotalHours()-----------------------------------------------------------------------------------------------//    
    public int returnTotalHours()
    {
        //It helps to add the numbers of hours in each task.
        return Hours += TaskDuration;

    }
    //----------------------------------End of returnTotalHours()-----------------------------------------------------------------------------------------------//  

    //--------------------------------------------------returnTaskNum---------------------------------------------------------------------------------------//
    public int returnTaskNum()
    {
        //it generates the numbers of task in task number//
        numTask += TaskNumber;
        return numTask;

    }
    //--------------------------------------------------End of returnTaskNum---------------------------------------------------------------------------------------//

//--------------------------------------------------------TaskStatus()---------------------------------------------------------------------------------//
    public String TaskStatus()
    {
        //It is choosing a type of task that user is working on//
        //It helps to understand how much progress does user make for this task//
        String[] Selection =
        {
            "  To do ", "Done", " Doing "
        };
        this.TaskStatus = (String) JOptionPane.showInputDialog(null, "Please choose options below", "Selection for Task Status", JOptionPane.QUESTION_MESSAGE, null, Selection, Selection[0]);

        if ((" 1] To do ".equals(this.TaskStatus)))
        {
            printTaskDetails();
        }
        return this.TaskStatus;

    }
//--------------------------------------------------------End of TaskStatus()---------------------------------------------------------------------------------//    

//--------------------------------------------------------printTaskDetails()---------------------------------------------------------------------------------//    
    public String printTaskDetails()
    {
        //Iam linking the "TaskStatus" method in "printTaskDetails"//
//        TaskStatus();

        //This is to display the details of the each task for as user enters.//
        //Each task will show this output//
        String task = "This is your Task Status  for Task : " + " \t" + this.TaskStatus
                + "\n This is your Developer Details : " + " \t" + this.DeveloperDetails
                + "\n This is your Task number for all the Task : " + "\t" + numTask
                + "\n This is your Task name  for Task : " + "\t " + this.TaskName
                + "\n This is your Task Description for Task : " + "\t" + this.TaskDescription
                + "\n This is your Task Id for Task :" + "\t " + this.TaskID.toUpperCase()
                + "\n This is your Task Duration for Task : " + "\t " + this.TaskDuration + "hrs";

        return task;

    }
    //--------------------------------------------------------End of printTaskDetails()---------------------------------------------------------------------------------//   

    //--------------------------------------------------------AnythingElse()---------------------------------------------------------------------------------//    
    public void AnythingElse()
    {
        //This is just another question which we ask user, if they still want to enter the task or quit.
        int last = JOptionPane.showConfirmDialog(null, "If you want to add another task or Show report  say yes or no ", "yes or no for adding task or Show report", JOptionPane.YES_NO_OPTION);

        //if option was yes, then redo the task details
        if (last == JOptionPane.YES_OPTION)
        {
            taskCreation();

        }
        else
        {
            //else the output will be exit.
            if (last == JOptionPane.NO_OPTION)
            {
                capture();
            }
        }

    }
//-------------------------------------------End of AnythingElse()------------------------------------------------//

//-------------------------------------------store()------------------------------------------------//
    public void store()
    {
        //Here iam showing the specific details as I did below//
        //Iam creating a menu to choose based on the options that I give//
        //Once options has been chosen then it will take to the specific method that has linked to that options//
        String[] storing =
        {
            "A status of done", "B for longest duration", "C for search with Taskname", "D for search for assigned developer", "E for delete the Taskname", "F to show report"
        };
        String options = (String) JOptionPane.showInputDialog(null, "Please choose options below", "Options selection of for detalis capture", JOptionPane.QUESTION_MESSAGE, null, storing, storing[0]);

        //I created a switch statment for each methods//
        switch (options)
        {
            //Every case or method as own functionality//
            case "A status of done" ->
                done();

            case "B for longest duration" ->
                highValue();

            case "C for search with Taskname" ->
            {
                this.seTsk = JOptionPane.showInputDialog("Please type the name of the task");
                searchTask();
            }

            case "D for search for assigned developer" ->
            {
                this.seDev = JOptionPane.showInputDialog("Please type the developer name ");
                searchDev();
            }

            case "E for delete the Taskname" ->
            {
                this.Del = JOptionPane.showInputDialog("Please provide the taskname that you want to delete ");
                deleteTsk();
            }

            case "F to show report" ->
                report();

            default ->
                System.out.println("Sorry Error");

        }

    }
    //---------------------------------------------------End of store()-------------------------------------------------------------------------------------//

    public void capture()
    {
        int select = JOptionPane.showConfirmDialog(null, "If you want to see the details that you enter  say yes or no", "yes or no for capture task", JOptionPane.YES_NO_OPTION);
        //if option was yes, then redo the task details
        while (select == JOptionPane.YES_OPTION)
        {
            store();

            int more = JOptionPane.showConfirmDialog(null, "If you want to see any other details  say yes or no", "yes or no for capture task", JOptionPane.YES_NO_OPTION);

            if (more == JOptionPane.YES_OPTION)
            {
                store();
                more = JOptionPane.showConfirmDialog(null, "If you want to see any other details  say yes or no", "yes or no for capture task", JOptionPane.YES_NO_OPTION);

            }
            //else the output will be exit.
            if (more == JOptionPane.NO_OPTION)
            {
                //we will provide the message "Thank you" with "Developer Details"
                JOptionPane.showMessageDialog(null, "Thank you " + DeveloperDetails);
                System.exit(0);
            }

        }

    }
//-------------------------------------------------------done()-----------------------------------------------//

    public boolean done()
    {
        //Here iam creating a condition using for loop//
        //iam matching status array that contains "Done" for all tasks//
        //In other words if I find a status of done then it will display//

        for (int index = 0; index < this.status.length; index++)
        {
            while ("Done".equals(this.status[index]) == true)
            {
                //If condition is true then displays the developer, Taskname , Taskduration ,TaskStatus// 
                String dis = "The developer  :\t  " + this.devDetail[index]
                        + "\n The Taskname : \t" + this.name[index]
                        + "\n The TaskStatus : \t" + this.status[index]
                        + "\n The Task duration :  \t" + this.duration[index];

                JOptionPane.showMessageDialog(null, dis);
                return true;

            }
        }
        //If condition is false, then it will show the error message//
        JOptionPane.showMessageDialog(null, "Sorry we don't find any relating status of done", "Error finding a status of done", JOptionPane.ERROR_MESSAGE);
        return false;

    }
//-----------------------------------------------End of done()------------------------------------------------------------//

    //-----------------------------------------highValue()------------------------------------------------------------------//   
    public boolean highValue()
    {
        //Here iam comparing which duration of the Task is the highest compare to the other task//
        //Iam creating a variable called "highest" and iam assigning an array of duration to zero element("First postion")//
        int highest = this.duration[0];

        for (int d = 0; d < this.duration.length; d++)
        {
            //iam checking if the duration position is higher compare to the "highest"
            //it means it compares to values to see which one is higest//

            while (this.duration[d] > highest)
            {
                highest = this.duration[d];
                String dis = "The Developer : " + this.devDetail[d];
                JOptionPane.showMessageDialog(null, dis + "\n The longest Duration of class : " + highest);
                return true;

            }
            //else it returns false//
        }
        JOptionPane.showMessageDialog(null, "You haven't created any another hour to compare");
        return false;

    }
    //-----------------------------------End of highValue()-----------------------------------------------------//

    //-------------------------------------searchTask()----------------------------------------------------------//
    public boolean searchTask()
    {
        //Iam creating a condition to make user to search specific task as user wants//
        //Iam converting an array into list to find matching one//
        boolean find = Arrays.asList(this.name).contains(this.seTsk);
        for (int s = 0; s < this.name.length; s++)
        {
            //If find equals to the Task that was captured then it display the Taskname, Developer , TaskStatus//
            while (find == true)
            {
                String dis = "The Task name : " + this.name[s]
                        + "\n The Developer : " + this.devDetail[s]
                        + "\n The Task status : " + this.status[s];

                JOptionPane.showMessageDialog(null, dis);
                return true;
            }
            //If not then it will show the error message//

        }
        JOptionPane.showMessageDialog(null, "Sorry invalid task", "Error finding a task", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    //-------------------------------------End of searchTask()----------------------------------------------------------//
    //---------------------------------------searchDev()----------------------------------------------------------------//
    public boolean searchDev()
    {
        //Iam creating a condition to make user to search specific developer  as user wants//
        //in other words, it will display the developer that was assign to the Task//
        boolean finddev = Arrays.asList(this.devDetail).contains(this.seDev);

        for (int s = 0; s < this.devDetail.length; s++)
        {
            //Iam using for loop by using the developer array  to match the user's one//
            //If condition was true then it will display the Taskname and TaskStatus//
            while (finddev == true)
            {
                String dis = "The Task name : " + this.name[s]
                        + "\n The Task status : " + this.status[s];

                JOptionPane.showMessageDialog(null, dis, "The Assign developer of the task ", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        }
        //If not, It will show the error message//
        JOptionPane.showMessageDialog(null, "Sorry we don't find any developer that you assigned", "Error finding a assign developer", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    //----------------------------------------End of searchDev()------------------------------------------------------------//

    //----------------------------------------------delete()-----------------------------------------------------------------//
    public boolean deleteTsk()
    {
        //Iam using Array list in task name array//
        //Iam using to remove according to the user wants to delele//
        //we create a variable which user going to input the name of the Task//
        List<String> list = new ArrayList<>(Arrays.asList(this.name));
        while (list.remove(this.Del) == true)
        {
            //If it was there, then it will delete//
            this.name = list.toArray(String[]::new);
            JOptionPane.showMessageDialog(null, "Successfully deleted :  " + Del, "Successfully deleted the Task", JOptionPane.INFORMATION_MESSAGE);
            return true;

        }
        //If not, then it will show the error message//
        JOptionPane.showMessageDialog(null, "We do not find any Task that you created", "Error deleting a Task", JOptionPane.ERROR_MESSAGE);
        return false;

    }

//--------------------------------------------------------report()---------------------------------------------------------------------------------------//
    public boolean report()
    {
        //Here iam displaying the capture of a report which user has created//

        for (int i = 0; i < numTask; i++)
        {
            //These will display as Taskname, Developername , TaskID, TaskDuration , TaskStatus//
            String rep = "This Task name : " + "\t" + this.name[i]
                    + "\n The developer name : " + "\t" + this.devDetail[i]
                    + "\n The TaskID : " + "\t" + this.id[i]
                    + "\n The Task duration : " + "\t" + this.duration[i]
                    + "\n The Task status : " + "\t" + this.status[i];
            JOptionPane.showMessageDialog(null, rep, "Your Task report", JOptionPane.INFORMATION_MESSAGE);

        }
        return true;

    }
//--------------------------------------------------------End ofreport()---------------------------------------------------------------------------------------//

}//=======================End of Task_class=======================================//
