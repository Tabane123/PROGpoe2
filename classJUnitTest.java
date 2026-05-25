/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Student
 */
public class classJUnitTest {
    
    private POEPartOne poe;   // Your main class instance  
@BeforeEach
    void setUp() {
        poe = new POEPartOne();
    }

    // ====================== USERNAME VALIDATION TESTS ======================
    @Test
    void testValidUsername() {
        assertTrue(isValidUsername("kyl_"), "Username with _ and <=5 chars should be valid");
        assertTrue(isValidUsername("kyle!!!!!!!"), "Valid short username should pass");
    }

    @Test
    void testInvalidUsername() {
        assertFalse(isValidUsername("username"), "No underscore should fail");
        assertFalse(isValidUsername("user_123"), "More than 5 characters should fail");
        assertFalse(isValidUsername(null), "Null should fail");
        assertFalse(isValidUsername(""), "Empty should fail");
    }

    // ====================== PASSWORD VALIDATION TESTS ======================
    @Test
    void testValidPassword() {
        assertTrue(isValidPassword("ch&&sec@ke99!"), "Password with uppercase, number and symbol should pass");
        assertTrue(isValidPassword("password"), "Valid complex password should pass");
    }

    @Test
    void testInvalidPassword() {
        assertFalse(isValidPassword("password"), "No uppercase should fail");
        assertFalse(isValidPassword("Password"), "No special character should fail");
        assertFalse(isValidPassword("Pass123"), "No special character should fail");
        assertFalse(isValidPassword(null), "Null password should fail");
    }

    // ====================== PHONE NUMBER VALIDATION TESTS ======================
    @Test
    void testValidPhoneNumber() {
        assertTrue(isValidPhone(""
                + "277838968976"), "Valid SA number starting with +27 and 9 digits should pass");
        assertTrue(isValidPhone("08966553"), "Another valid number should pass");
    }

    @Test
    void testInvalidPhoneNumber() {
        assertFalse(isValidPhone("071234567"), "Without +27 should fail");
        assertFalse(isValidPhone("+27123456"), "Less than 9 digits after +27 should fail");
        assertFalse(isValidPhone("+27abc12345"), "Non-digits should fail");
        assertFalse(isValidPhone(null), "Null should fail");
    }

    // ====================== LOGIN TESTS ======================
    @Test
    void testSuccessfulLogin() {
        // Simulate stored credentials (you would normally set them after registration)
        String storedUser = "test_1";
        String storedPass = "Test@123";

        assertTrue(loginSuccess(storedUser, storedPass, "test_1", "Test@123"),
                "Correct credentials should login successfully");
    }

    @Test
    void testFailedLogin() {
        String storedUser = "test_1";
        String storedPass = "Test@123";

        assertFalse(loginSuccess(storedUser, storedPass, "test_1", "WrongPass"),
                "Wrong password should fail login");

        assertFalse(loginSuccess(storedUser, storedPass, "wronguser", "Test@123"),
                "Wrong username should fail login");
    }

    // Helper methods to test your logic (since validation is inside loops in main)
    private boolean isValidUsername(String username) {
        if (username == null || username.isEmpty()) return false;
        return username.contains("_") && username.length() <= 5;
    }

    private boolean isValidPassword(String password) {
        if (password == null || password.length() > 8) return false;
        boolean hasUpper = password.matches(".[A-Z].");
        boolean hasNumber = password.matches(".\\d.");
       boolean hasSymbol = password.matches(".*[!@#$%^&()_+\\-=[\\]{};':\"\\\\|,.<>/?].*");
        return hasUpper && hasNumber && hasSymbol;
    }

    private boolean isValidPhone(String phone) {
        if (phone == null) return false;
        return phone.matches("^\\+27\\d{9}$");
    }

    private boolean loginSuccess(String storedUser, String storedPass, String inputUser, String inputPass) {
        return storedUser.equals(inputUser) && storedPass.equals(inputPass);
    }
}
