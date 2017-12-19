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
public class BillDetailTest {
    
    public BillDetailTest() {
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
     * Test of getBillDetailID method, of class BillDetail.
     */
    @Test
    public void testGetBillDetailID() {
        System.out.println("getBillDetailID");
        BillDetail instance = new BillDetail();
        long expResult = 0L;
        long result = instance.getBillDetailID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBillDetailID method, of class BillDetail.
     */
    @Test
    public void testSetBillDetailID() {
        System.out.println("setBillDetailID");
        long billDetailID = 0L;
        BillDetail instance = new BillDetail();
        instance.setBillDetailID(billDetailID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBillID method, of class BillDetail.
     */
    @Test
    public void testGetBillID() {
        System.out.println("getBillID");
        BillDetail instance = new BillDetail();
        long expResult = 0L;
        long result = instance.getBillID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBillID method, of class BillDetail.
     */
    @Test
    public void testSetBillID() {
        System.out.println("setBillID");
        long billID = 0L;
        BillDetail instance = new BillDetail();
        instance.setBillID(billID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductID method, of class BillDetail.
     */
    @Test
    public void testGetProductID() {
        System.out.println("getProductID");
        BillDetail instance = new BillDetail();
        long expResult = 0L;
        long result = instance.getProductID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductID method, of class BillDetail.
     */
    @Test
    public void testSetProductID() {
        System.out.println("setProductID");
        long productID = 0L;
        BillDetail instance = new BillDetail();
        instance.setProductID(productID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class BillDetail.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        BillDetail instance = new BillDetail();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class BillDetail.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        BillDetail instance = new BillDetail();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class BillDetail.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        BillDetail instance = new BillDetail();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class BillDetail.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        BillDetail instance = new BillDetail();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
