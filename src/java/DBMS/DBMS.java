/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBMS;

import Clases.Usuario;
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
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sigulab",
                    "postgres",
                    "qwerty");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean agregarUsuario(Usuario u) {
        
        PreparedStatement psAgregar = null;
        try {
            psAgregar = conexion.prepareStatement(
                    "INSERT INTO USUARIO VALUES (?,?,?,?,?,?,?,?,?);");
            
            psAgregar.setString(1, u.getUsbid());
            psAgregar.setString(2, u.getNombres());
            psAgregar.setString(3, u.getApellidos());
            psAgregar.setInt(4, u.getCedula());
            psAgregar.setString(5, u.getCorreo());
            psAgregar.setString(6, u.getDireccion());
            psAgregar.setString(7, u.getTelefono_casa());
            psAgregar.setString(8, u.getTelefono_celular());
            psAgregar.setString(9, u.getTipo());
                    
            Integer i = psAgregar.executeUpdate();
            
            return i>0;
            
        }catch(SQLException ex){
            ex.printStackTrace();;
            return false;
        }

    }

    public boolean modificarUsuario(Usuario u){
        PreparedStatement psAgregar = null;
        try {
            psAgregar = conexion.prepareStatement(
                    "UPDATE USUARIO SET nombres=? , apellidos=? , cedula=? , correo=? , direccion=? , telefono_casa=? , telefono_celular=? , tipo=? WHERE usbid=?;"
            );
            
            
            psAgregar.setString(1, u.getNombres());
            psAgregar.setString(2, u.getApellidos());
            psAgregar.setInt(3, u.getCedula());
            psAgregar.setString(4, u.getCorreo());
            psAgregar.setString(5, u.getDireccion());
            psAgregar.setString(6, u.getTelefono_casa());
            psAgregar.setString(7, u.getTelefono_celular());
            psAgregar.setString(8, u.getTipo());
            psAgregar.setString(9, u.getUsbid());
            Integer i = psAgregar.executeUpdate();
            
            return i>0;
            
        }catch(SQLException ex){
            ex.printStackTrace();;
            return false;
        }
        
    }
    
    public boolean eliminarUsuario(Usuario u){
        
        PreparedStatement psEliminar = null;
        try {

            psEliminar = conexion.prepareStatement(
                    "DELETE FROM USUARIO WHERE usbid=(?);");
            
            psEliminar.setString(1, u.getUsbid());

            Integer i = psEliminar.executeUpdate();

            return i > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Usuario> listarUsuarios(){
        
        ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
        PreparedStatement ps = null;
        try{
            ps = conexion.prepareStatement("SELECT * FROM USUARIO;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Usuario u = new Usuario();
               
                u.setUsbid(rs.getString("usbid"));
                u.setNombres(rs.getString("nombres"));
                u.setApellidos(rs.getString("apellidos"));
                u.setCedula(rs.getInt("cedula"));
                u.setCorreo(rs.getString("correo"));
                u.setDireccion(rs.getString("direccion"));
                u.setTelefono_casa(rs.getString("telefono_casa"));
                u.setTelefono_celular(rs.getString("telefono_celular"));
                u.setTipo(rs.getString("tipo"));
                
                Usuarios.add(u);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return Usuarios;
    }
    
    public Usuario obtenerUsuario(Usuario u){
        
        PreparedStatement ps = null;
        try{
            ps = conexion.prepareStatement("SELECT * FROM USUARIO WHERE usbid=?;");
            ps.setString(1, u.getUsbid());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
               
                u.setUsbid(rs.getString("usbid"));
                u.setNombres(rs.getString("nombres"));
                u.setApellidos(rs.getString("apellidos"));
                u.setCedula(rs.getInt("cedula"));
                u.setCorreo(rs.getString("correo"));
                u.setDireccion(rs.getString("direccion"));
                u.setTelefono_casa(rs.getString("telefono_casa"));
                u.setTelefono_celular(rs.getString("telefono_celular"));
                u.setTipo(rs.getString("tipo"));
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return u;
    }
    
    public Usuario consultar(Usuario user) {
    
        String usbid = user.getUsbid();
        String password = user.getPassword();
        
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            
            ps = conexion.prepareStatement("SELECT * FROM USUARIO WHERE usbid=?;");
            ps.setString(1, usbid);
            rs = ps.executeQuery();
            
            if (!(rs.next() && (password.equals("1234")))) {
                System.out.println("Usuario inexistente.");
                return null;
            }

            user.setUsbid(usbid);
            user.setPassword(password);
            user.setNombres(rs.getString("nombres"));
            user.setApellidos(rs.getString("apellidos"));
            user.setCedula(rs.getInt("cedula"));
            user.setCorreo(rs.getString("correo"));
            user.setDireccion(rs.getString("direccion"));
            user.setTelefono_casa(rs.getString("telefono_casa"));
            user.setTelefono_celular(rs.getString("telefono_celular"));
            user.setTipo(rs.getString("tipo"));                 
                    
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        
        return user;
        
    }
    
    // Main para pruebas sobre la base de datos.
    public static void main(String args[]) {
        
        Usuario user = new Usuario();
        
        user.setUsbid("10-00000");
        user.setPassword("1234");
                
        try {
            
            DBMS db = DBMS.getInstance();
            user = db.consultar(user);
                        
            System.out.print(user.getNombres());
            System.out.println();
            System.out.println(user.getUsbid());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }        
    
}
