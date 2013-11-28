<%-- 
    Document   : eliminar
    Created on : Nov 26, 2013, 7:17:42 AM
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
        <title>Eliminar</title>
    </head>
    <body>
        <h1>Eliminar</h1>
        <html:form action="eliminar">
            <table border="0">
                <tbody>
                    <tr>
                        <td>UsbId</td>
                        <td>
                            <html:text name="Usuario" property="usbid"/>
                        </td>
                    </tr>
                </tbody>
            </table>
                        <p>
                            <html:submit value="eliminar"/>
                        </p>            
        </html:form>
        
        <html:link action="back">
            <h2>
                Volver
            </h2>
        </html:link>
    </body>
</html>
