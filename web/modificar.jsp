<%-- 
    Document   : inicio
    Created on : Nov 25, 2013, 1:35:17 AM
    Author     : luismiranda
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style type="text/css" media="all">
            @import "CSS/system.base.css";
        </style>
        
        <style type="text/css" media="all">
            @import "CSS/field.css";
            @import "CSS/user.css";    
            @import "CSS/views.css";
        </style>
        <style type="text/css" media="all">
            @import "CSS/ckeditor.css";
            @import "CSS/ctools.css";
        </style>

        <style type="text/css" media="all">
            @import "CSS/layout.css";
            @import "CSS/style_interno.css";
            @import "CSS/form.css";
            @import "CSS/colors.css";
        </style>
        <title>Catalogo</title>
    </head>
    <body>
        <h1>Modificar</h1>
        <html:form action="modificar" >
            <table border="0">
                <tbody>
                    <tr>
                        <td> UsbId </td>
                        <td>
                            <bean:write name="Usuario" property="usbid"/>
                        </td>
                    </tr>
                    <tr>
                        <td> Nombres </td>
                        <td>
                            <html:text name="Usuario" property="nombres"/>
                        </td>
                    </tr>
                    <tr>
                        <td> Apellidos </td>
                        <td>
                            <html:text name="Usuario" property="apellidos"/>
                        </td>
                    </tr>
                    <tr>
                        <td> Cedula </td>
                        <td>
                            <html:text name="Usuario" property="cedula"/>
                        </td>
                    </tr>
                    <tr>
                        <td> Correo </td>
                        <td>
                            <html:text name="Usuario" property="correo"/>
                        </td>
                    </tr>
                    <tr>
                        <td> Direccion </td>
                        <td>
                            <html:text name="Usuario" property="direccion"/>
                        </td>
                    </tr>
                    <tr>
                        <td> Telefono fijo </td>
                        <td>
                            <html:text name="Usuario" property="telefono_casa"/>
                        </td>
                    </tr>
                    <tr>
                        <td> Telefono celular</td>
                        <td>
                            <html:text name="Usuario" property="telefono_celular"/>
                        </td>
                    </tr>
                    <tr>
                        <td> Tipo </td>
                        <td>
                            <html:select name="Usuario" property="tipo">
                                <html:option value=""></html:option>
                                <html:option value="estudiante">Estudiante</html:option>
                                <html:option value="profesor">Profesor</html:option>
                                <html:option value="empleado">Empleado</html:option>
                            </html:select>
                        </td>
                    </tr>
                </tbody>
            </table>
            <p>
                
                <html:submit value="modificar"/>
                <html:reset value="limpiar"/>
            </p>
        </html:form>
            
            <html:link action="back">
                <h2>
                    Volver
                </h2>
            </html:link>
    </body>
</html>
