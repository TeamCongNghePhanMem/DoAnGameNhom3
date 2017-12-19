/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HT
 */
public class UsersTest {
    
    public UsersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUserID method, of class Users.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        Users instance = new Users();
        long expResult = 0L;
        long result = instance.getUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserID method, of class Users.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        long userID = 0L;
        Users instance = new Users();
        instance.setUserID(userID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserEmail method, of class Users.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getUserEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserEmail method, of class Users.
     */
    @Test
    public void testSetUserEmail() {
        System.out.println("setUserEmail");
        String userEmail = "";
        Users instance = new Users();
        instance.setUserEmail(userEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserPass method, of class Users.
     */
    @Test
    public void testGetUserPass() {
        System.out.println("getUserPass");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getUserPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserPass method, of class Users.
     */
    @Test
    public void testSetUserPass() {
        System.out.println("setUserPass");
        String userPass = "";
        Users instance = new Users();
        instance.setUserPass(userPass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserRole method, of class Users.
     */
    @Test
    public void testIsUserRole() {
        System.out.println("isUserRole");
        Users instance = new Users();
        boolean expResult = false;
        boolean result = instance.isUserRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserRole method, of class Users.
     */
    @Test
    public void testSetUserRole() {
        System.out.println("setUserRole");
        boolean userRole = false;
        Users instance = new Users();
        instance.setUserRole(userRole);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
