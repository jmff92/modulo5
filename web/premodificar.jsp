<%-- 
    Document   : premodificar
    Created on : Nov 29, 2013, 7:18:22 PM
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
        <title>Catalogo</title>
    </head>
    <body>
        <h1>Modificar</h1>
        <html:form action="premodificar" >
            <table border="0">
                <tr>
                    <td> UsbId </td>
                    <td>
                        <html:text name="Usuario" property="usbid"/>
                    </td>
                </tr>
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
