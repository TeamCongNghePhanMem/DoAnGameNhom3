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
 * @author Administrator
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
     * @throws java.lang.Exception
     */
    @Test
    public void testGetListProductByCategory() throws Exception {
        System.out.println("getListProductByCategory");
        long category_id = 1;
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.getListProductByCategory(category_id);
        if ( result != null)      
        {
           
           for (Product i : result) {
               System.out.println (i.getProductID());
                System.out.println ( i.getProductName());
            }
        }    
            else {
            System.out.print("null");
        }
        
        
        
    }

    /**
     * Test of getProduct method, of class ProductDAO.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetProduct() throws Exception {
        System.out.println("getProduct");
        long productID = 1;
        ProductDAO instance = new ProductDAO();
        int expResult = 1;
        Product result = instance.getProduct(productID);
        System.out.println (result.getProductID());
        assertEquals(expResult, result.getProductID());
      
    }

    /**
     * Test of getListProductByNav method, of class ProductDAO.
     */
    @Test
    public void testGetListProductByNav() throws Exception {
        System.out.println("getListProductByNav");
        long categoryID = 1;
        int firstResult = 2;
        int maxResult = 4;
        ProductDAO instance = new ProductDAO();
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.getListProductByNav(categoryID, firstResult, maxResult);
        
        
        if ( result != null) {
        for ( Product i : result) {
            System.out.println("" + i.getProductName());
        }
        }else {
            System.out.println ("null");
        }
  
        
    }

    /**
     * Test of countProductByCategory method, of class ProductDAO.
     */
    @Test
    public void testCountProductByCategory() throws Exception {
        System.out.println("countProductByCategory");
        long categoryID = 1;
        ProductDAO instance = new ProductDAO();
        int expResult = 11;
        int result = instance.countProductByCategory(categoryID);
        assertEquals(expResult, result);
       
    }

}
