<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navigation.jsp" %>


<%
    String abc = session.getAttribute("xyz").toString();
    out.print("<b><center>WELCOME :</b>"+abc+"</center>");
    out.print("<br><br>");
    
%>
<html>
    <head><link rel="stylesheet" type="text/css" href="css/new.css"></head>
    <body>
        <div align="right">
            <a href="logout.jsp"><input type="button" value="logout"></a>
        </div><center>
        <font size="5" color="lightgreen">Download the catalogue from link given below</font>
        <br> <a href="image\catalogue.pdf" download>Download Catalogue</a><br></center>
    </body>
</html>