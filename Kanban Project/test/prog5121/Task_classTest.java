/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prog5121;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Task_classTest
{

    Task_class tsk = new Task_class();

    @Test
    public void testTaskInput()
    {
        tsk.DeveloperDetails = "Vicky Jannatha";
        tsk.TaskName = "Login Feature";
        tsk.TaskDuration = 5;

    }

    @Test
    public void testCheckTaskDescription()
    {
        tsk.DeveloperDetails = "Vicky jannatha";
        tsk.TaskDescription = "Create Login to authenticate users";

        boolean expected = true;
        boolean actual = tsk.checkTaskDescription();
        assertEquals(expected, actual);

    }

    @Test
    public void testCreateTaskID()
    {
        tsk.TaskName = "Add task Feature";
        tsk.DeveloperDetails = "Vicky jannatha";
        String excepted = this.tsk.TaskName.substring(0, 2) + ":" + this.tsk.TaskNumber + ":" + this.tsk.DeveloperDetails.substring(this.tsk.DeveloperDetails.length() - 3);
        String actual = tsk.createTaskID();
        JOptionPane.showMessageDialog(null, excepted.toUpperCase());
        assertEquals(excepted.toUpperCase(), actual);
    }

    @Test
    public void testReturnTotalHours()
    {

        tsk.numTask = 5;
        
        for (int i = 0; i < tsk.numTask; i++)
        {
            tsk.TaskDuration = 17 ;
            JOptionPane.showMessageDialog(null ,tsk.Hours += tsk.TaskDuration);
            

        }
        tsk.TaskDuration = 4 ;
        int excepted = 89;
        int actual = tsk.returnTotalHours();
        JOptionPane.showMessageDialog(null, excepted);
        assertEquals(excepted, actual);
   
    }
}
