/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.BillDetail;
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
public class BillDetailDAOTest {
    
    public BillDetailDAOTest() {
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
     * Test of insertBillDetail method, of class BillDetailDAO.
     */
    @Test
    public void testInsertBillDetail() throws Exception {
        System.out.println("insertBillDetail");
        // thay doi id cua bang chi tiet san pham truoc khi test
        BillDetail bd = new BillDetail(3, 1, 1, 1, 1);
        BillDetailDAO instance = new BillDetailDAO();
        instance.insertBillDetail(bd);
        // TODO review the generated test code and remove the default call to fail.
      
    }

   
    
}
