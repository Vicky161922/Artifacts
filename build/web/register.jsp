<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%@include file="navigation.html" %>
<%
    try
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:xe","system","jatin1903");
        PreparedStatement ps=con.prepareStatement("insert into register1 values(?,?,?,?)");
        ps.setString(1,request.getParameter("uname"));
        ps.setString(2,request.getParameter("phno"));
        ps.setString(3,request.getParameter("email"));
        ps.setString(4,request.getParameter("pass"));
        int i=ps.executeUpdate();
        if(i==1)
        {
            response.sendRedirect("welcome1.jsp");
            }
        else{
response.sendRedirect("Sorry.jsp");
}
            
            
        
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    
%>