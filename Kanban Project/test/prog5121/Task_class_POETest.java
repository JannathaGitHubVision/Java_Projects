/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prog5121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Task_class_POETest
{

    Task_class t3 = new Task_class();

    public Task_class_POETest()
    {
    }

    @Test
    public void testDisplay()
    {
        t3.devDetail = new String[4];
        t3.devDetail[0] = "Mike Smith";
        t3.devDetail[1] = "Edward Harrington";
        t3.devDetail[2] = "Samantha Paulson";
        t3.devDetail[3] = "Glenda Oberholzer";
        t3.numTask = 4;
        t3.status = new String[]
        {
            "Done"
        };
        t3.name = new String[]
        {
            "Create report"
        };
        t3.duration = new int[]
        {
            10
        };
        String show = "";

        for (int i = 0; i < 4; i++)
        {

            show = "The Develoeper :" + " " + t3.devDetail[i];
        }
        boolean excepted = true;
        boolean actual = t3.done();
        assertEquals(excepted, actual);

    }

    @Test
    public void testHighValue()
    {
        t3.numTask = 4;

        t3.devDetail = new String[]
        {
            "Glenda Oberholzer"
        };

        t3.duration = new int[]
        {
            11,10
        };
        int highest = t3.duration[0];
        String show = "";

        for (int i = 0; i < t3.duration.length; i++)
        {
            if (this.t3.duration[i] > highest)
            {
                highest = this.t3.duration[i];
                show = "The Developer : " + this.t3.devDetail[i]
                        + "\n The longest Duration of class : " + t3.duration[i];

            }
        }
        boolean excepted = false;
        boolean actual = t3.highValue();
        assertEquals(excepted, actual);

    }

    @Test
    public void testSearchTask()
    {
        t3.TaskName = "Create login";
        t3.DeveloperDetails = "Mike Smith";
        t3.name = new String[]
        {
            "Create login"
        };
        t3.devDetail = new String[]
        {
            "Mike Smith"
        };
        t3.status = new String[]
        {
            "Done"
        };
        t3.seTsk = "Create login";

        String show = "";
        for (int i = 0; i < t3.name.length; i++)
        {
            show = "The Task name : " + this.t3.name[i]
                    + "\n The Developer : " + this.t3.devDetail[i]
                    + "\n The Task status : " + this.t3.status[i];
        }
        boolean excepted = true;
        boolean actual = t3.searchTask();
        assertEquals(excepted, actual);

    }

    @Test
    public void testSearchdev()
    {
        t3.devDetail = new String[]
        {
            "Samantha Paulson"
        };
        t3.TaskName = "Create report";
        t3.name = new String[]
        {
            "Create report"
        };
        t3.status = new String[]
        {
            "Doing"
        };
        String dis = "";
        t3.seDev = "Samantha Paulson";

        for (int i = 0; i < t3.devDetail.length; i++)
        {
            dis = "The Task name : " + this.t3.name[i]
                    + "\n The Task status : " + this.t3.status[i];
        }
        boolean excepted = true;
        boolean actual = t3.searchDev();
        assertEquals(excepted, actual);
    }

    @Test
    public void testDelete()
    {
        t3.name = new String[]
        {
            "Create Reports"
        };
        t3.Del = "Create Reports";
        String show = "";
        List<String> list = new ArrayList<>(Arrays.asList(this.t3.name));
        list.remove(this.t3.Del);

        show = "Successfully deleted the task : " + " " + this.t3.Del;
        JOptionPane.showMessageDialog(null, show);

        boolean excepted = true;
        boolean actual = t3.deleteTsk();
        assertEquals(excepted, actual);

    }

    @Test
    public void testReport()
    {

        t3.name = new String[]
        {
            "Create report"
        };
        t3.devDetail = new String[]
        {
            "Samantha Paulson"
        };
        t3.duration = new int[]
        {
            10
        };
        t3.status = new String[]
        {
            "Done"
        };
        t3.id = new String[]
        {
            "CR:1:SON"
        };
        t3.numTask = 1;
        String rep = "";
        for (int v = 0; v < t3.numTask; v++)
        {
            rep = "This Task name : " + "\t" + this.t3.name[v]
                    + "\n The developer name : " + "\t" + this.t3.devDetail[v]
                    + "\n The TaskID : " + "\t" + this.t3.id[v]
                    + "\n The Task duration : " + "\t" + this.t3.duration[v]
                    + "\n The Task status : " + "\t" + this.t3.status[v];

        }
        boolean excepted = true;
        boolean actual = t3.report();
        assertEquals(excepted, actual);

    }

}
