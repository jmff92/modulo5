<%-- 
    Document   : indice
    Created on : Nov 26, 2013, 1:44:02 PM
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
        <h1>Personal</h1>
        <html:link action="agregarL">
            <h2>
                Agregar
            </h2>
        </html:link>
        <html:link action="eliminarL">
            <h2>
                Eliminar
            </h2>
        </html:link>
        <html:link action="consultarL">
            <h2>
                Consultar
            </h2>
        </html:link>
        <html:link action="modificarL">
            <h2>
                Modificar
            </h2>
        </html:link>
    </body>
</html>
