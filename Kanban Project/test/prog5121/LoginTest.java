
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prog5121;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest
{

    public LoginTest()
    {

    }

    Login log = new Login();

    @Test
    public void testCheckUsername()
    {
        log.firstname = "vicky";
        log.lastname = "Jannatha";
         log.username = "kyl_1";
         
        boolean excepted = true;
        boolean actual = log.checkUsername();
        assertTrue(actual);

    }

    @Test
    public void testCheckDigitComplexity()
    {
        log.firstname = "vicky";
        log.lastname = "Jannatha";
         log.password = "Ch&&sec@ke99!";
         
        boolean excepted = true;
        boolean actual = log.CheckDigitComplexity(log.password);
        assertEquals(excepted, actual);
        
        
    }

    @Test
    public void testCheckSpecialCharacter()
    {
        log.firstname = "vicky";
        log.lastname = "Jannatha";
    }

    @Test
    public void testCheckCaptialLetters()
    {
        log.firstname = "vicky";
        log.lastname = "Jannatha";
    }

    @Test
    public void testCheckPasswordComplexity()
    {
        log.firstname = "vicky";
        log.lastname = "Jannatha";
        log.password = "Ch&&sec@ke99!";

        
        boolean excepted = true;
        boolean actual = log.checkPasswordComplexity();
        assertEquals(excepted, actual);
    }

    @Test
    public void testRegisterUser()
    {
        log.firstname = "vicky";
        log.lastname = "Jannatha";
        
        log.username = "kyl_1";
        log.password = "Ch&&sec@ke99!";
        String excepted = "Username and Password successfully registered";
        String actual = log.registerUserTest();
        assertEquals(excepted, actual);

    }

    @Test
    public void testLoginUser()
    {
        log.firstname = "vicky";
        log.lastname = "Jannatha";
    }

    @Test
    public void testReturnLoginStatus()
    {
        log.firstname = "vicky";
        log.lastname = "Jannatha";
        
        
        
    }

}
