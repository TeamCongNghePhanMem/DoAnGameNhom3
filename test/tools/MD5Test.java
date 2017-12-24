/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class MD5Test {
    
    public MD5Test() {
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
     * Test of encryption method, of class MD5.
     */
    @Test
    public void testEncryption() {
        System.out.println("encryption");
        String str = "thuong";
        System.out.println ( "input: " + str);
        String expResult = "619170c4d559a0786a141d489d019e22";
        String result = MD5.encryption(str);
        System.out.println ("output: " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
