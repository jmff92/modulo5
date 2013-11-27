/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luismiranda
 */
public class DBMS {
    private static Connection conexion;
    
    protected DBMS(){
    }
    
    private static DBMS instance = null;
    
    public static DBMS getInstance(){
        if (null == DBMS.instance){
            DBMS.instance = new DBMS();
        }
        DBMS.conectar();
        return DBMS.instance;
    }
    
    private static boolean conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(null, null, null);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    
}
