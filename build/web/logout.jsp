<%-- 
    Document   : logout
    Created on : Jun 28, 2016, 11:35:22 AM
    Author     : PRASHANT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navigation.jsp" %>
<%
    session.removeAttribute("xyz");
    response.sendRedirect("login.jsp");
%>
