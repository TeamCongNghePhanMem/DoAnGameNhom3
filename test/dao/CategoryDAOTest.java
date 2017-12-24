/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Category;
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
public class CategoryDAOTest {
    
    public CategoryDAOTest() {
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
     * Test of getListCategory method, of class CategoryDAO.
     */
    @Test
    public void testGetListCategory() throws Exception {
        System.out.println("getListCategory");
        CategoryDAO instance = new CategoryDAO();
        ArrayList<Category> expResult = null;
        ArrayList<Category> result = instance.getListCategory();
        
        if ( result == null ) {
            System.out.println("null");
        }else {
            for (Category i : result) {
                System.out.println(" " + i.getCategoryName());
            }
        }
        
        
    }

    /**
     * Test of insertCategory method, of class CategoryDAO.
     */
    @Test
    public void testInsertCategory() {
        System.out.println("insertCategory");
        Category c = new Category (15, "Ao thoi trang HusShop 15") ;
        CategoryDAO instance = new CategoryDAO();
        boolean expResult = true;
        boolean result = instance.insertCategory(c);
        System.out.println("" + result);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of updateCategory method, of class CategoryDAO.
     */
    @Test
    public void testUpdateCategory() {
        System.out.println("updateCategory");
        Category c = new Category (12,"Husshop");
        CategoryDAO instance = new CategoryDAO();
        boolean expResult = true;
        boolean result = instance.updateCategory(c);
        System.out.println (result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteCategory method, of class CategoryDAO.
     */
    @Test
    public void testDeleteCategory() {
        System.out.println("deleteCategory");
        long category_id = 11;
        CategoryDAO instance = new CategoryDAO();
        boolean expResult = true;
        boolean result = instance.deleteCategory(category_id);
        System.out.println ( result );
        assertEquals(expResult, result);
        
       
    }

    
    
}
