<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navigation.jsp" %>
<%
    String userid=request.getParameter("uid");
    String passwd=request.getParameter("pwd");
    //out.print("User Name: "+userid);
    //out.print("Password: "+passwd);
    if(userid.equals(passwd))
    {  // response.sendRedirect("welcome.jsp");
        %>
        <jsp:forward page="welcome.jsp"/>
        <%
    }   
    else
        response.sendRedirect("sorry.jsp");
%>
