/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
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
public class CartTest {
    
    public CartTest() {
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
     * Test of getCartItems method, of class Cart.
     */
    @Test
    public void testGetCartItems() {
        System.out.println("getCartItems");
        Cart instance = new Cart();
        HashMap<Long, Item> expResult = null;
        HashMap<Long, Item> result = instance.getCartItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCartItems method, of class Cart.
     */
    @Test
    public void testSetCartItems() {
        System.out.println("setCartItems");
        HashMap<Long, Item> cartItems = null;
        Cart instance = new Cart();
        instance.setCartItems(cartItems);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plusToCart method, of class Cart.
     */
    @Test
    public void testPlusToCart() {
        System.out.println("plusToCart");
        Long key = null;
        Item item = null;
        Cart instance = new Cart();
        instance.plusToCart(key, item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subToCart method, of class Cart.
     */
    @Test
    public void testSubToCart() {
        System.out.println("subToCart");
        Long key = null;
        Item item = null;
        Cart instance = new Cart();
        instance.subToCart(key, item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeToCart method, of class Cart.
     */
    @Test
    public void testRemoveToCart() {
        System.out.println("removeToCart");
        Long key = null;
        Cart instance = new Cart();
        instance.removeToCart(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countItem method, of class Cart.
     */
    @Test
    public void testCountItem() {
        System.out.println("countItem");
        Cart instance = new Cart();
        int expResult = 0;
        int result = instance.countItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalCart method, of class Cart.
     */
    @Test
    public void testTotalCart() {
        System.out.println("totalCart");
        Cart instance = new Cart();
        double expResult = 0.0;
        double result = instance.totalCart();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
