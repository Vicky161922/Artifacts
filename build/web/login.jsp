<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navigation.jsp" %>
<html>
    <head>
        <title>Yahoo</title>
    </head>
        
    <body >
        <br>
        <form name="frm" action="check.jsp" method="post">
            <table border="0" bgcolor="orange"  align="center"  cellpadding="5" cellspacing="5">
                
                <tr>
                    <td>
                        User Name
                    </td>
                    <td>
                        <input type="text" name="uid" placeholder="Name of Employee">
                    </td>
                </tr>
                <tr>
                    <td>
                        Password
                    </td>
                    <td>
                        <input type="password" name="pwd" placeholder="  ">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="login">
                    </td>
                </tr>
                    
            </table>
            </form>
    </body>
</html>
