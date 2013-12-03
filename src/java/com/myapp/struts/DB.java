/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author michelle
 */
public class DB {
    
    private String url = "jdbc:postgresql://localhost:5432/sigulab";
    private String bd = "sigulab";
    private String driverPath = "org.postgresql.Driver";
    private String role = "michelle";
    private String password = "pediflor";
    
    
    public Connection conectar() {
        
        Connection conn = null;
        
        try{
            Class.forName(this.driverPath);
            System.out.println("Load of class ok");
        }
        catch(Exception e){
            System.out.println("Can not find the driver");
            System.out.println(e.getMessage());
        }        
        
        try {
            conn = DriverManager.getConnection(this.url, role, password);            
        } catch(Exception e) {
            System.out.println("Problems with the connection to the database");
            System.out.println(e.getMessage());
            System.out.println(url);            
        }
            
        return conn;
    }
    
    public ArrayList<Usuario> consultar(String usbid, String password) {
        
        ArrayList<Usuario> usuarios = new ArrayList();
        
        DB db = new DB();
        Connection conn = db.conectar();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String select = "*";
        String from = "personal";
        String where = " usbid = '" + usbid + "'";
        where += " and password = '" + password + "'";
        
        String query = "select " + select + " from " + from + " where " + where + ";";
        
        try {
            
//            ps = conn.prepareStatement("select * from personal;");
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setNombre(rs.getString("name"));
                usuario.setUsbid(rs.getInt("usbid"));

                usuarios.add(usuario);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
                
        return usuarios;
    }
    
    public static void main(String args[]) {
        
        ArrayList<Usuario> users = new ArrayList<Usuario>();
                
        try {
            
            DB db = new DB();
            Connection conn = db.conectar();
            
            users = db.consultar("09102798", "1234");

            if (users.size() == 0) {
                System.out.println("Usuario inexistente");
            }
            
            for (Usuario u : users) {
                System.out.print(u.getNombre());
                System.out.println();
                System.out.println(u.getUsbid());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
