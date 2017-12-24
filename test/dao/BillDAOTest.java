/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Timestamp;
import java.util.Date;
import model.Bill;
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
public class BillDAOTest {
    
    public BillDAOTest() {
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
     * Test of insertBill method, of class BillDAO.
     */
    @Test
    public void testInsertBill() throws Exception {
        System.out.println("insertBill");
       // thay doi id cua doi tương Bill truoc khi test
        Bill bill = new Bill(3, 0, 0, "s", "s", new Timestamp(new Date().getTime()));
        BillDAO instance = new BillDAO();
        instance.insertBill(bill);
      
    }
  
}
