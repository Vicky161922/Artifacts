<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%@include file="navigation.jsp" %>
<%
    try
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","thunder");
        String user = request.getParameter("uid");
        String pass = request.getParameter("pwd");
        PreparedStatement ps=con.prepareStatement("select fname from login1 where logid=? and passwd=?");
        ps.setString(1,user);
        ps.setString(2,pass);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            session.setAttribute("xyz",rs.getString("fname"));
            response.sendRedirect("welcome.jsp");
        }
        else
        {
            response.sendRedirect("sorry.jsp");
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
%>