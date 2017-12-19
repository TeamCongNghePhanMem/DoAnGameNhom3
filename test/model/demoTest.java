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
public class demoTest {
    
    public demoTest() {
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
     * Test of binhphuong method, of class demo.
     */
    @Test
    public void testBinhphuong() {
        System.out.println("binhphuong");
        demo instance = new demo();
        int expResult = 5;
        int result = instance.binhphuong();
        assertEquals(expResult, result);
       
    }
    
}
