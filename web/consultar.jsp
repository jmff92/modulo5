<%-- 
    Document   : consultar
    Created on : Nov 27, 2013, 12:06:26 AM
    Author     : luismiranda
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar</title>
    </head>
    <body>
        <h1>Consultar</h1>
        
        <table border="0" class="altrowstable" id="alternatecolor">
                <thead>
                    <tr>
                        <th width="155px" align="center">
                            UsbId
                        </th>
                        <th width="155px" align="center">
                            Nombres
                        </th>
                        <th width="155px" align="center">
                            Apellidos
                        </th>
                        <th width="155px" align="center">
                            Cedula
                        </th>
                        <th width="155px" align="center">
                            Correo
                        </th>
                        <th width="155px" align="center">
                            Direccion
                        </th>
                        <th width="155px" align="center">
                            Telefono Casa
                        </th>
                        <th width="155px" align="center">
                            Telefono Celular
                        </th>
                        <th width="155px" align="center">
                            Tipo
                        </th>
                    </tr>
                </thead>

                <logic:iterate name="user" id="Usuario">
                    <tr>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="usbid"/>
                        </td>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="nombres"/>
                        </td>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="apellidos"/>
                        </td>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="cedula"/>
                        </td>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="correo"/>
                        </td>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="direccion"/>
                        </td>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="telefono_casa"/>
                        </td>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="telefono_celular"/>
                        </td>
                        <td width="155px" align="center">
                            <bean:write name="Usuario" property="tipo"/>
                        </td>
                    </tr>
                </logic:iterate>
            </table>
        
        <html:link action="back">
            <h2>
                Volver
            </h2>
        </html:link>
    </body>
</html>
