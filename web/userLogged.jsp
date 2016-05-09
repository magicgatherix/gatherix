<%-- 
    Document   : userLogged
    Created on : 26.04.2016, 09:20:18
    Author     : Dominik
--%>

<%@page import="java.io.IOException"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.File"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="beans.Card"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%!  LinkedList<Card> liCards = new LinkedList<>();%>
        <input type="text" placeholder="Search" onchange="search()">
        <table>
            <%for (Card c : liCards) {%>
            <td>
                <img src = "../IMG/<%=c.getName() + ".jpg"%>">

                <%}%></td>



        </table>
    </body>
</html>
