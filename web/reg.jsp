<%@include file="navigation.jsp" %>
<html>
    <body>
        <br>
        <form action="register.jsp" method="post">
        <%--<form action="yahoo" method="post">--%>
            <table border="0" align="center" cellpadding="10" cellspacing="10" bgcolor="orange">
                <tr>
                    <td>
                        First Name
                    </td>
                    <td>
                        <input type="text" name="fname">
                    </td>
                    <td>
                        Last Name
                    </td>
                    <td>
                        <input type="text" name="lname">
                    </td>
                </tr>
                <tr>
                    <td>
                        Designation
                    </td>
                    <td>
                        <input type="text" name="desig">
                    </td>
                    <td>
                        Department
                    </td>
                    <td>
                        <input type="text" name="dname">
                    </td>
                </tr>
                <tr>
                    <td>
                        Address
                    </td>
                    <td>
                        <input type="text" name="address">
                    </td>
                    <td>
                        City
                    </td>
                    <td>
                        <input type="text" name="city">
                    </td>
                </tr>
                <tr>
                    <td>
                        Pin
                    </td>
                    <td>
                        <input type="text" name="pin">
                    </td>
                    <td>
                        Mobile No
                    </td>
                    <td>
                        <input type="text" name="phno">
                    </td>
                </tr>
                <tr>
                    <td>
                        User Name
                    </td>
                    <td>
                        <input type="text" name="logid">
                    </td>
                    <td>
                        Password
                    </td>
                    <td>
                        <input type="password" name="passwd">
                    </td>
                </tr>
                <tr>
                    <td colspan="4" align="center">
                        <input type="submit" value="REGISTER">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>