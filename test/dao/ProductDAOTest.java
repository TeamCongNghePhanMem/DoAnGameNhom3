/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Product;
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
public class ProductDAOTest {
    
    public ProductDAOTest() {
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
     * Test of getListProductByCategory method, of class ProductDAO.
     */
    @Test
    public void testGetListProductByCategory() throws Exception {
        System.out.println("getListProductByCategory");
        long category_id = 0L;
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.getListProductByCategory(category_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduct method, of class ProductDAO.
     */
    @Test
    public void testGetProduct() throws Exception {
        System.out.println("getProduct");
        long productID = 0L;
        ProductDAO instance = new ProductDAO();
        Product expResult = null;
        Product result = instance.getProduct(productID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListProductByNav method, of class ProductDAO.
     */
    @Test
    public void testGetListProductByNav() throws Exception {
        System.out.println("getListProductByNav");
        long categoryID = 0L;
        int firstResult = 0;
        int maxResult = 0;
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.getListProductByNav(categoryID, firstResult, maxResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countProductByCategory method, of class ProductDAO.
     */
    @Test
    public void testCountProductByCategory() throws Exception {
        System.out.println("countProductByCategory");
        long categoryID = 0L;
        ProductDAO instance = new ProductDAO();
        int expResult = 0;
        int result = instance.countProductByCategory(categoryID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ProductDAO.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ProductDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
