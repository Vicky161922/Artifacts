<%@page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<%--
    Calendar cal=new GregorianCalendar();
    int hr=cal.get(Calendar.HOUR);
    int min=cal.get(Calendar.MINUTE);
    int dd=cal.get(Calendar.DATE);
    int mm=cal.get(Calendar.MONTH)+1;
    int yy=cal.get(Calendar.YEAR);
    String today=dd+"-"+mm+"-"+yy;
    String time=hr+":"+min;
    
 --%>
<head>
    
    <center><table>
            <tr>
                <td>
                    <img src="image/museumlogo.jpg" width="60" height="60">
                </td>
                <td colspan="2" align="center">
                    <h1><font color="white"><b>&nbsp;NATIONAL MUSEUM OF ANCIENT HISTORY</b></font></h1>
                </td>
               
                    
            </tr>
        </table>
    </center>
</head>
<body bgcolor="orange">
    
<%--<p align="top "><%out.println(today);%><br><br><%out.println(time);%></p>--%>
    <marquee behavior="alternate">
        <font size="3" color="white">Artifacts Management System</font>
    </marquee>
<%--<p><strong><u><script>

var mydate=new Date()
var year=mydate.getYear()
if (year < 1000)
year+=1900
var day=mydate.getDay()
var month=mydate.getMonth()
var daym=mydate.getDate()
if (daym<10)
daym="0"+daym
var dayarray=new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
var montharray=new Array("January","February","March","April","May","June","July","August","September","October","November","December")
document.write(""+dayarray[day]+", "+montharray[month]+" "+daym+", "+year+"")

</script></u></strong></p>--%>
</body>
