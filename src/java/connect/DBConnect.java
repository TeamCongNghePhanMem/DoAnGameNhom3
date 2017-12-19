/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;
/**
 *
 * @author HT
 */
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");
            //mat khau : VRVtqp96844
            //host: jdbc:mysql://node44986-husshop-nhom5-env-6301857.jelastic.skali.net/shop
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void main(String[] args) {
        System.out.println ("connecdb");
        System.out.println(getConnection()+ " ket qua so 1");
    }
    
}
