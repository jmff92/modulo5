/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author luismiranda
 */
public class Usuario extends org.apache.struts.action.ActionForm {
    
    private String usbid;
    private String nombres;
    private String apellidos;
    private int cedula;
    private String correo;
    private String direccion;
    private String telefono_casa;
    private String telefono_celular;
    private String tipo;
    
    public void limpiar(){
        usbid = null;
        nombres = null;
        apellidos = null;
        cedula = 0;
        correo = null;
        direccion = null;
        telefono_casa = null;
        telefono_celular = null;
        tipo = null;
    }
    
    /**
     *
     */
    public Usuario() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        return errors;
    }

    /**
     * @return the usbid
     */
    public String getUsbid() {
        return usbid;
    }

    /**
     * @param usbid the usbid to set
     */
    public void setUsbid(String usbid) {
        this.usbid = usbid;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono_casa
     */
    public String getTelefono_casa() {
        return telefono_casa;
    }

    /**
     * @param telefono_casa the telefono_casa to set
     */
    public void setTelefono_casa(String telefono_casa) {
        this.telefono_casa = telefono_casa;
    }

    /**
     * @return the telefono_celular
     */
    public String getTelefono_celular() {
        return telefono_celular;
    }

    /**
     * @param telefono_celular the telefono_celular to set
     */
    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
